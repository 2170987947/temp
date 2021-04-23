package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 18:02
 */
public class Helicpter extends AirCraft {
    public Helicpter() {
        flyBehavior = new SubSonicFly();
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
