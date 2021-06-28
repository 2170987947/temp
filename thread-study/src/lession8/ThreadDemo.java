package lession8;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + "： 我还活着");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread() + ": 我即将死去");
        }, "t");
//        System.out.println(Thread.currentThread().getName() + ": Id: " + Thread.currentThread().getId());
//        System.out.println(Thread.currentThread().getName() + ": Name: " + Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName() + ": 状态: " + Thread.currentThread().getState());
//        System.out.println(Thread.currentThread().getName() + ": 优先级： " + Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getName() + ": 后台线程： " + Thread.currentThread().isAlive());
//        System.out.println(Thread.currentThread().getName() + "： 活着： " + Thread.currentThread().isAlive());
//        System.out.println(Thread.currentThread().getName() + "： 被中断： " + Thread.currentThread().isInterrupted());
        t.start();
        while (t.isAlive()) {
            System.out.println(Thread.currentThread().getName() + ": 状态：" + t.getState());
        }
    }
}
