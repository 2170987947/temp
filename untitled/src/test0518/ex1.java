package test0518;

public class ex1 {

    public static void main(String[] args) {
        System.out.println(jumpFloorII(1));
    }

    public static int jumpFloorII(int target) {
        int[] count = new int[target + 1];
        for (int i = 1; i < count.length; i++) {
            count[i] = sum(i, count);
        }
        return count[target];
    }

    private static int sum(int i, int[] count) {
        int total = 0;
        for (int num = 0; num <= i; num++) {
            total += count[num];
        }
        return total + 1;
    }
}
