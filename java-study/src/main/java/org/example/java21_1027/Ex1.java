package org.example.java21_1027;

public class Ex1 {
    public String reverseLeftWords(String s, int n) {
        return (new StringBuilder(s.substring(n, s.length()))).append(s.substring(0, n)).toString();
    }

    public String addBinary(String a, String b) {
        int jin = 0;
        int ben = 0;
        StringBuilder ret = new StringBuilder();
        int n = Math.max(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            int l = (a.length() > i) ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int r = (b.length() > i) ? b.charAt(b.length() - 1 - i) - '0' : 0;
            ben = (l + r + jin) % 2;
            jin = (l + r + jin) / 2;
            ret.append(ben);
        }
        if (jin == 1) {
            ret.append(1);
        }
        return ret.reverse().toString();
    }
}
