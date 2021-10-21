package org.example.java21_1021;

import java.util.Scanner;

public class Ex3 {
    // 二维数组中查找
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int find = s.nextInt();
        System.out.println(isContains(arr, n, m, find));
    }

    private static boolean isContains(int[][] arr, int n, int m, int find) {
        int r = 0;
        int c = m - 1;
        while (r < n && c >= 0) {
            if (arr[r][c] > find) {
                c--;
            } else if (arr[r][c] < find) {
                r++;
            } else {
                return true;
            }
        }
        return false;
    }
}
