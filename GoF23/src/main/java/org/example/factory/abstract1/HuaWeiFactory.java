package org.example.factory.abstract1;

public class HuaWeiFactory implements AbstractFactory {
    public IphoneProduct iphoneProduct() {
        return new HuaWeiiPhone();
    }

    public RouteProduct routeProduct() {
        return new HuaWeiRoute();
    }

    public ComputerProduct computerProduct() {
        return new HuaWeiComputer();
    }
}
