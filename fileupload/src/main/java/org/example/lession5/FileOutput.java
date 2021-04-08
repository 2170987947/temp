package org.example.lession5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/8 11:59
 */
public class FileOutput {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\bit\\1.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter bw = new PrintWriter(new FileWriter(file));
        bw.write("樊茂茂");
        for (int i = 'a'; i <= 'z'; i++) {
            bw.write((char) i);
            bw.print((char) i);
        }
        bw.flush();
        bw.close();
    }
}
