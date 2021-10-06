package org.example.java21_1006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    private static List<Integer> div(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.pow(n, 1 / 2); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[] arr = new int[m + 1];
            arr[n] = 0;
            for (int i = n + 1; i <= m; i++) {
                arr[i] = Integer.MAX_VALUE;
            }
            for (int i = n; i <= m; i++) {
                if (arr[i] == Integer.MAX_VALUE) {
                    continue;
                }
                List<Integer> list = div(i);
                for (Integer j : list) {
                    if (j + i > m) {
                        continue;
                    }
                    arr[i + j] = Math.min(arr[i + j], arr[i] + 1);
                }
            }
            System.out.println(arr[m]);
        }
    }
}
