package test0518;

import java.math.BigDecimal;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            BigDecimal n = new BigDecimal(in.next());
            BigDecimal r = new BigDecimal(in.next());
            BigDecimal t = new BigDecimal("6.28");
            System.out.println((r.multiply(t)).compareTo(n) >= 0 ? "No" : "Yes" );
        }
    }

}
