package org.example.lession4;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/7 20:00
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
        String path = "E:\\java_cod11\\file\\";
        String name = "demo.txt";
        String pathname = path + name;
        File file = new File(pathname);
        File pfinle = file.getParentFile();
        if (!pfinle.exists()) {
            pfinle.mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
//        System.out.println(file.getName());
//        System.out.println(file.exists());
//        System.out.println(file.canWrite());
//        System.out.println(file.createNewFile());
//        System.out.println(file.getParent());
//        System.out.println(file.getParentFile());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalFile());
        System.out.println(file.lastModified());
        System.out.println(file.length());
        System.out.println(Arrays.toString(pfinle.listFiles()));
        boolean res = file.exists();
        System.out.println("文件" + pathname + "是否存在: " + res);
        System.out.println("文件 " + name + "最近修改时间: " + new
                Date(file.lastModified()));

    }
}
