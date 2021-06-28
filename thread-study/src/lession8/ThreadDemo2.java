package lession8;

public class ThreadDemo2 {
    private static class MyRunnable implements Runnable {
        private volatile boolean isQuit = false;

        @Override
        public void run() {
            while (!isQuit) {
                System.out.println(Thread.currentThread() + ": 别管我，忙着转钱呢");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "：啊，险些误了大事");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r, "李四");
        System.out.println(Thread.currentThread().getName() + ": 让李四开始转账");
        t.start();
        Thread.sleep(10 * 1000);
        System.out.println(Thread.currentThread().getName() + ": 老板来了，得赶紧通知李四对方是个骗子！\"");
        r.isQuit = true;
    }
}
