package test0421;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/21 19:19
 */
public abstract class ex10 {
    public static void main(String[] args) {
        System.out.println(countWays(3, 3));
    }
    public static int countWays(int x, int y) {
        if (x == 0 || y == 0 || (1 == x && 1 == y)) {
            return 0;
        }
        return bu(x, y);
    }

    private static int bu(int x, int y) {
        int count = 0;
        if (x == 1 || y == 1) {
            return 1;
        }
        // 左走
        if (y > 1) {
            count += countWays(x, y - 1);
        }
        if (x > 1){
            count += countWays(x - 1, y);
        }
        return count;
    }
}
