package lession4;

/**
 * 简易版本线程池
 * 创建一个指定数量的线程池，new 出来就启动线程：
 * 不停在队列中取任务（有就获取到，没有就等待），执行任务
 */
public class MyThreadPool {
    private MyBlockingQueue<Runnable> queue = new MyBlockingQueue<>(100);

    public MyThreadPool(int num) {
        for (int i = 0; i < num; i++) {
            // 创建指定数量的线程，启动
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        Runnable task = queue.take();
                        task.run();
                    }
                }
            }).start();
        }
    }

    public void execute(Runnable task) {
        queue.put(task);
    }

    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool(4);
        for (int i = 0; i < 10; i++) {
            myThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                    }
//                        System.out.println("1");
                }
            });

        }
    }
}
