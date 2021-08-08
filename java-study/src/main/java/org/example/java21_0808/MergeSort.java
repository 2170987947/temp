package org.example.java21_0808;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 5, 4, 9, 0};
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
        merge(arr, start, index, end);
    }

    private static void merge(int[] arr, int start, int index, int end) {
        int i = start;
        int j = index;
        int[] tmp = new int[end - start];
        int count = 0;
        while (i < index && j < end) {
            if (arr[i] <= arr[j]) {
                tmp[count++] = arr[i++];
            } else {
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
