package java1226;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("最大数： " +max3(num1 ,num2 ,num3));
    }
    public static int max2(int num1 ,int num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static int max3(int num1 , int num2 ,int num3) {
        max2(num1 ,num2);
        return max2(max2(num1 ,num2) ,num3);
    }
}
