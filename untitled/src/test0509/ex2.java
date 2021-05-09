package test0509;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/9 19:01
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int multi = 1;
            int sum = 0;
            int count = 0;
            System.out.println(lucky(0, sum, multi, arr));
        }
    }

    private static int lucky(int index, int sum, int multi, int[] arr) {
        int count = 0;
        for (int i = index; i < arr.length; i++) {
            sum += arr[i];
            multi *= arr[i];
            if (sum > multi) {
                count++;
                count += lucky(i + 1, sum, multi, arr);
            } else if (arr[i] == 1) {
                count += lucky(i + 1, sum, multi, arr);
            } else {
                break;
            }
            sum -= arr[i];
            multi /= arr[i];
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return count;
    }
}
