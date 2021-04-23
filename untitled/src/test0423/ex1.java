package test0423;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 12:41
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fa(n));
    }

    private static int fa(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int one = 0;
        int two = 1;
        int result = one + two;
        while (result < n) {
            one = two;
            two = result;
            result = one + two;
        }
        return Math.min((n - two), (result - n));
    }
}
