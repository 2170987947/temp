package lession8;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.activeCount());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
        while (true) {
            System.out.println(t.getState());
        }
    }
}
