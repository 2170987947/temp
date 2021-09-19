package org.example.java21_0918;

public class Ex1 extends Exception {
    public static void main(String[] args) {
        Exception ex1 = new Ex1("错嘞", new RuntimeException());
    }

    public Ex1() {
        super();
        System.out.println("无参构造函数");
    }

    public Ex1(String message) {
        super(message);
        System.out.println("有参构造函数：" + message);
    }

    public Ex1(String message, Throwable cause) {
        super(message, cause);
        System.out.println("有参构造 String ：" + message + ", cause: " + cause);
    }

    public Ex1(Throwable cause) {
        super(cause);
        System.out.println("有参构造 cause：" + cause);
    }

    protected Ex1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        System.out.println("有参构造函数： message：" + message + ", cause: " + cause + ", enableSuppression: " + enableSuppression
        + ", writableStackTrace: " + writableStackTrace);
    }
}
