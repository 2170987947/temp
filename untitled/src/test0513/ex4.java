package test0513;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/13 23:38
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String a = in.nextLine();
            System.out.println(ret(a));
        }
    }

    private static Object ret(String a) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Integer n = map.get(a.charAt(i));
            if (n == null) {
                map.put(a.charAt(i), 1);
            } else {
                map.put(a.charAt(i), n + 1);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (map.get(a.charAt(i)) == 1) {
                return a.charAt(i);
            }
        }
        return "-1";
    }
}
