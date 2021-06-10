package test0610;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    private static Map<Character, Integer> map(String a) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            int index = m.getOrDefault(a.charAt(i), 0);
            m.put(a.charAt(i), index + 1);
        }
        return m;
    }
    private static void isContains(String a, String b) {
        Map<Character, Integer> m = map(a);
        Map<Character, Integer> n = map(b);
        for (Map.Entry e : n.entrySet()) {
            Character key = (Character)e.getKey();
            Integer value = (Integer)e.getValue();
            if (!m.containsKey(key) || m.get(key) < value) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.next();
            String b = in.next();
            isContains(a, b);
            in.nextLine();
        }
    }
}
