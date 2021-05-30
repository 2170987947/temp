package lession1;

public class See {
    public static void main(String[] args) throws InterruptedException {
//        test1();
        test2();
    }

    private static void test1() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                }
//                System.out.println("t");
            }
        });
        t.start();
        System.out.println("main");
    }

    private static void test2() throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
                try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
//        Thread.sleep(3000);
        System.out.println("main");
    }
}
