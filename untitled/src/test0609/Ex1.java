package test0609;

import java.util.Scanner;
public class Ex1 {
    private static void java(String a) {
        int i = 0;
        StringBuffer r = new StringBuffer();
        while (i < a.length()) {
            int index = a.substring(i, a.length()).indexOf("_");
            if (index == -1) {
                break;
            }
            index += i;
            r.append(a, i, index);
            r.append((char)(a.charAt(index + 1) - 32));
            i = index + 2;
        }
        r.append(a.substring(i, a.length()));
        System.out.println(r);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.next();
            java(a);
        }
    }
}