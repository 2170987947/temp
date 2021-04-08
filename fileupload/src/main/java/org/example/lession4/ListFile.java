package org.example.lession4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/7 20:58
 */
public class ListFile {

    public static void main(String[] args) {
        File dir = new File("E:\\java_cod11\\file");
        List<File> files = listDir(dir);
        files.stream().forEach(System.out:: println);
    }

    public static List<File> listDir(File dir) {
        List<File> list = new ArrayList<>();
//        if (dir.isFile()) {
//            list.add(dir);
//        } else if (dir.isDirectory()) {
//            File[] children = dir.listFiles();
//            if (children != null) {
//                for (File child: children) {
//                    List<File> files = listDir(child);
//                    list.addAll(files);
//                }
//            }
//        }
//        if (dir.isDirectory()) {
        File[] children = dir.listFiles();
        if (children != null) {
            for (File child : children) {
                if (child.isDirectory()) {
                    list.addAll(listDir(child));
                }
                else {
                    list.add(child);
                }
            }
        }
//        }
        return list;
    }
}
