package lession4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Callable：可获取程序执行结果的任务类
        Callable<String> c = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(2);
                return "OK";
            }
        };
        FutureTask<String> task = new FutureTask(c);
        new Thread(task).start();
        // 当前线程阻塞等待 task线程执行完毕，获取执行结果再往下执行
        System.out.println(1);
        System.out.println(task.get());
    }
}
