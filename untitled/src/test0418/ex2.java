package test0418;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/18 10:21
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        arr[n] = 0;
        System.out.println(fun1(arr, n));
    }

    private static int fun1(int[] arr, int n) {
        int i = 0;
        int result = 0;
        while (i < n) {
            if (arr[i] < arr[i + 1]) {
                while (i < n && arr[i] <= arr[i + 1]) {
                    i++;
                }
                i++;
                result++;
            } else if (i < n && arr[i] > arr[i + 1]) {
                while (i < n && arr[i] >= arr[i + 1]) {
                    i++;
                }
                i++;
                result++;
            } else if (i < n && arr[i] == arr[i + 1]){
                i++;
            }
        }
        return result;
    }
}
