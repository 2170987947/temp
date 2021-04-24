package test0424;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/24 21:55
 */
public class ex2 {
    public static int binInsert(int n, int m, int j, int i) {
        // write code here
        return n + m * (int) Math.pow(2, j);
    }

    public static void main(String[] args) {
        System.out.println(binInsert(1024, 19, 2, 6));
    }
}
