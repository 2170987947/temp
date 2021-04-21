package test0421;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/21 19:08
 */
public class ex7 {
    public static void main(String[] args) {
        byte b1 = 1, b2 = 2, b3, b6;
        final byte b4 = 4, b5 = 6;
        b6 = b4 + b5;
        b3 = (byte) (b1 + b2);
        System.out.println(b3 + b6);
    }
}
