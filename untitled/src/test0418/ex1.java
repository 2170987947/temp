package test0418;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/18 9:57
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(func(arr));
    }
    public static int func(int[] a) {
        int result = 1;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                result++;
            }
        }
        return result;
    }
}

