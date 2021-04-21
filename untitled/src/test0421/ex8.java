package test0421;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/21 19:11
 */
public class ex8 {
    public static void main(String[] args) {
        ex8 e = new ex8();
        System.out.println("和是: " + e.add(9, 34));
    }

    private int add(int i, int i1) {
        try {
            return i + i1;
        } catch (Exception e) {
            System.out.println("catch 语句块");
        } finally {
            System.out.println("finally 语句块");
        }
        return 0;
    }
}
