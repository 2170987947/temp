package org.example.java21_0928;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int sum = 0;
            int ret = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    sum++;
                    ret = Math.max(sum, ret);
                } else {
                    sum = 0;
                }
                n >>= 1;
            }
            System.out.println(ret);
        }
    }
}
