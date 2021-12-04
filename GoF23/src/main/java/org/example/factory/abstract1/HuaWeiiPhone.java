package org.example.factory.abstract1;

public class HuaWeiiPhone implements IphoneProduct {
    public void start() {
        System.out.println("开启华为手机");
    }

    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    public void callup() {
        System.out.println("华为打电话");
    }

    public void sendMES() {
        System.out.println("华为发短信");
    }
}
