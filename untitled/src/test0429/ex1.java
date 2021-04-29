package test0429;

import java.util.*;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/29 11:36
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        for (int i = 2; i <= 9; i++) {
            map.put(Integer.toString(i), 1);
        }
        map.put("J", 10);
        map.put("Q", 11);
        map.put("K", 12);
        map.put("joker", 13);
        map.put("JOKER", 14);

        while (in.hasNext()) {
            String p = in.nextLine();
            String[] pp = p.split("-");
            String[] a = pp[0].split(" ");
            String[] b = pp[1].split(" ");
            String aa = max(a, map);
            String bb = max(b, map);
//            if (map.get(aa) == )
        }
    }
    private static String max(String[] a, Map map) {
        String max = a[0];
        int value = (Integer)map.get(a[0]);

        for (int i = 1; i < a.length; i++) {
            int value1 = (Integer)map.get(a[i]);
            if (value1 > value) {
                max = a[i];
            }
        }
        return max;
    }
}
