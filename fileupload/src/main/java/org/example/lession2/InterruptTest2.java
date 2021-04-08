package org.example.lession2;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 9:32
 */
public class InterruptTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                // 终端以后, 停止执行
                for (int i = 0; i < 10000; i++) {
//                    System.out.println(i + ": " + Thread.currentThread().isInterrupted());
                    System.out.println(i + ": " + Thread.interrupted());
                }
            }
        });
        t.start();
        System.out.println("t.start");
        // 告诉 t 线程中断, 设置 t 现成的中断标志位为 true,
        // 由 t 线程自行写代码决定中断
        // 如果 t 线程处于阻塞状态, 会抛出 InterruptedException, 清除中断标志位
        t.interrupt();
        System.out.println("t.stop");
    }
}
