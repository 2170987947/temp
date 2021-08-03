package org.example.java21_0802;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 5, 4, 3, 8, 0, 9};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for (int bound = 1; bound < arr.length; bound++) {
            int key = arr[bound];
            for (int i = bound - 1; i >= 0; i--) {
                if (key < arr[i]) {
                    arr[i + 1] = arr[i];
                }
            }
        }
    }
}
