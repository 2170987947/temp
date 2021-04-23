package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 17:58
 */
public class VerticalTakeOff implements TakeOffBehavior {
    @Override
    public void takeOff() {
        System.out.println("垂直起飞");
    }
}
