package org.example.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            Socket accept = serverSocket.accept();
            Runnable task = new RequestResponseTask(accept);
            new Thread(task).start();
        }

    }
}
