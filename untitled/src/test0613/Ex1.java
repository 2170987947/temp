package test0613;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(findMaxGap(new int[]{2, 7, 3, 1, 1}, 5));
    }
    private static int jie(int[] A, int n, int k) {
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (i <= k) {
                left = Math.max(left, A[i]);
            } else {
                right = Math.max(right, A[i]);
            }
        }
        return (left - right) > 0 ? (left - right) : (right - left);
    }
    public static int findMaxGap(int[] A, int n) {
        // write code here
        int[] r = new int[n - 1];
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            r[i] = jie(A, n, i);
            max = Math.max(r[i], max);
        }
        return max;
    }
}
