package test0610;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(in.next());
            }
            count(set, in.next(), in.nextInt(), set.size());
        }
    }

    private static void count(Set<String> set, String next, int pos, int n) {
        int r = 0;
        StringBuffer p = new StringBuffer();
        boolean[] isBrother = new boolean[n];
        for (String s : set) {
            if (!s.equals(next)) {
                char[] t = s.toCharArray();
                Arrays.sort(t);
                String t1 = String.valueOf(t);
                if (t1.equals(next)) {
                    p.append(s);
                    p.append(" ");
                    r++;
                }
            }
        }
        String[] r1 = p.toString().split(" ");
        Arrays.sort(r1);
//        System.out.println(r + " " + r1[pos - 1]);
        System.out.printf("%d\t%s", r, r1[pos - 1]);
    }
}
