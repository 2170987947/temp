package org.example.factory.abstract1;

public class LianXiangIphone implements IphoneProduct {
    public void start() {
        System.out.println("开启联想手机");
    }

    public void shutdown() {
        System.out.println("关闭联想手机");
    }

    public void callup() {
        System.out.println("联想手机打电话");
    }

    public void sendMES() {
        System.out.println("联想手机发短信");
    }
}
