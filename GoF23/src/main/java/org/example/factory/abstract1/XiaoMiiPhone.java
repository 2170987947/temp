package org.example.factory.abstract1;

public class XiaoMiiPhone implements IphoneProduct {

    public void start() {
        System.out.println("开启小米手机");
    }

    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    public void callup() {
        System.out.println("小米打电话");
    }

    public void sendMES() {
        System.out.println("小米发短信");
    }
}
