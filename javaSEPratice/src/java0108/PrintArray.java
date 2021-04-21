package java0108;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length - 1 == i) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

}
