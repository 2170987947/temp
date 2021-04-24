package test0424;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/24 22:16
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ban = num / 2;
        int one = ban;
        int two = ban;

        for (int bound = ban; bound >= 1; bound--) {
            if (isPrime(bound) && isPrime(num - bound)) {
                one = bound;
                two = num - bound;
                break;
            }
        }
        System.out.println(one);
        System.out.println(two);
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
