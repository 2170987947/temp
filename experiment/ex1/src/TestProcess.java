
public class TestProcess {
    public static void main(String[] args) {
        processMenu pm=new processMenu();
        pm.init();//初始化容器
        pm.FCFS();
        pm.printProcess();
        pm.SJF();
        pm.printProcess();
        pm.RR();
        pm.printProcess();
        pm.HRN();
        pm.printProcess();
    }
}
