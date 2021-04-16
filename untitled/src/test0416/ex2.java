package test0416;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/16 10:16
 */
public class ex2 {
    public static void main(String[] args) {
//        StringBuffer a = new StringBuffer("A");
//        StringBuffer b = new StringBuffer("B");
//        operate(a, b);
//        System.out.println(a + "." + b);
    }

    private static void operate(StringBuffer a, StringBuffer b) {
        a.append(b);
        b = a;
    }
}
