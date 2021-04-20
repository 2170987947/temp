package test0420;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/20 13:12
 */
class Base {
    public Base(String s) {
        System.out.println("B");
    }
}
public class ex1 extends Base {

    public ex1(String s) {
        super("c");
        System.out.println("D");
    }

    public static void main(String[] args) {
        new ex1("C");
    }
}
