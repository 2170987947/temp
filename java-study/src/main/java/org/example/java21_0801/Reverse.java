package org.example.java21_0801;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] p = str.split(" ");
        StringBuffer ret = new StringBuffer();
        int count = p.length;
        while (count > 0) {
            ret.append(p[--count]);
            if (count != 0) {
                ret.append(" ");
            }
        }
        System.out.println(ret);
    }
}
