package test0419;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/19 19:54
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
            String[] ss = s.split(" ");
            int[] arr = new int[ss.length - 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(ss[j]);
            }
            tt(Integer.parseInt(ss[ss.length - 1]), arr);
        }
    }

    private static void tt(int k, int[] arr) {
        Arrays.sort(arr);

        StringBuffer result1 = new StringBuffer();
        for (int i = 0; i < k; i++) {
            result1.append(arr[i]);
            if (i < k - 1) {
                result1.append(" ");
            }
        }
        System.out.println(result1);
    }
}