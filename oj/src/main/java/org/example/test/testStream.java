package org.example.test;

import java.io.FileInputStream;
import java.io.IOException;

public class testStream {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("E:/text.txt");
//        String s = "Hello";
//        fileOutputStream.write(s.getBytes());
//        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("E:/text.txt");
        while (true) {
            int c = fileInputStream.read();
            if (c == -1) {
                break;
            }
            System.out.println((byte)c);
        }

    }
}
