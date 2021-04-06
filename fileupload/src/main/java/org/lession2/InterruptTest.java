package org.lession2;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 9:32
 */
public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
//                // 中断以后, 继续执行
//                for (int i = 0; i < 10000 && !Thread.currentThread().isInterrupted(); i++) {
//                    try {
//                        System.out.println(i);
//                        // 休眠也能中断, 使用抛异常的方式
//                        Thread.sleep(1000);
////                            Thread.sleep(100000);
//                        // 通过标志位自行实现, 无法解决线程阻塞导致无法中断
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }

                // 终端以后, 停止执行
                try {
                    for (int i = 0; i < 10000 && !Thread.currentThread().isInterrupted(); i++) {
                        System.out.println(i);
//                        Thread.sleep(1000);
                        Thread.sleep(100000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t.start();
        System.out.println("t.start");
        Thread.sleep(5000);
        // 告诉 t 线程中断, 设置 t 现成的中断标志位为 true,
        // 由 t 线程自行写代码决定中断
        // 如果 t 线程处于阻塞状态, 会抛出 InterruptedException, 清除中断标志位
        t.interrupt();
        System.out.println("t.stop");
    }
}
