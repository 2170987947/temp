package org.example.java21_0903;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        
        int count = 0;
        for (int i = m; i <= n; i++) {
            int q = i % 10;
            int w = i / 10 % 10;
            int e = i / 100 % 10;
            if (i == q*q*q + w*w*w + e*e*e) {
                count++;
                System.out.print(i + " ");
            }
        }
        if (count == 0) {
            System.out.println("no");
        }
    }
}
