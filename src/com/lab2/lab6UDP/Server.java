
package com.lab2.lab6UDP;

import java.net.*;

public class Server {
    
    DatagramSocket socket=null;
    byte[] recieverBuffer = null;
    DatagramPacket recieverPacket =null;
    
    private void initialezVar(){
        try {
            socket = new DatagramSocket(Const.Port);
            recieverBuffer = new byte[Const.BUFFER_SIZE];
        } catch (Exception e) {
            System.out.println("initialezVar : "+e.toString());
        }
    }
    
    private String RecieveData(){
        String line = "";
        try {
            recieverPacket =  new DatagramPacket(recieverBuffer, recieverBuffer.length);
            socket.receive(recieverPacket);
            line = new String(recieverPacket.getData(),0,recieverPacket.getLength());
        } catch (Exception e) {
             System.out.println("RecieveData : "+e.toString());
        }
        return line;
    }
    
    private void connecting(){
        while (true) {            
            String data = RecieveData();
            System.out.println("Client : " + data);
            if(data.equalsIgnoreCase(Const.STOP)){
             System.out.println("Client Say bye .... Exiting");   
            break;
            }
            
            recieverBuffer= new byte[Const.BUFFER_SIZE];
            
        }
    }
    
    public static void main(String[] args) {
        Server server = new Server();
        server.initialezVar();
        server.connecting();
    }
    
}
