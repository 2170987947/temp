package test0524;

import java.math.BigInteger;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            System.out.print((long) (Math.pow(5, n) - 4) + " ");
            System.out.println((long) Math.pow(4, n) + n - 4);
        }
    }
}
