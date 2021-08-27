package org.example.java21_0826;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int one = 0;
        int two = 1;
        while (two < n) {
            int three = one + two;
            one = two;
            two = three;
        }
        System.out.println(Math.min(n - one, two - n));
    }
}
