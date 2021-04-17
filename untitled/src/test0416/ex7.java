package test0416;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/16 21:00
 */
public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        List<Character> m = toList(s1);
        List<Character> n = toList(s2);
        int i = 0;
        while (i < s2.length()) {
            char c = s2.charAt(i);
            while (m.contains(c)) {
                m.remove((Character)c);
            }
            i++;
        }
//        while (i < n.size()) {
//            while (m.contains(n.get(i))) {
//                m.remove(n.get(i));
//            }
//            i++;
//        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!m.isEmpty()) {
            stringBuffer.append(m.remove(0));
        }
        System.out.println(stringBuffer.toString());
    }
    private static List toList(String s) {
        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        return list;
    }
}
