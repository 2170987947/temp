package test0424;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/24 10:07
 */
public class ex1 {
    public static void main(String[] args) {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + " ");
        add(b);
        System.out.println(b + " ");
    }

    private static void add(Byte aByte) {
        aByte = aByte++;
    }
}
