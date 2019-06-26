/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NETWORKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClientFile 
{
    public static void main(String args[]) throws IOException
    {
        Scanner s = new Scanner(System.in);
        Socket sock = new Socket("127.0.0.1",1234);
       
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
       
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite =  new PrintWriter(ostream, true);
       
        InputStream istream = sock.getInputStream();
        BufferedReader recieveRead = new BufferedReader(new InputStreamReader(istream));
       
        String recieveMessage, sendMessage;
        while(true)
        {
//            recieveMessage = keyRead.readLine();
            String sen=s.nextLine();
            pwrite.println(sen);
            pwrite.flush();
            /*if((sendMessage = recieveRead.readLine()) != null)
            {
                System.out.println("Server: "+sendMessage);
            }*/
        }
    }
    
}
