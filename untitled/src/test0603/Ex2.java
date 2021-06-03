package test0603;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static int r(int[] n, int[] m) {
        int[][] k = new int[n.length + 1][n.length + 1];
        for (int i = 0; i < k.length; i++) {
            k[i][0] = 0;
            k[0][i] = 0;
        }
        for (int i = 1; i < k.length; i++) {
            for (int j = 1; j < k.length; j++) {
                if (n[i - 1] == m[j - 1]) {
                    k[i][j] = Math.max(Math.max(k[i - 1][j], k[i][j - 1]), k[i - 1][j - 1] + 1);
                } else {
                    k[i][j] = Math.max(Math.max(k[i - 1][j], k[i][j - 1]), k[i - 1][j - 1]);
                }
            }
        }
        return k[n.length][n.length];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int[] arr1 = Arrays.copyOf(arr, arr.length);
            Arrays.sort(arr1);
            System.out.println(r(arr, arr1));
        }

    }
}
