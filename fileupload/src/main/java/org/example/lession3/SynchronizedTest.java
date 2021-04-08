package org.example.lession3;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 14:01
 */
public class SynchronizedTest {

    private static int COUNT;

    public static void increment() {
        COUNT++;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (SynchronizedTest.class) {
                    increment();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        }).start();

    }
}
