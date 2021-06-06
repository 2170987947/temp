package lession4;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeAdd {
    private static AtomicInteger COUNT = new AtomicInteger();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        COUNT.getAndIncrement();
                    }
                }
            }).start();
        }
        while (Thread.activeCount() > 1)  {
            Thread.yield();
        }
        System.out.println(COUNT);
    }
}
