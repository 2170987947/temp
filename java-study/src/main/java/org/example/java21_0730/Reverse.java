package org.example.java21_0730;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] p = str.split(" ");
        StringBuffer ret = new StringBuffer();
        for (int i = p.length - 1; i >= 0 ; i--) {
            ret.append(p[i]);
            if (i != 0) {
                ret.append(" ");
            }
        }
        System.out.println(ret);
    }
}
