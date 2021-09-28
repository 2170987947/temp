package org.example.java21_0928;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println(ways(n, m));
        }
    }
    private static int ways(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return ways(n - 1, m) + ways(n, m - 1);
    }
}
