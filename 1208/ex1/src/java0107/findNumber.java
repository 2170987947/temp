package java0107;

public class findNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 4,};
        System.out.println(findOnceNumber(arr));
    }

    public static int findOnceNumber(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret ^= arr[i];
        }
        return ret;
    }


}
