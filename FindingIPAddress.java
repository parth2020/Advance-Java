/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NETWORKING;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Admin
 */
public class FindingIPAddress 
{
    public static void main(String args[]) throws UnknownHostException
    {
        InetAddress ia = InetAddress.getByName("www.marwadiuniversity.ac.in");
        
        System.out.println(ia);
        
    }
    
}
