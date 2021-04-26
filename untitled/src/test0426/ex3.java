package test0426;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/26 19:27
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            boolean nian = run(year);
            if (nian == true) {
                monthDay[1] = 29;
            }
            int sum = zhengyue(month, day, monthDay);
            System.out.println(sum);
        }
    }

    private static int zhengyue(int month, int day, int[] arr) {
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += arr[i];
        }
        return sum + day;
    }

    private static boolean run(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
            if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
