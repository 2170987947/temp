package lession2;

public class InterruptThread2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("转");
                    try {
                        Thread.sleep(100000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
        // t 线程中断标志位 false
        Thread.sleep(3000);
//         t 线程中断标志位置为 true
        t.interrupt();
    }
}
