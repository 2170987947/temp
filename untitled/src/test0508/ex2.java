package test0508;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/8 19:03
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int month = in.nextInt();
            int one = 1;
            int two = 1;
            int three = 0;
            for (int i = 3; i <= month; i++) {
                three = total(i, two, one);
                one = two;
                two = three;
            }
            if (month < 3) {
                three = 1;
            }
            System.out.println(three);
        }
    }

    private static int total(int month, int two, int one) {
        int ret = 0;
        if (month < 3) {
            return 1;
        }
        int cha = two - one;
        ret = one * 2 + cha;
        return ret;
    }
}
