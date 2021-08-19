package org.example.java21_0919;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] p = str.split(" ");
        StringBuffer r = new StringBuffer();
        for (int i = p.length; i >= 0; i++) {
            r.append(p[i]);
            if (i > 0) {
                r.append(" ");
            }
        }
        System.out.println(r);
    }
}
