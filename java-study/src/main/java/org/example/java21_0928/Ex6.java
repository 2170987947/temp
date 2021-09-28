package org.example.java21_0928;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(add(a, b));
        }
    }

    private static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        int ben = 0;
        int jin = 0;
        while (b != 0) {
            ben = a ^ b;
            jin = a & b;
            a = ben;
            b = jin;
        }
        return a;
    }
}
