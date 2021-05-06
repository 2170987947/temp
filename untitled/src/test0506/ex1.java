package test0506;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/6 12:46
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int num = lucky(arr, n, 0, 0, 1);
            System.out.println(num);
        }
    }

    private static int lucky(int[] arr, int n, int pos, int sum, int multi) {
        int count = 0;
        for (int i = pos; i < arr.length; i++) {
            sum += arr[i];
            multi *= arr[i];
            if (sum > multi) {
                count += 1 + lucky(arr, n, i + 1, sum, multi);
            } else if (arr[i] == 1) {
                count += lucky(arr, n, i + 1, sum, multi);
            } else {
                break;
            }
            sum -= arr[i];
            multi /= arr[i];
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return count;
    }
}
