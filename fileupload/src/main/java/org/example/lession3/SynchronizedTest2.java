package org.example.lession3;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 15:04
 */

public class SynchronizedTest2 {

    /**
     * 有一个教室, 50 个座位, 同时有三个老师安排作业, 每个老师100 个同学
     */
    private static int size = 50;

    public synchronized static void deincrement() {
        size--;
    }
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                while (size > 0) {
                    synchronized (SynchronizedTest2.class) {
//                        deincrement();
                        System.out.println(Thread.currentThread().getName() + "老师安排 " + size-- + "号同学入座");
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(run, "li").start();
        new Thread(run, "wang").start();
        new Thread(run, "zhao").start();
    }
}
