package org.example.lession5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/8 11:59
 */
public class FileCopy {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\bit\\1.C语言\\初级\\github注册手册.pdf");
        File out = new File("E:\\file\\sas.pdf");
        if (!out.exists()) {
            out.createNewFile();
        }
        FileInputStream fis = new FileInputStream(file);
        long start = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream(out);
        byte[] buff = new byte[1024];
        int len = 0;
        while ((len = fis.read(buff)) != -1) {
            fos.write(buff, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println((start - end));
        fos.flush();
        fos.close();
        fis.close();
        // 缓冲的字节输入流,
    }
}
