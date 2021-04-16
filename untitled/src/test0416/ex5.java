package test0416;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/16 11:00
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int i = 1;
        int result = arr[0];
        int sheng;
        int jiang;
        while (i < arr.length) {
            sheng = arr[i - 1];
            while (i < arr.length && arr[i - 1] <= arr[i]) {
                sheng += arr[i];
                i++;
            }
            if (sheng > result) {
                result = sheng;
            }
            jiang = arr[i - 1];
            while (i < arr.length) {
                jiang += arr[i];
                i++;
            }
            if (jiang > result) {
                result = jiang;
            }
        }
        System.out.println(result);
    }
}
