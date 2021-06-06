package lession4;

import java.util.concurrent.*;

public class 线程池 {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                4,
                10,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r);
                    }
                },
//                new ThreadPoolExecutor.CallerRunsPolicy()
//                new ThreadPoolExecutor.AbortPolicy()
//                new ThreadPoolExecutor.DiscardOldestPolicy()
                new ThreadPoolExecutor.DiscardPolicy()
        );
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
        ExecutorService single = Executors.newSingleThreadExecutor();
        ExecutorService fixed = Executors.newFixedThreadPool(5);
        ExecutorService cached = Executors.newCachedThreadPool();
        ExecutorService scheduled = Executors.newScheduledThreadPool(4);
    }
}
