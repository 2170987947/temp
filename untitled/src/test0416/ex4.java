package test0416;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/16 10:30
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        ArrayList<Character> a1 = toList(a);
        ArrayList<Character> b1 = toList(b);
        int result = 0;
        for (int bound = 0; bound <= a.length(); bound++) {
            for (int i = 0; i < b.length(); i++) {
                if (bound == a.length()) {
                    a1.add(b1.get(i));
                }
                a1.add(0, b1.get(i));
            }
            if (hunwen(a1)) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static ArrayList<Character> toList(String a) {
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            result.add(a.charAt(i));
        }
        return result;
    }

    private static boolean hunwen(List a1) {
        int i = 0;
        int j = a1.size() - 1;
        while (i < j) {
            if (!a1.get(i).equals(a1.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
