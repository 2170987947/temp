package java1224;

import java.util.Random;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
//        System.out.println(isPrimeNum(10));
//        ageRegion(10);
//        graph(5);
        Random random = new Random();
        int toGuess = random.nextInt(10);
        guessNum(toGuess);
//        for (int num = 0; num < 1000; num++) {
//            if (isFlower(num)) {
//                System.out.println(num);
//            }
//        }
    }

    public static void guessNum(int toGuess) {
        while (true) {
            System.out.println("请输入您要猜的数字：");
            int num = 0;
            Scanner scanner = new Scanner(System.in);
            num = scanner .nextInt();
            if (num == toGuess) {
                System.out.println("猜对了！");
                break;
            } else if (num < toGuess) {
                System.out.println("猜低了");
                continue;
            } else {
                System.out.println("猜高了");
                continue;
            }
        }
    }

    public static boolean isFlower(int num) {
        if ((num%10)*(num%10)*(num%10) +
                ((num/10)%10)*((num/10)%10)*((num/10)%10) +
                ((num/100)%10)*((num/100)%10)*((num/100)%10)==num) {
            return true;
        }
        return false;
    }

    public static void graph(int row) {
        for (int i = 0; i < row ;i++) {
            for (int col = 0; col < row; col++) {
                if (col == i) {
                    System.out.print("*");
                } else if (col == row-i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void ageRegion(int i) {
        if (i <= 18) {
            System.out.println("少年");
        } else if (i > 18 && i< 29) {
            System.out.println("青年");
        } else if (i >=29 && i < 56) {
            System.out.println("中年");
        } else if (i >=56) {
            System.out.println("老年");
        }
    }


    public static boolean isPrimeNum(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//            if ((i / 10) % 10 == 9) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    //输出1000-2000之间的闰年
//    public static void main(String[] args) {
//        for (int year= 1000; year <= 2000 ; year ++) {
//            if (isleapYear(year)) {
//                System.out.println(year);
//            }
//        }
//    public static boolean isleapYear( int year) {

//    }
//    //输出 1 -100 之间所有的素数
//    public static void main(String[] args) {
//        for (int i=1;i<=100;i++) {
//            if(isPrimeNum(i)) {
//                System.out.println(i);
//            }
//        }
//    }