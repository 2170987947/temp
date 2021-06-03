package test0528;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        long[] l = new long[21];
        l[0] = l[1] = 1;
        l[2] = 2;
        long[] k = new long[21];
        k[0] = k[1] = 0;
        k[2] = 1;
        for (int i = 3; i < 21; i++) {
            l[i] = i * l[i - 1];
            k[i] = (i - 1) * (k[i - 1] + k[i - 2]);
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.printf("%.2f%%\n",(float)k[n] / l[n] * 100);
        }
    }
}
