package test0416;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/16 10:21
 */
public class ex3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("2");
            }
        });
        t.start();
        t.join();
        System.out.println("1");
    }
}
