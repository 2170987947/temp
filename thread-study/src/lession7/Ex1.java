package lession7;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
                System.out.println(Thread.currentThread());
            }
        }, "Thread");
        t.start();
        Thread.yield();
        t.join();
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread());
        System.out.println("main");
    }
}
