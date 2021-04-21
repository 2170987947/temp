package java0108;

public class Average {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("arr 中各元素的和 : " + (sum(arr)));
        System.out.println("平均值 : " + avg(arr));
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int avg(int[] arr) {
        int total = sum(arr);
        return total/arr.length;
    }
}
