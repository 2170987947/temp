package java0124;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/24 21:30
 */
public interface Inter0124_2 extends Inter0124{
    void fun2();
    static void main(String[] args) {
        System.out.println("静态方法");
        A0124 a0124 = new A0124();
        a0124.fun1();
    }
}
