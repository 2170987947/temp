package org.example.factory.method;

public class BenChiFactory implements CarFactory {
    public Car getCar() {
        return new BenChi();
    }
}
