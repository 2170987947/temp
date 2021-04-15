package org.example.util;

import org.example.model.DocInfo;
import org.example.model.Weight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/15 15:02
 */
public class Index {

    private static final List<DocInfo> FORWARD_INDEX = new ArrayList<>();

    private static final Map<String , List<Weight>> INVERTED_INDEX = new HashMap<>();

    public static void buildForwardIndex() {
        try {
            FileReader fileReader = new FileReader(Parser.OUTPUT_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int id = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                DocInfo doc = new DocInfo();
                doc.setId(++id);
                String[] parts = line.split("\3");
                doc.setTitle(parts[0]);
                doc.setUrl(parts[1]);
                doc.setContent(parts[2]);
                FORWARD_INDEX.add(doc);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void buildInvertedIndex() {
        for (DocInfo doc : FORWARD_INDEX) {
            
        }
    }
    public static void main(String[] args) {
        Index.buildForwardIndex();
        FORWARD_INDEX.stream()
                .forEach(System.out:: println);
    }
}
