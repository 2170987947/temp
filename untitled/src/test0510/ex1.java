package test0510;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/10 8:07
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] p = str.split(" ");
            char[] a = p[0].toCharArray();
            char[] b = p[1].toCharArray();
            System.out.println(add(a, b));
        }
    }

    private static String add(char[] a, char[] b) {
        StringBuilder str = new StringBuilder();
        int jin = 0;
        for (int i = a.length - 1, j = b.length - 1; i >= 0 && j >= 0; i--, j--) {
            if (a[i] < '0' || a[i] > '9' || b[i] < '0' || b[i] >'9') {
                return "error";
            }
            int zong = a[i] + b[j] - '0' - '0' + jin;
            int ben = zong;
            if (ben > 9) {
                ben %= 10;
                jin = zong / 10;
            }
            str.append(ben);
        }
        if (a.length > b.length) {
            for (int i = a.length - b.length - 1; i >= 0; i--) {
                int zong = a[i] - '0' + jin;
                int ben = zong;
                if (ben > 9) {
                    ben %= 10;
                    jin = zong / 10;
                }
                str.append(ben);
            }
        } else {
            for (int i = b.length - a.length - 1; i >= 0; i--) {
                int zong = b[i] + jin - '0';
                int ben = zong;
                if (ben > 9) {
                    ben %= 10;
                    jin = zong / 10;
                }
                str.append(ben);
            }
        }
        if (jin > 0) {
            str.append(jin);
        }
        return str.reverse().toString();
    }
}
