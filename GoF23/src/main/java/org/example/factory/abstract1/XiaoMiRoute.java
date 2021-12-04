package org.example.factory.abstract1;

public class XiaoMiRoute implements RouteProduct {

    public void start() {
        System.out.println("开启小米路由器");
    }

    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    public void openWifi() {
        System.out.println("打开小米 WiFi");
    }

    public void setting() {
        System.out.println("小米设置");
    }
}
