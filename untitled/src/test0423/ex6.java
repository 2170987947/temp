package test0423;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 14:38
 */
public class ex6 {
    public static void main(String[] args) {
        ex6 ex6 = new ex6();
        System.out.println(ex6.getLCA(5, 15));
    }
    public int getLCA(int a, int b) {
        return zuxian(a - 1, b - 1) + 1;
    }
    private static int zuxian(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if ((a - 1) / 2 == b) {
            return b;
        }
        if ((b - 1) / 2 == a) {
            return a;
        }
        if (a < b) {
            int tep = a;
            a = b;
            b = tep;
        }
        int left = zuxian((a - 1) / 2, b);
        if (left >= 0) {
            return left;
        }
        int right = zuxian(b, (b - 1) / 2);
        if (right >= 0) {
            return right;
        }
        return -1;
    }
}
