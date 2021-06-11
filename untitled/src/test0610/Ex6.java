package test0610;

import java.util.Scanner;

public class Ex6 {
    // 最长上升子序列
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int[] r = new int[n];
            for (int i = 0; i < n; i++) {
                r[i] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] <= arr[i]) {
                        r[i] = Math.max(r[j] + 1, r[i]);
                    }
                }
            }
            int max = 0;
            for (int i : r) {
                max = Math.max(max, i);
            }
            System.out.println(max);
        }
    }
}
