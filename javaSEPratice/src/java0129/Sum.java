package java0129;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/30 1:34
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 n 的值: ");
        int num = scanner.nextInt();
        System.out.println(num + " 的阶乘为: " + sum(num));
    }

    public static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sum(num - 1);
    }

}
