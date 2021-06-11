package test0610;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        long[] d = new long[21];
        d[1] = 0;
        d[2] = 1;
        for (int i = 3; i < 21; i++) {
            d[i] = (i - 1) * (d[i - 1] + d[i - 2]);
        }
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int a = s.nextInt();
            System.out.println(d[a]);
        }
    }
}
