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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerChat {
   
    public static void main(String[] args) throws IOException{
       
        ServerSocket sersock = new ServerSocket(3000);
        System.out.println("Server Ready FOr chatting");
        Socket sock = sersock.accept();
       
        Scanner sc = new Scanner (System.in);
       
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);
       
        InputStream istream = sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
       
        String receiveMessage, sendMessage = null;
        while(true)
        {
            if((receiveMessage = receiveRead.readLine()) != null)
            {
                System.out.println(receiveMessage);
            }
            sendMessage = sc.nextLine();
            pwrite.println(sendMessage);
            pwrite.flush();
        }
       
    }
   
}