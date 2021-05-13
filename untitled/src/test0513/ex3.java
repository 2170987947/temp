package test0513;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/13 23:08
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int monster = in.nextInt();
            int a = in.nextInt();
            int[] arr = new int[monster];
            for (int i = 0; i < monster; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(energy(monster, a, arr));
        }
    }

    private static int energy(int monster, int a, int[] arr) {
        int c = a;
        for (int i : arr) {
            if (i > c) {
                c += yueshu(c, i);
            } else {
                c += i;
            }
        }
        return c;
    }

    private static int yueshu(int n, int m) {
        for (int i = (Math.min(n, m)); i >= 1; i--) {
            if ((m % i) == 0 && (n % i) == 0) {
                return i;
            }
        }
        return 0;
    }
}
