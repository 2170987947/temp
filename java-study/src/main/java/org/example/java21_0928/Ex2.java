package org.example.java21_0928;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println(ways(n + 1, m + 1));
        }
    }

    private static int ways(int n, int m) {
        if ((n == 1 && m >= 1) || (n >= 1 && m == 1)) {
            return n + m;
        }
        return ways(n - 1, m) + ways(n, m - 1);
    }
}
