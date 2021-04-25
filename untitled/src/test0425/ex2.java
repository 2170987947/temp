package test0425;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 12:27
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = countFive(num);
        System.out.println(count);

    }
    private static int countFive(int num) {
        int count = 0;
        for (int i= 5; i <= num; i += 5) {
            int tmp = i;
            while (tmp >= 5) {
                if (tmp % 5 == 0) {
                    count++;
                    tmp /= 5;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
