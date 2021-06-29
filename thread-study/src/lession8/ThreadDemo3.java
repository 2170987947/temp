package lession8;

public class ThreadDemo3 {
    private static class MyRunnnable implements Runnable {
        @Override
        public void run() {
            // Thread.currentThread().isInterrupted()
            while (!Thread.interrupted()) {
                System.out.println(Thread.currentThread().getName() + ": 别管我，忙着转账呢");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().getName() + ": 有内鬼，终止交易！");
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + ": 啊，险些误了大事");
        }

        public static void main(String[] args) throws InterruptedException {
            MyRunnnable r = new MyRunnnable();
            Thread t = new Thread(r, "李四");
            System.out.println(Thread.currentThread().getName() + ": 让李四开始转账");
            t.start();
            Thread.sleep(10 * 1000);
            System.out.println(Thread.currentThread().getName() + ": 老板来电话了，得赶紧通知李四是个骗子");
            t.interrupt();
            
        }
    }
}
