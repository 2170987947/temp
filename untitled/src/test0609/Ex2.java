package test0609;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            ret(a);
        }
    }

    private static void ret(String a) {
        StringBuffer r = new StringBuffer();
        int end = a.length();
        int start = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (isRange(a.charAt(i))) {
                start = i;
            } else {
                r.append(a.substring(start, end));
                if (end == a.length()) {
                    r.append(" ");
                }
                end = start;
            }
        }
        r.append(a.substring(0, end));
        System.out.println(r);
    }

    private static boolean isRange(char a) {
        return (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z');
    }
}
