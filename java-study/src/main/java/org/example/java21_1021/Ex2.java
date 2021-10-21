package org.example.java21_1021;

import java.util.Arrays;

public class Ex2 {
    // 冒泡排序
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 3, 0, 7, 9, 5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    
    public static int[] bubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur] < arr[cur - 1]) {
                    swap(arr, cur, cur - 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
