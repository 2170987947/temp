package org.example.java21_0829;

import java.util.Scanner;

public class Ex1 {
    public int strToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }
        StringBuffer r = new StringBuffer();
        int a = 1;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (flag && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                while (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                    if (str.charAt(i) == '+') {
                        a *= 1;
                    } else {
                        a *= -1;
                    }
                    i++;
                }
                flag = false;
                if (i >= str.length()) {
                    return  0;
                }
                if (a < 0) {
                    r.append('-');
                }
            }
            if (Character.isDigit(str.charAt(i))) {
                r.append(str.charAt(i));
            } else {
                return 0;
            }
        }
        return Integer.parseInt(r.toString());
    }
}
