package org.example.java21_0728;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 7, 4};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSortInternal(arr, 0,arr.length - 1);
    }

    private static void quickSortInternal(int[] arr, int left, int right) {
        if (right - left <= 0) {
            return;
        }
        int index = _quickSort(arr, left, right);
        quickSortInternal(arr, left, index - 1);
        quickSortInternal(arr, index + 1, right);
    }

    private static int _quickSort(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && arr[j] >= arr[left]) {
                j--;
            }
            while (i < j && arr[i] <= arr[left]) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, left, j);
        return j;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
