package org.example.java21_0728;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 6, 4, 8, 3};
        int[] arr = new int[]{9, 3, 2, 1, 4, 6, 3};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        int index = (start + end) / 2;
        mergeSort(arr, 0, index);
        mergeSort(arr, index, end);
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

