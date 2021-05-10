package test0510;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/10 20:17
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str1 = in.next();
            String str2 = in.next();
            System.out.println(match(str1, str2, 0, 0));
        }
    }

    private static boolean match(String str1, String str2, int i, int j) {
        if (i == str1.length() && j == str2.length()) {
            return true;
        }
        if (i == str1.length() || j == str2.length()) {
            return false;
        }
        if (str1.charAt(i) == '*') {
            return match(str1, str2, i, j + 1) || match(str1, str2, i + 1, j + 1);
        } else if (str1.charAt(i) == '?') {
            return match(str1, str2, i + 1, j + 1);
        } else if (str1.charAt(i) == str2.charAt(j)) {
            return match(str1, str2, i + 1, j + 1);
        } else {
            return false;
        }
    }
}
