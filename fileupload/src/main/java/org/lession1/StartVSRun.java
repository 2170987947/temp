package org.lession1;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/5 15:25
 */
public class StartVSRun {

    public static void main(String[] args) {
        // main 方法直接调用 run: main 线程中运行
        // 不创建线程. ====> 不要这么调用, 用 start()
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("打到几点");
                }
            }
        }).run();
    }
}
