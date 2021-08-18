package org.example.java21_0818;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] p = str.split(" ");
        StringBuffer r = new StringBuffer();
        for (int i = p.length - 1; i >= 0; i--) {
            r.append(p[i]);
            if (i != 0) {
                r.append(" ");
            }
        }
        System.out.println(r);
    }
}