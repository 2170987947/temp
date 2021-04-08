package org.example.lession2;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 8:30
 */
public class ThreadTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            int n = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(n);
                }
            });
        }
        for (Thread t: threads) {
            t.start();
            // 一个线程启动后并等待该线程执行完, 在执行下一个线程
            t.join();
        }
//        // 实际开发中, 不会这么用, 子线程执行完, 在执行主线程代码
//        while (Thread.activeCount() > 1) {
        // 同时执行 20 个线程, 等这 20 个子线程执行完后, 执行主线程
//            // 让当前线程让步, 从运行态变为就绪态.
//            Thread.yield();
//        }
        // 实际开发中的用法: 让子线程先执行完, 主线程在执行
//        for (Thread t : threads) {
//            t.join();
//        }
        System.out.println("OK");
    }
}
