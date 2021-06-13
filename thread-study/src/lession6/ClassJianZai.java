package lession6;

public class ClassJianZai {
    public static void main(String[] args) {
        System.out.println(new B().x);
    }
    static class A {
        protected int x = 3;

        public A() {
            System.out.println(x);
            s();
            System.out.println(x);
        }

        public void s() {
            x = 4;
        }
    }

    static class B extends A {
        protected int x = 1;
        public B() {
            System.out.println(x);
        }
        public void s() {
            x = 6;
        }
    }
}
