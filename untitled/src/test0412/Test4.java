package test0412;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/12 19:27
 */
class A {
    public A() {
        System.out.println("Base");
    }
}
class A1 extends A {
    public A1() {
        System.out.println("Base");
    }
}
public class Test4 extends A1 {
    public Test4() {
        System.out.println("Base");
    }

    public static void main(String[] args) {

        A a = new A();
        System.out.println();
        A b = new A1();
        System.out.println();
        A c = new Test4();
    }
}
