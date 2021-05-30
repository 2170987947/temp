package lession2;

public class WaitAndJion {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
            }
        });
        t.start();
        t.join();

        System.out.println("main");
    }
}
