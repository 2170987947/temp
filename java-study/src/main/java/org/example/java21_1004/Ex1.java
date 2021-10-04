package org.example.java21_1004;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int count = 0;
            int tmp = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    tmp++;
                    count = Math.max(count, tmp);
                } else {
                    tmp = 0;
                }
                n >>= 1;
            }
            System.out.println(count);
        }
    }
}
