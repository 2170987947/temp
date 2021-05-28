package test0527;

public class ex1 {
    // 0-1 背包
    public static void main(String[] args) {
        System.out.println(minNotConnect(new int[]{2, 3, 5}));
    }
    public static int minNotConnect(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max += arr[i];
        }
        boolean[] is = new boolean[max + 1];
        is[0] = true;
        for (int o : arr) {
            for (int j = max; j >= o; j--) {
                is[j] = is[j] || is[j - o];
            }
        }
        for (int i = min; i <= max; i++) {
            if (!is[i]) {
                return i;
            }
        }
        return max + 1;
    }
}
