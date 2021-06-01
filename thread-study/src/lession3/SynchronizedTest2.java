package lession3;

public class SynchronizedTest2 {
    private int count;

    public static void main(String[] args) {
        SynchronizedTest2 test = new SynchronizedTest2();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        // 2. 锁当前对象：谁调用的就锁谁
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

    private synchronized void increment() {
        count++;
    }
}
