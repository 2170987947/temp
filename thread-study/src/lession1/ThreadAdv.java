package lession1;

public class ThreadAdv {
    public static void main(String[] args) throws InterruptedException {
        // 1. 串行执行
//        long start = System.nanoTime();
//        for (int i = 0; i < 8; i++) {
//            test();
//        }
//        long end = System.nanoTime();
//        System.out.printf("串行耗时： %s毫秒%n", (end - start) / 1000/ 1000);

        // 2. 并行执行
        long start2 = System.nanoTime();
        for (int i = 0; i < 4; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 2; i++) {
                        try {
                            test();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        Runtime.getRuntime().availableProcessors();
        // 计算两个子线程中的并发执行时间
        // 等待子线程执行完毕再向下执行
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        long end2 = System.nanoTime();
        System.out.printf("并行耗时： %s毫秒%n", (end2 - start2) / 1000 / 1000);
    }

    public static void test() throws InterruptedException {
//        Thread.sleep(1000);
        int n = 1000000000;
        long x = 0;
        for (long i = 0; i < n; i++) {
            x++;
        }
    }
}
