package java0129;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/29 22:38
// */
// 写一个递归方法，输入一个非负整数，返回组成它的数字之和
public class He {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个非负整数: ");
        int num = scanner.nextInt();
        System.out.println("组成 " + num + " 的数字之和为: " + he(num));
    }

    public static int he(int num) {
        if (num < 10) {
            return num % 10;
        }
        return he(num / 10) + num % 10;
    }
}
