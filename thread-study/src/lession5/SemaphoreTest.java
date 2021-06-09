package lession5;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        for (int j = 0; j < 10; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(2);
                    } finally {
                        semaphore.release();
                    }
                }
            }).start();
        }
        semaphore.acquire(10);
        System.out.println(1);
    }
}
