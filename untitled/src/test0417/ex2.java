package test0417;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/17 9:46
 */
class A {
    {
        System.out.println("This is A");
    }
    static {
        System.out.println("static A");
    }
}
class B extends A {
    {
        System.out.println("This is B");
    }
    static {
        System.out.println("static B");
    }
}
public class ex2 {
    public static void main(String[] args) {
        new B();
    }
}
