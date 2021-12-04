package org.example.factory.abstract1;

public class HuaWeiRoute implements RouteProduct {

    public void start() {
        System.out.println("开启华为路由器");
    }

    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    public void openWifi() {
        System.out.println("打开华为 WiFi");
    }

    public void setting() {
        System.out.println("华为设置");
    }
}
