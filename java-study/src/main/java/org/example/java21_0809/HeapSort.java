package org.example.java21_0809;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 9, 0, 8, 6, 7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        int index = (arr.length - 1) / 2;
        while (index > 0) {
            dwon(arr, index--);
        }
    }

    private static void dwon(int[] arr, int index) {
        int leftChild = 2 * index;
        while (leftChild < arr.length) {
            if (leftChild + 1 < arr.length && arr[leftChild] > arr[leftChild + 1]) {
                leftChild += 1;
            }
            if (arr[leftChild] < arr[index]) {
                swap(arr, leftChild, index);
            } else {
                break;
            }
            index = leftChild;
            leftChild = 2 * leftChild;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

