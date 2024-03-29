package org.example.pratice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 监听 8080 端口
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            // 已经代表建立好的一条TCP连接（三次握手完成）
            Socket accept = serverSocket.accept();
            // 字节方式处理
            // 接收数据到inputStream.
            InputStream inputStream = accept.getInputStream();
            Scanner scanner = new Scanner(inputStream, "UTF-8");
            String line = scanner.nextLine();
            System.out.println(line);
            // 将数据写到outputStream， 经过OS内部的TCP机制将数据发给客户端
            OutputStream outputStream = accept.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.println("给你一条消息!");
            printWriter.flush();
            // 四次挥手
            accept.close();
        }
    }
}
