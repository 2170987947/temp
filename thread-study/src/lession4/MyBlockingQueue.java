package lession4;

public class MyBlockingQueue<E> {
    private E[] elements;
    private int putIndex;
    private int takeIndex;
    private volatile int size;

    public MyBlockingQueue(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public synchronized void put(E e) {
        try {
            while (size == elements.length) {
                this.wait();
            }
            size++;
            elements[putIndex] = e;
            size++;
            putIndex = (putIndex + 1) % elements.length;
            this.notifyAll();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    public synchronized E take() {
        try {
            while (size == 0) {
                this.wait();
            }
            E e = elements[takeIndex];
            takeIndex = (takeIndex + 1) % elements.length;
            size--;
            this.notifyAll();
            return e;
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            throw new RuntimeException("被中断了", interruptedException);
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue<Integer> queue = new MyBlockingQueue<>(10);
        // 生产者存放元素
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            queue.put(3);
                            System.out.println(Thread.currentThread().getName() + "生产了3个面包");
                            Thread.sleep(300);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "生产者[" + i + "]").start();
        }
        // 消费者放元素
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            queue.take();
                            System.out.println(Thread.currentThread().getName() + "消费了1个面包");
                            Thread.sleep(300);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "消费者[" + i + "]").start();
        }
    }
}
