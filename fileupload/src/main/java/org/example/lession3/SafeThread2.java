package org.example.lession3;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 14:01
 */
public class SafeThread2 {

    private static int COUNT = 0;
    // 对当前对象加锁
    public synchronized static void increment() {
        COUNT++;
        // 还未还锁, 就可重入, 重用
        deincrement();
    }
    public synchronized static void deincrement() {
        COUNT--;
    }
    // 实例方法写
//    public synchronized void increment() {
//        COUNT++;
//    }
    // 每次都创建对象, 相当于没加锁
//    public static void increment() {
//        synchronized (new SafeThread2()) {
//            COUNT++;
//        }
//    }

    public static void main(String[] args) throws InterruptedException {
        SafeThread2 safeThread2 = new SafeThread2();
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 19; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        // 1.
//                        synchronized (SafeThread2.class) {
//                            COUNT++;
//                        }
                        // 2.
                        increment(); // 静态同步方法
                        // 3.
//                        safeThread2.increment(); // 实例同步方法
                        // 4.
//                        synchronized (safeThread2) {
//                            COUNT++;
//                        }
                    }
                }
            });
        }

        for (int i = 19; i < 20; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
//                        COUNT++;
//                        safeThread2.increment();
//                        synchronized (safeThread2) {
//                            COUNT++;
//                        }
                        increment();
                    }
                }
            });
        }
        for (Thread t: threads) {
            if (t != null)
            t.start();
        }
        for (Thread t: threads) {
            if (t != null)
                t.join();
        }
        System.out.println(COUNT);
    }
}
