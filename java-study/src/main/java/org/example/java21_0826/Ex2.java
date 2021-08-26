package org.example.java21_0826;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int r = arr[0];
        int[] a = new int[n];
        a[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            a[i] = Math.max(arr[i] + a[i - 1], arr[i]);
            r = Math.max(r, a[i]);
        }
        System.out.println(r);
    }
}
