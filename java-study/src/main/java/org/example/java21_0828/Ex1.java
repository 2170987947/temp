package org.example.java21_0828;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int h = s.nextInt();
        int[][] arr = new int[w][h];
        int count = 0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (arr[i][j] == 0) {
                    count++;
                    if (i + 2 < w) {
                        arr[i + 2][j] = 1;
                    }
                    if (j + 2 < h) {
                        arr[i][j + 2] = 1;
                    }
                 }
            }
        }
        System.out.println(count);
    }
}
