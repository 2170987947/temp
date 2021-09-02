package org.example.java21_0902;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    private static int[] toInt(String[] p) {
        int[] a = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            a[i] = Integer.parseInt(p[i]);
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] p = str.split(" ");
        int[] a = toInt(p);
        Arrays.sort(a);
        if (a.length >= 2) {
            System.out.println(a[a.length - 2]);
        } else {
            System.out.println(-1);
        }
    }
}
