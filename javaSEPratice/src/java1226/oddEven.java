package java1226;

import java.util.Arrays;
//奇数位于偶数之前
//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
public class oddEven {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,8 ,7};
        //打印原数组
        System.out.println("原数组:" + Arrays.toString(arr));
        //调用
        System.out.println("现数组:" + Arrays.toString(array(arr)));
    }

    public static int[] array(int[] arr) {
        int[] arr1 = arr.clone();
        int i = 0;
        int j = arr1.length-1;
        while (i < j) {
            //从前往后找偶数:遇到奇数i++.
            while ((i < j) && (arr1[i] % 2 != 0)) {
                i++;
            }
            //从后往前找奇数:遇到偶数j--.
            while ((i < j) && (arr1[j] % 2 == 0))  {
                j--;
            }
            //满足条件交换
            if (i < j) {
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
            }
        }
        return arr1;
    }
}
