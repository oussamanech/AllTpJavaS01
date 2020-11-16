package com.lab2.lab6UDP;

import java.net.*;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    Scanner scanner=null;
    DatagramSocket socket=null;
    byte[] buffer =null;
    
    public void initialezVar(){
        try {
           scanner = new Scanner(System.in);
           socket = new DatagramSocket();
        } catch (Exception e) {
            System.out.println("initialezVar : "+ e.toString());
        }
    }
    private String readScanner(){
        return scanner.nextLine();
    }
    private void send(String mesg){
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
           // System.out.println("IP : " + inetAddress);
            buffer=mesg.getBytes();
            
            DatagramPacket packetSend = new DatagramPacket(buffer,buffer.length,inetAddress,Const.Port);
            socket.send(packetSend);
            
        } catch (Exception e) {
            System.out.println("send : "+ e.toString());
        }
      }
    
    private void connecting(){
        while (true) {            
           String line = readScanner();
           send(line);
            if(line.equalsIgnoreCase(Const.STOP)){
            break;
            }
        }
    }
    

// ---------------- Main -----------------------
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP : " + ip);
        }catch(Exception e){
            System.out.println("Error : " + e.toString());
        }
        
        Client client=new Client();
        client.initialezVar();
        client.connecting();
        
    }
    
}
