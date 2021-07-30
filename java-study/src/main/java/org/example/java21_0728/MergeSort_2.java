package org.example.java21_0728;

import java.util.Arrays;

public class MergeSort_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 4};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        mergeSortInternal(arr, 0, arr.length);
    }

    private static void mergeSortInternal(int[] arr, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        int index = (end + start) / 2;
        mergeSortInternal(arr, start, index);
        mergeSortInternal(arr, index, end);
        _mergeSort(arr, start, index, end);
    }

    private static void _mergeSort(int[] arr, int start, int index, int end) {
        int[] tmp = new int[end - start];
        int count = 0;
        int i = start;
        int j = index;
        while (i < index && j < end) {
            if (arr[i] <= arr[j]) {
                tmp[count++] = arr[i++];
            }
            if (arr[i] > arr[j]) {
                tmp[count++] = arr[j++];
            }
        }
        while (i < index) {
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
