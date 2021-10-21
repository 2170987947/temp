package org.example.java21_1020;

public class Ex3 {
    // 双重校验锁的单例模式
    public static volatile Ex3 instance = null;
    private Ex3 () {}
    public static Ex3 getInstance() {
        if (instance == null) {
            synchronized (Ex3.class) {
                if (instance == null){
                    instance = new Ex3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3; // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b); // false 两个引用没有引用同一对象
        System.out.println(a == c); // true a自动拆箱成int类型再和c比较
        System.out.println(b == c); // true
    }
}
