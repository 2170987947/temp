package test;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/14 19:58
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            StringBuffer b = new StringBuffer();
            boolean flag = false;
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                b.append(s.charAt(i));
                i++;
                flag = true;
            }
            if (flag) {
                list.add(b.toString());
            }
            i++;
        }
        int max = 0;
        for (i = 1; i < list.size(); i++) {
            if (list.get(i).length() > list.get(max).length()) {
                max = i;
            }
        }
        System.out.println(list.get(max));
    }
}
