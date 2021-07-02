package lession10;

public class TestVolatile implements Runnable {
    private volatile boolean isFlag;
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isFlag = true;
        System.out.println("flag = " + isFlag);
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }
    static class Threads {
        public static void main(String[] args) {
            TestVolatile testVolatile = new TestVolatile();
            new Thread(testVolatile).start();
            while (true) {
                if (testVolatile.isFlag == true) {
                    System.out.println(Thread.currentThread().getName()+ "===========");
                    break;
                }
            }
        }
    }
}


