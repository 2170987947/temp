package org.example.java21_1015;

public class Ex1 {
    // 双重校验锁的单例模式
    private static Ex1 ex1;
    private Ex1() {}
    public static Ex1 getInstance() {
        if (ex1 == null) {
            synchronized (Ex1.class) {
                if (ex1 == null) {
                    ex1 = new Ex1();
                }
            }
        }
        return ex1;
    }
}
