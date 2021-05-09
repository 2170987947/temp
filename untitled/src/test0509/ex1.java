package test0509;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/9 18:29
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[m + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.MAX_VALUE;
            }
            arr[n] = 0;
            for (int i = n; i < arr.length; i++) {
                if (arr[i] == Integer.MAX_VALUE) {
                    continue;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0 && (i + j) <= m) {
                        arr[i + j] = Math.min(arr[i] + 1, arr[i + j]);
                        if (i / j != j && (i + (i / j) <= m)) {
                            arr[i + i / j] = Math.min(arr[i] + 1, arr[i + i / j]);;
                        }
                    }
                }
            }
            if (arr[m] == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(arr[m]);
            }
        }
    }
}
