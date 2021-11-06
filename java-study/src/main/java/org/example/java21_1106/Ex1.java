package org.example.java21_1106;

import java.util.Arrays;

public class Ex1 {
    // 快速排序
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 5, 3, 8, 0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] arr, int start, int end) {
        if (end - start < 1) {
            return;
        }
        int index = partition(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && arr[j] > arr[start]) {
                j--;
            }
            while (i < j && arr[i] < arr[start]) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, j, start);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
