package org.example.java21_1004;

import java.util.*;

public class Main {
    private static List yueshu(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[] arr = new int[m + 1];
            for (int i = m; i >= n; i--) {
                arr[i] = Integer.MAX_VALUE;
            }
            arr[m] = 0;
            for (int i = m; i >= n; i--) {
                if (arr[i] == Integer.MAX_VALUE) {
                    continue;
                }
                List<Integer> list = yueshu(i);
                for (int j = 0; j < list.size(); j++) {
                    int index = list.get(j);
                    if (i - index < n) {
                        break;
                    }
                    if (arr[i - index] == Integer.MAX_VALUE) {
                        arr[i - index] = arr[i] + 1;
                    } else {
                        arr[i - index] = Math.min(arr[i - index], arr[i] + 1);
                    }
                }
            }
            if (arr[n] == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(arr[n]);
            }
        }
    }
}