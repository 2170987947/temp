package org.example.java21_0802;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, 3, 9};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        _mergeSort(arr, 0, arr.length);
    }

    private static void _mergeSort(int[] arr, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        int index = (start + end) / 2;
        _mergeSort(arr, start, index);
        _mergeSort(arr, index, end);
        guibing(arr, start, index, end);
    }

    private static void guibing(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int[] tmp = new int[end - start];
        int count = 0;
        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                tmp[count++] = arr[i++];
            }
            if (arr[i] > arr[j]) {
                tmp[count++] = arr[j++];
            }
        }
        while (i < mid) {
            tmp[count++] = arr[i++];
        }
        while (j < end) {
            tmp[count++] = arr[j++];
        }
        while (count > 0) {
            arr[--j] = tmp[--count];
        }
    }
}
