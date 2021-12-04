package org.example.factory.abstract1;

// 抽象工厂模式
// 增加产品族（联想工厂、联想手机、联想笔记本、联想路由器）（不能给工厂里增加产品）
public interface AbstractFactory {

    IphoneProduct iphoneProduct();
    RouteProduct routeProduct();
    ComputerProduct computerProduct();
}
