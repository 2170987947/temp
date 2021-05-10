package test0510;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/10 20:33
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str1 = in.next();
            String str2 = in.next();
            System.out.println(maxSubStringLength(str1, str2));
        }
    }

    private static int maxSubStringLength(String str1, String str2) {
        int chang = 0;
        if (str1 == null || str2 == null) {
            return 0;
        }
        if (str1.length() < str2.length()) {
            String tmp = str1;
            str1 = str2;
            str2 = tmp;
        }
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            for (int j = i + 1; j <= str2.length(); j++) {
                if (str1.contains(str2.substring(i, j))) {
                    chang = Math.max(j - i, chang);
                } else {
                    break;
                }
            }
        }
        return chang;
    }
}
