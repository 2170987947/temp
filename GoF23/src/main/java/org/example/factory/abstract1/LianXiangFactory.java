package org.example.factory.abstract1;

public class LianXiangFactory implements AbstractFactory {
    public IphoneProduct iphoneProduct() {
        return new LianXiangIphone();
    }

    public RouteProduct routeProduct() {
        return null;
    }

    public ComputerProduct computerProduct() {
        return null;
    }
}
