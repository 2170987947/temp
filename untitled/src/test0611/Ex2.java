package test0611;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int count = 1;
            Set<String> set = new HashSet<>();
            while (count <= 8) {
                String a = in.next();
                if (set.add(a) == false) {
                    continue;
                }
                int index = a.lastIndexOf("\\");
                String aa = a.substring(index + 1, a.length());
                if (aa.length() > 16) {
                    aa = aa.substring(aa.length() - 16, aa.length());
                }
                int b = in.nextInt();
                System.out.printf("%s %d %d\n", aa, b, count);
                count++;
            }
        }
    }
}
