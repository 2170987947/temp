package lession8;

public class ThreadDemo6 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        t.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2");
            }
        });
        t2.start();
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}
