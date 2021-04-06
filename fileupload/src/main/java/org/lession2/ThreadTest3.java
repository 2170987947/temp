package org.lession2;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 8:38
 */
public class ThreadTest3 {
    public static void main(String[] args) throws InterruptedException {
        // t 和 main 同时并发并行执行, 但因为 main 线程
        // 正在运行态执行, 很快执行后续代码, 打印 main 和 t
        // 本来应该乱序随机, 但实现打印 main 的概率非常高
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                // 内部类使用外部类的变量, 必须是 final 修饰
                System.out.println("t");
//                try {
//                    Thread.sleep(10000000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }); // 申请系统创建 t 线程
        // 申请系统执行线程 t, 创建态变为就绪态, 由系统决定什么时候变为运行态
        t.start();
//        while (Thread.activeCount() > 1) {
//            // 让当前线程让步, 从运行态变为就绪态.
//            Thread.yield();
//        }
        t.join();
        System.out.println("main");
    }
}
