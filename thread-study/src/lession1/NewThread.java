package lession1;

public class NewThread {
    public static void main(String[] args) {
        // 第一种方式
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("r run");
            }
        };
        t.start();
        // 2. 第二种方式
        Thread tt = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                }
            }
        }, "tt");
        tt.start();
        // 3. 第三种方式
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("rr");
            }
        };
        Thread ttt = new Thread(r);
        while (true) {

        }
    }
}
