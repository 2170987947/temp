package test0603;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] fab = new int[21];
        fab[1] = 1;
        fab[2] = 2;
        for (int i = 3; i < 21; i++) {
            fab[i] = fab[i - 1] * i;
        }
        int[] f = new int[21];
        f[1] = 0;
        f[2] = 1;
        f[3] = 2;
        for (int i = 4; i < 21; i++) {
            f[i] = (i - 1)*(f[i - 2] + fab[i - 2]);
        }
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            System.out.println(f[n]);
        }
    }
}
