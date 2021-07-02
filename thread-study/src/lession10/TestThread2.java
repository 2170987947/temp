package lession10;

class MyThread2 implements Runnable {
    private boolean flag;
    private Object object;

    public MyThread2(boolean flag, Object object) {
        super();
        this.flag = flag;
        this.object = object;
    }

    public void waitMethod() {
        synchronized (object) {
            try {
                while (true) {
                    System.out.println("wait()方法开始" + Thread.currentThread().getName());
                    object.wait();
                    System.out.println("wait()方法结束" + Thread.currentThread().getName());
                    return;
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void notifyMethod() {
        synchronized (object) {
            try {
                while (true) {
                    System.out.println("notify()方法开始" + Thread.currentThread().getName());
                    object.notifyAll();
                    System.out.println("notify()方法结束" + Thread.currentThread().getName());
                    return;
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        if (flag) {
            this.waitMethod();
        } else {
            this.notifyMethod();
        }
    }
}
public class TestThread2 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        MyThread2 waitThread1 = new MyThread2(true, object);
        MyThread2 waitThread2 = new MyThread2(true, object);
        MyThread2 waitThread3 = new MyThread2(true, object);
        MyThread2 notifyThread = new MyThread2(false, object);
        Thread thread1 = new Thread(waitThread1, "wait线程A");
        Thread thread2 = new Thread(waitThread2, "wait线程B");
        Thread thread3 = new Thread(waitThread3, "wait线程C");
        Thread thread4 = new Thread(notifyThread, "notify线程");
        thread1.start();
        thread2.start();
        thread3.start();
        Thread.sleep(1000);
        thread4.start();
        System.out.println("main方法结束!!");
    }
}
