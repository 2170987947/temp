package test0422;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/22 15:05
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
        }
        int result = dp[0];
        for (int i = 1; i < n; i++) {
            if (result < dp[i]) {
                result = dp[i];
            }
        }
        System.out.println(result);
    }
}