package org.example.java21_0922;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyFixedThreadPool {

    private BlockingQueue<Runnable> queue;

    List<Worker> workers;

    volatile Boolean working = true;

    public MyFixedThreadPool(int poolSize, int queueSize) {
        queue = new LinkedBlockingQueue(queueSize);
        workers = new ArrayList<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            Worker worker = new Worker(this);
            workers.add(worker);
            worker.start();
        }
    }

    public boolean submit(Runnable r) {
        if (working) {
            return queue.offer(r);
        }
        return false;
    }

    public void shutdown() {
        this.working = false;
        for (Thread worker : workers) {
            if (worker.getState() == Thread.State.BLOCKED || worker.getState() == Thread.State.WAITING
            || worker.getState() == Thread.State.TIMED_WAITING) {
                worker.interrupt();
            }
        }
    }
    private static class Worker extends Thread {
        MyFixedThreadPool pool;

        public Worker(MyFixedThreadPool pool) {
            this.pool = pool;
        }

        @Override
        public void run() {
            while (pool.working || pool.queue.size() > 0) {
                try {
                    Runnable r;
                    if (!pool.working) {
                        r = pool.queue.poll();
                    } else {
                        r = pool.queue.take();
                    }
                    if (r != null) {
                        r.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyFixedThreadPool myFixedThreadPool = new MyFixedThreadPool(3, 5);
        for (int i = 0; i < 5; i++) {
            myFixedThreadPool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "执行完");
                }
            });
        }
        Thread.sleep(220L);
        myFixedThreadPool.shutdown();

    }
}
