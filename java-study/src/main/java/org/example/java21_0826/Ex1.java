package org.example.java21_0826;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String a = s.next();
            String b = s.next();
            int count = 0;
            for (int i = 0; i <= a.length(); i++) {
                StringBuffer c = new StringBuffer(a);
                c.insert(i, b);
                if (c.toString().equals(c.reverse().toString())) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
