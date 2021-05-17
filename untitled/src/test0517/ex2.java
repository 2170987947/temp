package test0517;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLong()) {
            long num = in.nextLong();
            System.out.println(root(num));
        }
    }

    private static long root(long num) {
        if (num < 10) {
            return num;
        }
        long ret = 0;
        while (true) {
            while (num >= 10) {
                ret += num % 10;
                num /= 10;
            }
            ret += num;
            if (ret < 10) {
                return ret;
            } else {
                num = ret;
                ret = 0;
            }
        }
    }
}
