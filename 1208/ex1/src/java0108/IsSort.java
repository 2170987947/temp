package java0108;

import java.util.Arrays;

public class IsSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("arr 数组 : " + Arrays.toString(arr));
        System.out.println("该数组是否有序 : " + isSort(arr));
        int[] arr2 = {1, 3, 2};
        System.out.println("arr2 数组 : " + Arrays.toString(arr2));
        System.out.println("该数组是否有序 : " + isSort(arr2));
    }

    public static boolean isSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

}
