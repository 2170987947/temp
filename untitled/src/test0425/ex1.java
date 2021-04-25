package test0425;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 12:24
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        System.out.println(jiecheng(num));
    }

    private static long jiecheng(long num) {
        long ret = 1;
        for (int i = 1; i <= num; i++) {
            ret *= i;
        }
        return ret;
    }
}
