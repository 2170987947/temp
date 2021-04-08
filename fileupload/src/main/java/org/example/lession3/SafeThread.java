package org.example.lession3;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 14:01
 */
public class SafeThread {

    private static int COUNT = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        synchronized (SafeThread.class) {
                            COUNT++;
                        }
                    }
                }
            });
        }
        for (Thread t: threads) {
            t.start();
        }
        for (Thread t: threads) {
            t.join();
        }
        System.out.println(COUNT);
    }
}
