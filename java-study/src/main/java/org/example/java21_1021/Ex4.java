package org.example.java21_1021;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Arrays.toString(print(n)));
    }

    private static int[] print(int n) {
        int[] arr = new int[(int)Math.pow(10, n) - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
