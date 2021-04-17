package org.example.util;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/15 10:16
 */

import org.example.model.DocInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 步骤一:
 * 从本地 api 目录, 遍历静态 html 文件
 * 每个 html 需要构建正文索引: 本地某个文件
 * 正文索引信息 list<DocInfo>
 * DocInfo (id, title, content, url)
 */
public class Parser {
    public static final String API_PATH = "D:\\jdkAPI\\jdk-8u281-docs-all\\docs\\api";
    public static final String OUTPUT_PATH = "D:\\jdkAPI\\target\\ww.txt";
    public static final String API_BATH_PATH = "https://docs.oracle.com/javase/8/docs/api/";

    public static void main(String[] args) throws IOException {
        List<File> htmls = listhtml(new File(API_PATH));
        FileWriter fileWriter = new FileWriter(OUTPUT_PATH);
        PrintWriter printWriter = new PrintWriter(fileWriter, true); // 自动刷新
//        for (File html : htmls) {
//            System.out.println(html.getAbsolutePath());
//        }
        for (File html : htmls) {
            DocInfo doc = perseHtml(html);
            System.out.println(doc);
//            String uri = html.getAbsolutePath().substring(API_PATH.length());
//            System.out.println("Parse: " + uri);
            printWriter.println(doc.getTitle() + "\3" + doc.getUrl() + "\3" + doc.getContent() + "\n");
        }
    }

    private static DocInfo perseHtml(File html) {
        DocInfo doc = new DocInfo();
        doc.setTitle(html.getName().substring(0, html.getName().length() - ".html".length()));
        String uri = html.getAbsolutePath().substring(API_PATH.length());
//        System.out.println(uri);
        doc.setUrl(API_BATH_PATH + uri);
        doc.setContent(parseContent(html));
        return doc;
    }

    private static String parseContent(File html) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(html);
            int i;
            boolean isContent = false;
            while ((i = fileReader.read()) != -1) {
                char c = (char) i;
                if (isContent) {
                    if (c == '<') {
                        isContent = false;
                        continue;
                    } else if (c == '\n' || c == '\r') {
                        stringBuilder.append(" ");
                    } else {
                        stringBuilder.append(c);
                    }
                } else if (c == '>') {
                    isContent = true;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString().trim();
    }

    private static List<File> listhtml(File dir) {
        List<File> list = new ArrayList<>();
        File[] children = dir.listFiles();
        for (File child : children) {
            if (child.isDirectory()) {
                list.addAll(listhtml(child));
            } else if (child.getName().endsWith(".html")) {
                list.add(child);
            }
        }
        return list;
    }
}
