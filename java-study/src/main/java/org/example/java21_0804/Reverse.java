package org.example.java21_0804;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuffer r = new StringBuffer();
        String[] p = str.split(" ");
        int count = p.length;
        while (count > 0) {
            r.append(p[--count]);
            if (count != 0) {
                r.append(" ");
            }
        }
        System.out.println(r);
    }
}
