package org.example.java21_0826;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int one = 0;
        int two = 1;
        int r = Integer.MAX_VALUE;
        while (true) {
            int three = one + two;
            if (one <= n && two >= n) {
                r = Math.min(n - one, two - n);
                break;
            }
            one = two;
            two = three;
        }
        System.out.println(r);
    }
}