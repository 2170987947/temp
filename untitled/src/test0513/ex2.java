package test0513;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/13 12:26
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String a = in.nextLine();
            String b = in.nextLine();
            System.out.println(subLong(a, b));
        }
    }

    private static String subLong(String a, String b) {
        if (a == null || b == null) {
            return "";
        }
        if (a.length() == 0 || b.length() == 0) {
            return "";
        }
        if (a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }
        String ret = "";
        for (int start = 0; start < b.length(); start++) {
            for (int end = start + 1; end <= b.length(); end++) {
                if (a.contains(b.substring(start, end)) && (end - start) > ret.length()) {
                    ret = b.substring(start, end);
                }
            }
        }
        return ret;
    }
}
