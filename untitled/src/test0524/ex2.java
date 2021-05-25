package test0524;

public class ex2 {
    // 0-1 背包问题
    public int getFirstUnFormedNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i : arr) {
            min = Math.min(min, i);
            max += i;
        }
        boolean[] result = new boolean[max + 1];
        result[0] = true;
        for (int o : arr) {
            for (int i = max; i >= o; i--) {
                result[i] = result[i - o] || result[i];
            }
        }
        for (int i = min; i < result.length; i++) {
            if (!result[i]) {
                return i;
            }
        }
        return max + 1;
    }
}
