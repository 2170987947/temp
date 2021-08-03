package org.example.java21_0802;

import java.util.Arrays;

public class ChangeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 7, 5, 0, 9, 3};
        changeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void changeSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[key] > arr[j]) {
                    key = j;
                }
            }
            swap(arr, key, i);
        }
    }

    private static void swap(int[] arr, int key, int i) {
        int tmp = arr[key];
        arr[key] = arr[i];
        arr[i] = tmp;
    }
}
