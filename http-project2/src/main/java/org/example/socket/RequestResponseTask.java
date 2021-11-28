package org.example.socket;

import java.io.*;
import java.net.Socket;

public class RequestResponseTask implements Runnable {
    private final Socket accept;

    public RequestResponseTask(Socket socket) {
        accept = socket;
    }

    public void run() {
        try {
            OutputStream outputStream = accept.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);

            Thread.sleep(10000);
            // 谐响应
            // 写响应行
            printWriter.println("HTTP/1.0 200 OK");
            // 写响应头
            printWriter.println("Content-Type: text/html; charset=utf-8\r");
            // 空行
            printWriter.println();
            // 写响应体， html内容
            printWriter.println("<h1>我是服务器，给你消息<h1>");
            printWriter.flush();

        } catch (IOException e) {
            // 因为单次请求响应周期错误，不影响其他的
            e.printStackTrace(System.out);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                accept.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
