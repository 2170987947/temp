package org.example.java21_0813;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[]{5, 4, 1, 1, 5, 1, 5};
        for (int i = 0; i < arr.length; i++) {
            int c = map.getOrDefault(arr[i], 0);
            map.put(arr[i], c + 1);
        }
        for (Map.Entry e : map.entrySet()) {
            if ((int)e.getValue() == 0) {
                System.out.println(e.getKey());
            }
        }
//        System.out.println(0);
    }
}
