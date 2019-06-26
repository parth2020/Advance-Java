/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NETWORKING;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import oracle.jrockit.jfr.VMJFR;

/**
 *
 * @author Admin
 */
public class ServerFile 
{
    public static void main(String a[]) throws IOException
    {
    ServerSocket sersock = new ServerSocket(1234);
        System.out.println("Server Ready For Chatting");
        Socket sock = sersock.accept();
       
        //Scanner sc = new Scanner (System.in);
     
        
        InputStream istream = sock.getInputStream();
        BufferedReader fileRead = new BufferedReader(new InputStreamReader(istream));
        
        String fname = fileRead.readLine();
        
        BufferedReader contentRead = new BufferedReader(new FileReader("D:/"+fname));
        
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);
        
        String str;
        
        while((str = contentRead.readLine()) != null)
                {
                    System.out.println(str);
                }        
        
        sock.close();
        pwrite.close();

}
    }
