package test0610;

import java.util.Scanner;

public class Ex4 {
    // 字符串计数: 介于两个字符串之间，长度在一定范围的字符串的个数
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            StringBuffer a = new StringBuffer(s.next());
            StringBuffer b = new StringBuffer(s.next());
            int len1 = s.nextInt();
            int len2 = s.nextInt();
            while (a.length() < len2) {
                a.append('a');
            }
            while (b.length() < len2) {
                b.append('z' + 1);
            }
            int[] r = new int[len2];
            for (int i = 0; i < len2; i++) {
                r[i] = b.charAt(i) - a.charAt(i);
            }
            count(a, b, len1, len2, r);
        }
    }

    private static void count(StringBuffer a, StringBuffer b, int len1, int len2, int[] r) {
        int count = 0;
        for (int i = len1; i <= len2; i++) {
            for (int j = 0; j < i; j++) {
                count += r[j] * Math.pow(26, i - 1 - j);
            }
        }
        System.out.println((count - 1) % 1000007);
    }
}
