package org.example.java0922;

import java.util.concurrent.CountDownLatch;

public class Ex1 {
    public static void main(String[] args) {
        CountDownLatch c = new CountDownLatch(1);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
