package lession11;

import java.util.concurrent.*;

public class Pool {
    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                2,
                5,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r);
                    }
                },
                new ThreadPoolExecutor.DiscardPolicy()
        );
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("成功");
            }
        });
        
        ExecutorService service = Executors.newCachedThreadPool();
        ExecutorService service1 = Executors.newFixedThreadPool(5);
        ExecutorService service2 = Executors.newScheduledThreadPool(3);
        ExecutorService service3 = Executors.newSingleThreadExecutor();
    }
}
