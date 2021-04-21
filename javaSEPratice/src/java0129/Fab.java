package java0129;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/29 22:17
 */
public class Fab {
//    递归求斐波那契数列的第 N 项
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入斐波那契数的项数 n : ");
        int n = scanner.nextInt();
        System.out.println("斐波那切数列的第 " + n + " 项为: " + fab(n));
    }
    public static int fab(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fab(n - 1) + fab(n - 2);
    }
}
