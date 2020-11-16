package com.lab2.lab7TCP;

import java.net.*;

    public class Server extends Thread {
        ServerSocket serverSocket; // Определяется переменная serverSocket
        public Server() {
        try {
        /*
        * Создание объекта ServerSocket, который принимает запросы
        * соединения от клиентов от порта 1001
        */
        serverSocket = new ServerSocket(1001);
        System.out.println(serverSocket.toString());
        } catch (Exception e) {
        fail(e, "Could not start server.");
        }
        System.out.println("Server is running . . .");
        /* Стартует поток */
        this.start();
        }
        public static void fail(Exception e, String str) {
        System.out.println(str + "." + e);
        }
        public void run() {
        try {
        while (true) {
        /* Принимаются запросы от клиентов */
        Socket client = serverSocket.accept();
        /*
        * Создается объект соединение, чтобы управлять взаимодействием
        * клиента с сервером
        */
        Connection con = new Connection(client);
        }
        } catch (Exception e) {
        fail(e, "Not listening");
        }
        }
        public static void main(String args[]) {
        /* Запускается сервер */
        new Server();
}
    }
