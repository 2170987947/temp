package test0511;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 20:24
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int groups = in.nextInt();
        for (int j = 0; j < groups; j++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] cards = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                cards[i] = in.nextInt();
            }
            cards = reshuffle(n, k, cards);
            StringBuilder ret = new StringBuilder();
            for (int i : cards) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }

    private static int[] reshuffle(int n, int k, int[] p) {
        if (k < 1) {
            return p;
        }
        int[] arr = new int[p.length];
        int ji = 1;
        int ou = 0;
        for (int i = 0; i < p.length / 2; i++) {
            arr[2 * i] = p[i];
            arr[2 * i + 1] = p[i + n];
        }
        return reshuffle(n, k - 1, arr);
    }
}
