package java1226;

import java.util.Scanner;

public class chongzai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 num1 :");
        int num1 = scanner.nextInt();
        System.out.print("请输入 num2 :");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " and " + num2 + "最小值 ：" + minNum(num1, num2));
        System.out.println(num1 + " and " + num2 + "最大值 ：" + maxNum(num1, num2));
        System.out.println("请输入两个小数和一个整数：");
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        int num5 = scanner.nextInt();
        cmp(num3, num4, num5);
    }

    public static int minNum(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }
    public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static void cmp(double num1, double num2, int num3) {
        double temp = num1 > num2 ? num1 : num2;
        double max, mid, min;
        max = temp > num3 ? temp : num3;
        mid = temp < num3 ? temp : num3;
        min = num1 < num2 ? num1 : num2;
        System.out.println(max + " > " + mid + " > " + min);

    }
}
