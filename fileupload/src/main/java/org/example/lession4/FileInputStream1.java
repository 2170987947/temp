package org.example.lession4;

import java.io.*;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/7 21:29
 */
public class FileInputStream1 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("E:\\java_cod11\\file\\demo.txt");
        FileOutputStream out = new FileOutputStream("E:\\CloudMusic\\fmm.txt");
        int length = 0;
        byte[]  buff = new byte[1024];
        while ((length = file.read(buff)) != -1) {
            out.write(buff, 0, length);
        }
        out.flush();
        out.close();
        file.close();
    }
}
