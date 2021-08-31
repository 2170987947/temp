package org.example.java21_0831;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] a = new int[n];
        a[0] = arr[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = Math.max(a[i - 1] + arr[i], arr[i]);
            max = Math.max(a[i], max);
        }
        System.out.println(max);
    }
}
