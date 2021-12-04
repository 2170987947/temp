package org.example.factory.abstract1;

public class LianXiangComputer implements ComputerProduct {
    public void start() {
        System.out.println("打开联想笔记本");
    }

    public void shutdown() {
        System.out.println("关闭联想笔记本");
    }
}
