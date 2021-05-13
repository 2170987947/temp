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
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] p = str.split(" ");
            int[] arr = array(p);
            int n = Integer.parseInt(p[0]);
            int k = Integer.parseInt(p[1]);
            arr = reshuffle(n, k, arr);
            StringBuilder ret = new StringBuilder();
            for (int i : arr) {
                if (i == arr.length - 1) {
                    ret.append(i);
                } else {
                    ret.append(i + " ");
                }
            }
            System.out.println(ret);
        }
    }

    private static int[] array(String[] p) {
        int[] arr = new int[p.length - 2];
        for (int i = 2; i < p.length; i++) {
            arr[i - 2] = Integer.parseInt(p[0]);
        }
        return arr;
    }

    private static int[] reshuffle(int n, int k, int[] p) {
        if (k < 1) {
            return p;
        }
        int[] arr = new int[p.length];
        int ji = 1;
        int ou = 0;
        for (int i = 0; i < p.length; i++) {
            if (i < p.length / 2) {
                arr[ou] = p[i];
                ou += 2;
            } else {
                arr[ji] = p[i];
                ji += 2;
            }
        }
        return p;
    }
}
