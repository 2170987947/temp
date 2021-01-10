package java0108;

import java.util.Arrays;

public class Transform {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("原数组 : " + Arrays.toString(arr));
        System.out.println("调用函数返回的数组 : " + Arrays.toString(transform(arr)));
        System.out.println("被修改的原数组 : " + Arrays.toString(arr));
    }

    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
