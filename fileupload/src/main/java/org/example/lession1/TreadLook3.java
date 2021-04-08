package org.example.lession1;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/5 14:16
 */
public class TreadLook3 {
    public static void main(String[] args) {
        // 第一种创建线程的方式
        // main 线程中: new 了一个线程对象, 匿名内部类 thread 子类重写 run 方法
        Thread t = new Thread() {
            @Override
            public void run() { // 线程进入运行态之后执行
                while (true) {

                }
            }
        };
        // 线程要启动, 必须使用 start() 告诉系统调度本线程
        // 申请系统调用, 线程由创建态变为就绪态, 什么时候变为运行态, 由系统决定
        t.start();
        while (true) { // main 线程空跑

        }
    }
}
