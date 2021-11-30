package org.example.socket;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RequestResponseTask implements Runnable {
    private static final String DOC_BASH = "D:\\Git\\temp\\http-project2\\DocBase";
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
            // 读取 Http 版本信息
            scanner.nextLine();

            String requestURI = path;
            String queryString = "";
            if (path.contains("?")) {
                int i = path.indexOf("?");
                requestURI = path.substring(0, i);
                queryString = path.substring(i + 1);
            }
            System.out.println(requestURI);

            Map<String, String> hearders = new HashMap<>();
            String headerLine;
            while (scanner.hasNextLine() && !((headerLine = scanner.nextLine()).isEmpty())) {
                String[] part = headerLine.split(":");
                String name = part[0].trim().toLowerCase();
                String value = part[1].trim();

                hearders.put(name, value);
            }

            if (requestURI.equals("/")) {
                requestURI = "/index.html";
            }

            if (requestURI.equals("/profile")) {
                OutputStream outputStream = accept.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                String username = null;
                // 从 Cookie 中获取 username， 从请求中获取
                String cookie = hearders.getOrDefault("cookie", "");
                System.out.println(cookie);

                printWriter.println("HTTP/1.0 200 OK");
                printWriter.println("Content-Type: text/html; charset=utf-8");
                printWriter.println();
                if (username != null) {
                    printWriter.printf("<h1>当前用户是： %s<h1>", username);
                } else {
                    printWriter.println("<h1>您需要先登录<h1>");
                }

                printWriter.flush();
            }
            if (requestURI.equals("/redirect-to")) {
                OutputStream outputStream = accept.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                printWriter.println("HTTP/1.0 307 Temporary Redirect");
                printWriter.println("Location: /hello.jpg");
                printWriter.println();

                printWriter.flush();

            } else if (requestURI.equals("/goodbye.html")) {
                OutputStream outputStream = accept.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                String target = "";
                for (String keyValue: queryString.split("&")) {
                    if (keyValue.isEmpty()) {
                        continue;
                    }
                    String[] part = keyValue.split("=");
                    String key = URLDecoder.decode(part[0], "UTF-8");;
                    String value = URLDecoder.decode(part[1], "UTF-8");;
                    if (key.equals("target")) {
                        target = value;
                    }
                }

                printWriter.println("HTTP/1.0 200 OK");
                printWriter.println("Content-Type: text/html;charset=utf-8");
                printWriter.println();
                printWriter.printf("<h1>%s 再见 %s\n", requestURI, target);

                printWriter.flush();
            } else {
                // 静态资源
                String filePath = DOC_BASH + requestURI;
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
