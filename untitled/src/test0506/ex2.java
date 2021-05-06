package test0506;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/6 13:17
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(lucky(arr));
        }
    }

    private static int lucky(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            int multi = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                multi *= arr[j];
                if (sum > multi) {
                    count++;
                } else {
                    break;
                }
            }
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return count;
    }
}
