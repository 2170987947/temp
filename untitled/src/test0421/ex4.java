package test0421;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/21 13:27
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ret = 1;
        int count = 0;
        for (int i = n; i > 0; i--) {
            ret *= i;
        }
        System.out.println(ret);
        while (true) {
            if (ret >= 10 && ret % 10 == 0) {
                count++;
                ret /= 10;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
