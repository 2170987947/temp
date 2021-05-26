package test0526;

import java.math.BigInteger;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int start = in.nextInt();
            int end = in.nextInt();
            System.out.println(count(start, end));
        }
    }

    private static long count(int start, int end) {
        long[] lunch = new long[80 + 1];
        lunch[1] = 1;
        lunch[2] = 1;
        for (int i = 3; i <= end; i++) {

            lunch[i] = lunch[i - 2] + lunch[i - 1];
        }
        long count = 0;
        for (int i = start; i <= end; i++) {
            count += lunch[i];
        }
        return count;
    }
}
