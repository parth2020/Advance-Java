/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NETWORKING;

import com.sun.org.apache.xerces.internal.util.URI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Admin
 */
public class DownloadSiteContent 
{
    public static void main(String args[]) throws Exception
    {
        URL url;
        
        try {
            url = new URL("https://www.google.com");
            URLConnection conn = url.openConnection();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            String inputLines;
            
            String fileName = "D:/parth.html";
            File file = new File(fileName);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            while ((inputLines = br.readLine()) != null){
                bw.write(inputLines);
            }
            
            bw.close();
            br.close();
            
            System.out.println("Done");
            
        } catch (URI.MalformedURIException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
    
}
