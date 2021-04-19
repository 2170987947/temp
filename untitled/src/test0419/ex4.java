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

        int[] arr = new int[101];
        int count = 0;
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] ss = s.split(" ");
            for (int j = 0; j < ss.length; j++) {
                arr[count++] = Integer.parseInt(ss[j]);
            }
            tt(count, arr);
        }
    }

    private static void tt(int count, int[] arr) {
        int k = arr[count - 1];
        int[] arr1 = new int[count--];
        for (int i = 0; i < count; i++) {
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr1[i];
        }
        StringBuffer result1 = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            result1.append(result[i]);
            if (i < result.length - 1) {
                result1.append(" ");
            }
        }
        System.out.println(result1);
    }
}