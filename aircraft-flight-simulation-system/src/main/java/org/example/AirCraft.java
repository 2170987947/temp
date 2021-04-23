package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 18:00
 */
public abstract class AirCraft {
    public FlyBehavior flyBehavior;
    public TakeOffBehavior takeOffBehavior;

    public abstract void fly();
    public abstract void takeOff();

}
