package java0109;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        date1.setDay(2021, 1, 9);
        date1.printDay();
        System.out.println(date1);
        System.out.println(date3);
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);
//        Point point = new Point();
//        System.out.println(point.x);
//        System.out.println("qin请输入一个整数 : ");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        Test test = new Test(num);
//        System.out.println(test.a);
//        System.out.println(test.b);
//        System.out.println(test.c);
//        System.out.println(test.d);
//        System.out.println(test.e);
//        System.out.println(test.f);
//        System.out.println(test.g);
    }
}
