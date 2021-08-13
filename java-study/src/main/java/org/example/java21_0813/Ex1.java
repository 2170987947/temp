package org.example.java21_0813;

public class Ex1 {
    public static void main(String[] args) {
        StringBuffer r = new StringBuffer();
        String s = "1";
        String t = "99";
        int i = s.length() - 1;
        int j = t.length() - 1;
        int jin = 0;
        while (i >= 0 || j >= 0) {
            int a = (i >= 0 ? s.charAt(i--) - '0' : 0);
            int b = (j >= 0 ? t.charAt(j--) - '0' : 0);
            int c = a + b + jin;
            if (c > 9) {
                jin = c / 10;
                c = c % 10;
            } else {
                jin = 0;
            }
            r.append(c);
        }
        if (jin > 0) {
            r.append(jin);
        }
        System.out.println(r.reverse().toString());
    }
}
