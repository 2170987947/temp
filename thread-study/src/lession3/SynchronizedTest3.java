package lession3;

public class SynchronizedTest3 {
    private int count;

    public static void main(String[] args) {
        SynchronizedTest3 test = new SynchronizedTest3();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        // 3. 锁同一个对象
                        test.increment();
                    }
                }
            }).start();
        }
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(test.count);
    }
    private Object o = new Object();
    private void increment() {
        synchronized (o) {
            count++;
        }
    }
}
