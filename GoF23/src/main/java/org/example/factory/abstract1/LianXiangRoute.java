package org.example.factory.abstract1;

public class LianXiangRoute implements RouteProduct {
    public void start() {
        System.out.println("开启联想路由器");
    }

    public void shutdown() {
        System.out.println("关闭联想路由器");
    }

    public void openWifi() {
        System.out.println("打开联想 WiFi");
    }

    public void setting() {
        System.out.println("联想设置");
    }
}
