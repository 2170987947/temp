package lession8;

public class ObjectPratice {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
                System.out.println(Thread.currentThread());
            }
        });
        t.start();
        System.out.println(Thread.currentThread());
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("r");
//            }
//        };
//        Thread t2 = new Thread(r);
//        Callable c = new Callable() {
//            @Override
//            public Object call() throws Exception {
//                return null;
//            }
//        };
//        Thread t3 = new Thread((Runnable) c);

        Thread t4 = new Thread("线程") {
            @Override
            public void run() {
                System.out.println(this.getName());
                System.out.println(this.getId());
                System.out.println(this.getState());
                System.out.println(this.getPriority());
                System.out.println(this.isDaemon());
                System.out.println(this.isAlive());
                System.out.println(this.isInterrupted());
            }
        };
        t4.start();
    }
}
