package test0520;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            String c = in.next();
            if (isSanJiaoXing(a, b, c)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean isSanJiaoXing(String a, String b, String c) {
        String[] tep = new String[]{a, b, c};
        Arrays.sort(tep);
        BigInteger tmp1 = new BigInteger(tep[0]);
        BigInteger tmp2 = new BigInteger(tep[1]);
        BigInteger tmp3 = new BigInteger(tep[2]);
        System.out.println(tep[0]);
        System.out.println(tep[1]);
        System.out.println(tep[2]);
        if (tmp1.add(tmp2).compareTo(tmp3) > 0) {
            return true;
        }
        return false;
    }

}