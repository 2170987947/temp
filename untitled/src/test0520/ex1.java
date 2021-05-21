package test0520;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            BigDecimal a = in.nextBigDecimal();
            BigDecimal b = in.nextBigDecimal();
            BigDecimal c = in.nextBigDecimal();

            if (a.add(b).compareTo(c) > 0 && a.add(c).compareTo(b) > 0 && b.add(c).compareTo(a) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}