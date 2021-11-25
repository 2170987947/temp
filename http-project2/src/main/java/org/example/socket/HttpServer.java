package org.example.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HttpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            Scanner scanner = new Scanner(inputStream, "UTF-8");

            OutputStream outputStream = accept.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);
            // 谐响应
            // 写响应行
            printWriter.println("HTTP/1.0 200 OK");
            // 写响应头
            printWriter.println("Content-Type: text/html; charset=utf-8\r");
            // 空行
            printWriter.println();
            // 写响应体， html内容
            printWriter.println("<我是服务器，给你消息>");
            printWriter.flush();


            String line = scanner.nextLine();
            System.out.println(line);

            accept.close();
        }

    }
}
