package lession9;

public class ThreadDemo6 {
    private static class Counter {
        private long n = 0;
        public synchronized void increment() {
            n++;
        }
        public synchronized void decrement() {
            n--;
        }
        public synchronized long value() {
            return n;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        final int COUNT = 1000_000;
        Counter counter = new Counter();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < COUNT; i++) {
                    counter.increment();
                }
            }
        }, "李四");
        t.start();
        for (int i = 0; i < COUNT; i++) {
            counter.decrement();
        }
        t.join();
        System.out.println(counter.value());

    }
}
