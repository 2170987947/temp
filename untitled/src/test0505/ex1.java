package test0505;

import java.util.*;
/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/5 18:48
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[m + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.MAX_VALUE;
            }
            for (int i = n; i < m; i++) {
                ret(i, m, arr);
            }
            System.out.println(arr[m]);
        }
    }
    private static List<Integer> yueshu(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
    public static void ret(int n, int m, int[] arr) {
        List<Integer> list = yueshu(n);
        for (int i: list) {
            if ((n + i) <= m) {
                arr[n + i] = Math.min(arr[n + i], arr[n] + 1);
            }
        }
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                if ((n + i) <= m) {
//                    if (arr[n + i] == 0) {
//                        arr[n + i] = arr[n] + 1;
//                    } else if (arr[n + i] > arr[n] + 1) {
//                        arr[n + i] = arr[n] + 1;
//                    }
//                }
//            }
//        }
    }
}
