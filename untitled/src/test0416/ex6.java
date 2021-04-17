package test0416;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/16 20:41
 */
public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[3 * n];
        for (int i = 0; i < 3 * n; i++) {
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);
        long result = 0;
        for (int i = n; i < 3 * n; i += 2) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
