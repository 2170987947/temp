package java0118;

import java.util.Arrays;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/18 16:58
 */
//给定两个整型数组, 交换两个数组的内容.
public class SwapArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        swap(a,b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void swap(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }
}
