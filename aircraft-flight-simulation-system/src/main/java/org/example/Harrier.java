package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 18:05
 */
public class Harrier extends AirCraft {
    public Harrier() {
        flyBehavior = new SuperSonicFly();
        takeOffBehavior = new VerticalTakeOff();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void takeOff() {
        takeOffBehavior.takeOff();
    }
}
