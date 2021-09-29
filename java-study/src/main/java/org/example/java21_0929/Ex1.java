package org.example.java21_0929;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            int ben = 0;
            int jin = 0;
            while (b != 0) {
                ben = a ^ b;
                jin = (a & b) >> 1;
                a = ben;
                b = jin;
            }
            System.out.println(a);
        }
    }
}
