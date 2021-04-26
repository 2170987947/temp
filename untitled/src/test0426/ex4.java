package test0426;

import java.util.*;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/26 19:45
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int sum = 0;
        int ji = 1;
        int ret = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                ret += list.size() - i;
            }
            sum += list.get(i);
            ji *= list.get(i);
            if (sum > ji) {
                ret++;
            }
        }
        System.out.println(ret);
    }
}
