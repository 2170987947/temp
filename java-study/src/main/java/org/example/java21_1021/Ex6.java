package org.example.java21_1021;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, 4, 9, 0, 8};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(fastSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    flag = false;
                }
            }
        }
        return arr;
    }

    private static int[] fastSort(int[] arr) {
        _fastSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static int[] _fastSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);
            _fastSort(arr, start, index - 1);
            _fastSort(arr, index + 1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            while (j > i && arr[j] > arr[start]) {
                j--;
            }
            while (j > i && arr[i] < arr[start]) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, start, i);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
