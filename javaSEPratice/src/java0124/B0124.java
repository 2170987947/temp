package java0124;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/24 7:21
 */
public class B0124 {
    int a;
    int b;
    double c;
    // 无参
    public void b1() {
        System.out.println(this.a + this.b);
    }
    // 一个 int 类型的参数
    public int b1(int b) {
        this.b = b;
        return (this.a + this.b);
    }
    // 一个 double 类型的参数
    public int b1(double b) {
        this.c = b;
        return (this.a + this.b);
    }
    // 两个 int 类型的参数
    public void b1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(this.a + this.b);
    }
}
