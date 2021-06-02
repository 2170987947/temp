package test0602;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        long[] fib = new long[100000];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < 100000; i++) {
            long r = fib[i - 1] + fib[i - 2];
            if (r >= 1000000) {
                fib[i] = r % 1000000;
            } else {
                fib[i] = r;
            }
        }
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            if(n<29) {
                System.out.printf("%d\n", fib[n - 1]);
            } else {
                System.out.printf("%06d\n", fib[n - 1]);
            }
        }
    }
}
