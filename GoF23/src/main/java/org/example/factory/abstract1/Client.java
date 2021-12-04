package org.example.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        IphoneProduct iphoneProduct = new XiaoMiFactory().iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendMES();

        RouteProduct routeProduct = new XiaoMiFactory().routeProduct();
        routeProduct.openWifi();
        routeProduct.setting();
    }
}
