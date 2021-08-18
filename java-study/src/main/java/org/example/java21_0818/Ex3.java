package org.example.java21_0818;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(fuc(arr));
    }

    private static int fuc(int[] arr) {
        int r = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                while (i < arr.length - 1 && arr[i] <= arr[i + 1]) {
                    i++;
                }
                r++;
            } else if (arr[i] > arr[i + 1]) {
                while (i < arr.length - 1 && arr[i] >= arr[i + 1]) {
                    i++;
                }
                r++;
            } else {
            }
        }
        return r;
    }
}
