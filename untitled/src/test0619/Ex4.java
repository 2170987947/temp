package test0619;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    private static boolean isBrother(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        if (a.equals(b)) {
            return false;
        }
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        String m = new String(aa);
        String n = new String(bb);
        if (m.equals(n)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            String[] p = new String[n];
            for (int i = 0; i < n; i++) {
                p[i] = s.next();
            }
            String x = s.next();
            int k = s.nextInt();
            String r = "";
            Arrays.sort(p);
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (isBrother(p[i], x)) {
                    count++;
                    if (count == k) {
                        r = p[i];
                    }
                }
            }
            System.out.println(count);
            if (count != 0) {
                System.out.println(r);
            }
        }
    }
}
