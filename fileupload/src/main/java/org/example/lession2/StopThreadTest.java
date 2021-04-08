package org.example.lession2;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/6 9:21
 */
public class StopThreadTest {

    private static volatile boolean STOP = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                // .. 执行任务
                while (true) {
                    for (int i = 0; i < 10000 && !STOP; i++) {
                        try {
                            System.out.println(i);
                            Thread.sleep(1000);
//                            Thread.sleep(100000);
                            // 通过标志位自行实现, 无法解决线程阻塞导致无法中断
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t.start();
        System.out.println("t.start");
        Thread.sleep(5000);
        STOP = true;
        System.out.println("t.stop");
    }
}
