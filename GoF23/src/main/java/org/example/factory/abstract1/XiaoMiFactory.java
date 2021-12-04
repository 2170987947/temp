package org.example.factory.abstract1;

public class XiaoMiFactory implements AbstractFactory {
    public IphoneProduct iphoneProduct() {
        return new XiaoMiiPhone();
    }

    public RouteProduct routeProduct() {
        return new XiaoMiRoute();
    }

    public ComputerProduct computerProduct() {
        return new XiaoMiComputer();
    }
}
