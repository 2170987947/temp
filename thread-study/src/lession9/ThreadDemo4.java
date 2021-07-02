package lession9;

public class ThreadDemo4 {
    private static int COUNT = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread[] t = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            t[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (ThreadDemo4.class) {
                        COUNT++;
                    }
                }
            });
        }
        for (int i = 0; i < 1000; i++) {
            t[i].start();
        }
        while (Thread.activeCount() > 1) {
//            Thread.currentThread().join();
            Thread.yield();
        }
        System.out.println(COUNT);
    }
}
