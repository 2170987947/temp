package test0414;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/14 20:47
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }
        int a;
        int b;
        int c;
        a = (arr[0] + arr[2]) / 2;
        b = (arr[2] - arr[0]) / 2;
        c = (arr[3] - arr[1]) / 2;
        if (a >= 0 && b >= 0 && c >= 0) {
            System.out.println(a + " " + b + " " + c);
        } else {
            System.out.println("No");
        }
    }
}
