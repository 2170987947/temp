package test0619;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = s.nextInt();
            }
            int k = s.nextInt();
            int d = s.nextInt();
            System.out.println(dp(arr, n, k, d));
        }
    }

    private static long dp(int[] arr, int n, int k, int d) {
        long[][] maxValue = new long[n + 1][k + 1];
        long[][] minValue = new long[n + 1][k + 1];
        // 初始化
        for (int i = 1; i <= n; i++) {
            maxValue[i][1] = minValue[i][1] = arr[i];
        }
        long r = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                int c = i - d;
                if (c <= 0) {
                    c = 1;
                }
                for (; c >= 1 && c <= i - 1; c++) {
                    maxValue[i][j] = Math.max(maxValue[i][j], Math.max(maxValue[c][j - 1] * arr[i], minValue[c][j - 1] * arr[i]));
                    minValue[i][j] = Math.min(minValue[i][j], Math.min(maxValue[c][j - 1] * arr[i], minValue[c][j - 1] * arr[i]));
                }
            }
            r = Math.max(r, maxValue[i][k]);
        }
        return r;
    }
}