package lession8;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("继承Thread");
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}