package org.example.socket;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RequestResponseTask implements Runnable {
    private static final String DOC_BASH = "D:\\Git\\temp\\http-project2";
    private final Socket accept;
    private static final Map<String, String> mimeTypeMap = new HashMap<>();

    static {
        mimeTypeMap.put("txt", "text/plain");
        mimeTypeMap.put("html", "text/html");
        mimeTypeMap.put("js", "application/javascript");
    }

    public RequestResponseTask(Socket socket) {
        accept = socket;
    }

    public void run() {
        try {
            InputStream inputStream = accept.getInputStream();
            Scanner scanner = new Scanner(inputStream, "UTF-8");
            scanner.next();
            String path = scanner.next();
            String filePath = DOC_BASH + path;
            // 1. 判断该文件是否存在
            File resourse = new File(filePath);
            if (resourse.exists()) {
                OutputStream outputStream = accept.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                String contentType = "text/plain";
                if (path.contains(".")) {
                    int i = path.lastIndexOf(".");
                    String substring = path.substring(i + 1);
                    contentType = mimeTypeMap.getOrDefault(substring, contentType);
                }
                if (contentType.startsWith("text/")) {
                    contentType = contentType + ";charset=utf-8";
                }
                // 谐响应
                // 写响应行
                printWriter.println("HTTP/1.0 200 OK");
                // 写响应头
                printWriter.printf("Content-Type: %s\n", contentType);
                // 空行
                printWriter.println();

                try (InputStream resourseInputStream = new FileInputStream(resourse)) {
                    byte[] buffer = new byte[1024];
                    while (true) {
                        int len = resourseInputStream.read(buffer);
                        if (len == -1) {
                            break;
                        }
                        outputStream.write(buffer, 0, len);
                    }
                    outputStream.flush();
                }

                // 写响应体， html内容
                printWriter.println("<h1>我是服务器，给你消息<h1>");
                printWriter.flush();
            } else {
                OutputStream outputStream = accept.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                printWriter.println("HTTP/1.0 400 Not Found");
                printWriter.println("Content-Type: text/html;charset=utf-8");
                printWriter.println();
                printWriter.printf("<h1>%s 找不到资源\n", path);

                printWriter.flush();

            }

        } catch (IOException e) {
            // 因为单次请求响应周期错误，不影响其他的
            e.printStackTrace(System.out);
        } finally {
            try {
                accept.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
