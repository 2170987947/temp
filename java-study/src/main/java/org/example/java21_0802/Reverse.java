package org.example.java21_0802;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] p = str.split(" ");
        StringBuffer r = new StringBuffer();
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
