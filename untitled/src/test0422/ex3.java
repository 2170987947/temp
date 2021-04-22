package test0422;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/22 14:09
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        StringBuffer b1 = new StringBuffer(b);
        int result = 0;
        for (int bound = 0; bound <= a.length(); bound++) {
            StringBuffer t = new StringBuffer(a);
            t.insert(bound, b);
            if (hunwen(t)) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static boolean hunwen(StringBuffer a1) {
        int i = 0;
        int j = a1.length() - 1;
        while (i < j) {
            if (a1.charAt(i) != (a1.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

