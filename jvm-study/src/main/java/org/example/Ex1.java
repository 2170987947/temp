package org.example;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
                Thread.yield();
            }
        });
        t.start();
        t.join(1000);
        System.out.println("main");
    }
}
