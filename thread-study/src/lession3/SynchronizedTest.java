package lession3;

public class SynchronizedTest {
    private int count;

    public static void main(String[] args) {
        SynchronizedTest test = new SynchronizedTest();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        // 1. 锁类对象
                        synchronized (SynchronizedTest.class) {
                            test.increment();
                        }
                    }
                }
            }).start();
        }
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(test.count);
    }

    private void increment() {
        count++;
    }
}
