package org.example.factory.abstract1;

public class XiaoMiComputer implements ComputerProduct {
    public void start() {
        System.out.println("开启小米笔记本");
    }

    public void shutdown() {
        System.out.println("关闭华为笔记本");
    }
}
