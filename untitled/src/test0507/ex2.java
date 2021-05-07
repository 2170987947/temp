package test0507;

import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            String b = in.nextLine();
            StringBuilder a1 = new StringBuilder(a);
            StringBuilder b1 = new StringBuilder(b);
            int i = 0;
            while (true) {
                if (a1.charAt(0) == '0') {
                    a1.replace(0, 1, "");
                } else if (b1.charAt(0) == '0') {
                    b1.replace(0, 1, "");
                } else {
                    break;
                }
            }
            System.out.println(add(a1, b1));
        }
    }

    private static String add(StringBuilder a, StringBuilder b) {
        StringBuilder ret = new StringBuilder();
        char jin = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 && j >=0; i--, j--) {
            char m = a.charAt(i);
            char n = b.charAt(j);
            int zong = (int)(m - '0') + (int) (n - '0') + jin;
            int ben = zong % 10;
            jin = (char) (zong / 10);
            ret.append(ben);
        }
        if (a.length() > b.length()) {
            int i = a.length() - b.length() - 1;
            while (i >= 0){
                char m = a.charAt(i);
                int zong = (int) (m - '0') + jin;
                int ben = zong % 10;
                jin = (char) (zong / 10);
                ret.append(ben);
                i--;
            }
        } else if (a.length() < b.length()) {
            int i = b.length() - a.length() - 1;
            while (i >= 0){
                char m = a.charAt(i);
                int zong = (int) (m - '0') + jin;
                int ben = zong % 10;
                jin = (char) (zong / 10);
                ret.append(ben);
                i--;
            }
        }
        if (jin > 0) {
            ret.append((int)jin);
        }
        ret.reverse();
        return ret.toString();
    }
}