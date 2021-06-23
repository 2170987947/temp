package lession8;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.interrupted();
                System.out.println("t");
            }
        });
        t.start();
        t.join();
        System.out.println("main");
    }
}
