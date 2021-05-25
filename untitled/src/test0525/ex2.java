package test0525;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println(0);
            } else {
                List<String> list = fab();
                String string = list.get(n - 1);
                if (string.length() > 6) {
                    System.out.println(string.substring(string.length() - 6, string.length()));
                } else {
                    System.out.println(string);
                }
            }
        }
    }

    private static List<String> fab() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        for (int i = 3; i <= 100000; i++) {
            list.add(String.valueOf((one.add(two))));
        }
        return list;
    }
}
