package java0108;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3};
        System.out.println("原数组 arr : " + Arrays.toString(arr));
        copyof(arr);
    }

    public static void copyof(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("自己实现的数组拷贝 arr2 : " + Arrays.toString(arr2));
    }
}
