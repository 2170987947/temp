package java0118;

import java.util.Arrays;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/18 16:15
 */
//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
//从前往后找奇数,从后往前找偶数.交换
public class TestDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 0};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(swap(a)));
    }

    public static int[] swap(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            while (i < j && a[i] % 2 == 0) {
                i++;
            }
            while (i < j && a[j] % 2 != 0) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return a;
    }
}
