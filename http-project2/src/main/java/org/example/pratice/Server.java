package org.example.pratice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 监听 8080 端口
        ServerSocket serverSocket = new ServerSocket(8080);
        Thread.sleep(1000000);
        // 已经代表建立好的一条TCP连接（三次握手完成）
        Socket accept = serverSocket.accept();
    }
}
