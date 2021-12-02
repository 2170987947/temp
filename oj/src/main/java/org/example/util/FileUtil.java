package org.example.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
    // 从指定文件中把所有内容读出来
    public static String readFile(String filePath) {
        StringBuilder stringBuilder = new StringBuilder();
        try(FileInputStream fileInputStream = new FileInputStream(filePath)) {
            while (true) {
                int c = fileInputStream.read();
                if (c == -1) {
                    break;
                }
                stringBuilder.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    // 把 content 中的内容一次写入到 filePath 对应的文件中
    public static void writeFile(String filePath, String content) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
