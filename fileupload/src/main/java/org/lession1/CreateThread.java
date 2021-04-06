package org.lession1;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/5 15:00
 */
public class CreateThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread t = new Thread(runnable, "子线程 A");
        t.start();

        // 合并代码
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }, "子线程 B").start();

        // runnable 只有一个接口方法
        // 可以直接用 lambda 表达式
        new Thread(() -> {

        }, "子线程 C").start();
    }
}
