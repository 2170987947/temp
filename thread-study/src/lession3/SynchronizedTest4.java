package lession3;

public class SynchronizedTest4 {
    private int count;

    public static void main(String[] args) {
        SynchronizedTest4 test = new SynchronizedTest4();
        for (int i = 0; i < 10; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        // 2. 锁当前对象：谁调用的就锁谁
                        if (k >= 0) {
                            synchronized (SynchronizedTest.class) {
                                test.increment();
                            }
                        } else {
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
