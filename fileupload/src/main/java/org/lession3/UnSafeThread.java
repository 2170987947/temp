package org.lession3;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 11:36
 */
public class UnSafeThread {

    private static int COUNT = 0;
    // 有一个变量 COUNT = 0;
    // 同时启动 20 个线程, 每个线程循环 1000 次.
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        COUNT++;
                    }
                }
            });
        }
        for (Thread t: threads) {
            t.start();
        }
        // 让 main 线程等待 20 个子线程
        for (Thread t: threads) {
            t.join();
        }
        System.out.println(COUNT);
    }
}
