package org.f;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/26 20:28
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream);

        OutputStream outputStream = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println("你好, 我是中国人");
        printWriter.flush();
        String message = scanner.nextLine();
        System.out.println(message);
        socket.close();
    }
}
