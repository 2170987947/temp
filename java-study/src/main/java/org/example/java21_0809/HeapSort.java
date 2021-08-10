package org.example.java21_0809;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 9, 0, 8, 6, 7};
        createHeap(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void createHeap(int[] arr) {
        int index = (arr.length - 1) / 2;
        while (index >= 0) {
            dwon(arr, index--, arr.length);
        }
    }

    private static void heapSort(int[] arr) {
        int count = arr.length;
        while (count > 0) {
            swap(arr, 0, --count);
            dwon(arr, 0, count);
        }
    }

    private static void dwon(int[] arr, int index, int count) {
        int leftChild = 2 * index + 1;
        while (leftChild < count) {
            if (leftChild + 1 < count && arr[leftChild] > arr[leftChild + 1]) {
                leftChild += 1;
            }
            if (arr[leftChild] < arr[index]) {
                swap(arr, leftChild, index);
            } else {
                break;
            }
            index = leftChild;
            leftChild = 2 * index + 1;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

