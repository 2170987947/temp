package org.example.util;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.example.model.DocInfo;
import org.example.model.Weight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

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
            Map<String, Weight> map = new HashMap<>();
            List<Term> titlesFenci = ToAnalysis.parse(doc.getTitle()).getTerms();
            for (Term titleFenci : titlesFenci) {
                Weight weight = map.get(titleFenci.getName());
                if (weight == null) {
                    weight = new Weight();
                    weight.setDoc(doc);
                    weight.setKeyword(titleFenci.getName());
                    map.put(titleFenci.getName(), weight);
                }
                weight.setWeight(weight.getWeight() + 10);
            }
            List<Term> contentFencis = ToAnalysis.parse(doc.getContent()).getTerms();
            for (Term contentFenci : contentFencis) {
                Weight weight = map.get(contentFenci.getName());
                if (weight == null) {
                    weight = new Weight();
                    weight.setDoc(doc);
                    weight.setKeyword(contentFenci.getName());
                    map.put(contentFenci.getName(), weight);
                }
                weight.setWeight(weight.getWeight() + 1);
            }
            for (Map.Entry<String, Weight> entry : map.entrySet()) {
                String keyword = entry.getKey();
                Weight weight = entry.getValue();
                List<Weight> weights = INVERTED_INDEX.get(keyword);
                if (weights == null) {
                    weights = new ArrayList<>();
                    INVERTED_INDEX.put(keyword, weights);
                }
                System.out.println(keyword + ": " + weight.getDoc().getId() + weight.getWeight());
                weights.add(weight);
            }
        }
    }

    public static List<Weight> get(String keyword) {
        return INVERTED_INDEX.get(keyword);
    }

    public static void main(String[] args) {
        Index.buildForwardIndex();
//        FORWARD_INDEX.stream()
//                .forEach(System.out:: println);

        Index.buildInvertedIndex();
        for (Map.Entry<String, List<Weight>> e : INVERTED_INDEX.entrySet()) {
            String keyword = e.getKey();
            System.out.print(keyword + ": ");
            List<Weight> weights = e.getValue();
            weights.stream()
                    .map(weight -> {
                        return "(" + weight.getDoc().getId() + ", " + weight.getWeight() + ")";
                    })
//                    .collect(Collectors.toList());
                    .forEach(System.out:: print);
            System.out.println();
        }
    }
}
