package org.example.java21_0728;

import java.util.Arrays;

public class QuickSort_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 5, 3, 7};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        _quickSort(arr, 0, arr.length - 1);
    }

    private static void _quickSort(int[] arr, int start, int end) {
        if (end - start <= 0) {
            return;
        }
        int index = partition(arr, start, end);
        _quickSort(arr, start, index - 1);
        _quickSort(arr, index + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int left = start;
        int ringht = end;
        while (left < ringht) {
            while (left < ringht && arr[ringht] >= arr[start]) {
                ringht--;
            }
            while (left < ringht && arr[left] <= arr[start]) {
                left++;
            }
            swap(arr, left, ringht);
        }
        swap(arr, ringht, start);
        return ringht;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
