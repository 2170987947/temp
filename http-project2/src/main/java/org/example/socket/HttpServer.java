package org.example.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 基本都是队列长度无限长，如果任务处理的慢，会导致都堆积在队列中，
        // 而对队列在内存中，会导致内存被消耗完
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            Socket accept = serverSocket.accept();
            Runnable task = new RequestResponseTask(accept);
            threadPool.execute(task);
        }

    }
}
