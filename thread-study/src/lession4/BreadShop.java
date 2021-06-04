package lession4;

/**
 * 10 个消费者，每次消费一个
 * 5 个生产者，每人每次生产 3 个
 * 库存上限 100
 */

public class BreadShop {

    private static int COUNT;

    public static void main(String[] args) {
        // 消费者线程 10 个
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            // 消费者之间，消费者与生产者之间都对同一个共享变量操作
                            synchronized (BreadShop.class) {
                                while (COUNT == 0) {
                                    BreadShop.class.wait();
                                }
                                COUNT--;
                                System.out.println(Thread.currentThread().getName() + "消费，库存 " + COUNT);
                                BreadShop.class.notifyAll();
                            }
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "消费者[" + i + "]").start();
        }

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            // 消费者之间，消费者与生产者之间都对同一个共享变量操作
                            synchronized (BreadShop.class) {
                                while (COUNT + 3 > 100) {
                                    BreadShop.class.wait();
                                }
                                COUNT += 3;
                                System.out.println(Thread.currentThread().getName() + "生产：库存 " + COUNT);
                                BreadShop.class.notifyAll();
                            }
                            Thread.sleep(300);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "生产者[" + i + "]").start();
        }
    }
}
