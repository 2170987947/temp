package org.example.lession5;

import java.io.*;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/8 11:02
 */
public class FileInput {

    public static void main(String[] args) throws IOException {
//        File file = new File("E:\\file\\demo.txt");
//        FileInputStream fis = new FileInputStream(file);
//        FileOutputStream out = new FileOutputStream("E:\\bit\\211.txt");
        // 1. 文件的字节输入流
//        byte[] buff = new byte[1024];
//        int len = 0;
//        while ((len = fis.read(buff)) != -1) {
//            String str = new String(buff, 0, len); // 模拟
//            System.out.println(str);
//            out.write(buff, 0, len);
//        }
//        out.flush();
//        out.close();
//        fis.close();

        // 2. 文件的字符输入流
//        FileReader in = new FileReader(file);
//        FileWriter ot = new FileWriter("E:\\bit\\211.txt");
//        char[] chars = new char[1024];
//        int len = 0;
//        while ((len = in.read(chars)) != -1) {
//            ot.write(chars, 0, len);
//        }
//        ot.flush();
//        ot.close();
//        in.close();

        // 3. 缓冲流: 缓冲字节输入, 缓冲的字符输入
//        FileInputStream fis = new FileInputStream(file); // 文件字节流
//        InputStreamReader isr = new InputStreamReader(fis); // 字节流转字符流, 一定要使用字节流转换字符流, 并且可以设置编码
//        // 3.1 缓冲的字符输入流
//        BufferedReader br = new BufferedReader(isr);
//        String str;
//        while ((str = br.readLine()) != null) {
//            System.out.println(str);
//        }
//        br.close();
//        isr.close();
//        fis.close();

//        FileInputStream fis = new FileInputStream(file); // 文件字节流
//        FileOutputStream fos = new FileOutputStream("E:\\bit\\211.txt");
//        // 3.2 缓冲的字节输入流
//        BufferedInputStream bis = new BufferedInputStream(fis);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        int len = 0;
//        byte[] buff = new byte[1024];
//        while ((len = bis.read(buff)) != -1) {
//            bos.write(buff, 0, len);
//        }
//        bos.flush();
////        bos.close();
////        bis.close();
//        fos.flush();
////        fos.close();
////        fis.close();

    }
}
