/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/12 19:13
 */
class B {
    public B() {
    }
}
public class Test2 extends B {
    int a;
    int b;

    public Test2(int a) {
        this.a = a;
    }

    public Test2(int a, int b) {
        super();
        this.b = b;
    }
}
