package test0419;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/19 19:03
 */
public class ex2 {
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }
}
class A {

    protected int value;

    public A(int value) {
        this.value = value;
    }

    public int getValue() {
        try {
            value++;
            return value;
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            this.setValue(value);
            System.out.println(value);
        }
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
class B extends A {

    public B() {
        super(5);
        setValue(getValue() - 3);
    }
    @Override
    public void setValue(int value) {
        super.setValue(2 * value);
    }
}
