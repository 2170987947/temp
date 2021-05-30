package lession1;

public class InnerClass {

    public static void main(String[] args) {
        A a = new A();
        A aa = new A() {
            @Override
            public void pro() {
                System.out.println("pro");
            }
        };
        aa.pro();
    }

    static class A {
        public void pro() {
            System.out.println("a pro");
        }
    }

    static interface B {

    }
}
