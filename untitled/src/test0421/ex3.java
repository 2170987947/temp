package test0421;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/21 13:19
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ret = "";
        while (true) {
            if (n < 10) {
                ret += n;
                break;
            } else {
                ret += (n % 10);
                n /= 10;
            }
        }
        System.out.println(ret);
    }
}
