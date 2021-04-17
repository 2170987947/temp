package test0417;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/17 8:38
 */
public class ex1 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        for (char c : s2.toCharArray()) {
            map.put(c, 1);
        }
        StringBuffer result = new StringBuffer();
        for (char c : s1.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
