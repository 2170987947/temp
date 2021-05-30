package lession2;

public class JionThread {
    public static void main(String[] args) throws InterruptedException {
//        test();
        test2();
    }

    private static void test() throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
            }
        });
        t.start();
        // main 线程等待 t 线程执行完毕
        t.join();
        System.out.println("main");
    }
    private static void test2() throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("t run");
                    Thread.sleep(5000);
                    System.out.println(" t end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        // main 线程执行完毕，在执行 t
        t.join(2000);
        System.out.println("main");
    }
}
