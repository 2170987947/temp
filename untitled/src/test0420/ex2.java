package test0420;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/20 13:15
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String cur = "";
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c <= '9' && c >= '0') {
                cur += c;
            } else {
                if (ret.length() < cur.length()) {
                    ret = cur;
                    cur = "";
                } else {
                    cur = "";
                }
            }
        }
        if (ret.length() < cur.length()) {
            ret = cur;
        }
        System.out.println(ret);
    }
}
