package lession5;

import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class LatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        for (int j = 0; j < 10; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(2);
                    } finally {
                        latch.countDown();
                    }
                }
            }).start();
        }
        latch.await();
        System.out.println(1);
        Set
    }
}
