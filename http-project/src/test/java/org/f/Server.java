package org.f;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/26 20:28
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("有一条 TCP 连接已经建立");
            InputStream inputStream = socket.getInputStream();
            Scanner in = new Scanner(inputStream, "UTF-8");
            String line = in.nextLine();
            System.out.println(line);

            OutputStream outputStream = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.println("今天的项目很难");
            printWriter.flush();

            socket.close();
        }
    }
}
