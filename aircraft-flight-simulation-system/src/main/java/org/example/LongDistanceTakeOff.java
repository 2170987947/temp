package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 17:59
 */
public class LongDistanceTakeOff implements TakeOffBehavior {
    @Override
    public void takeOff() {
        System.out.println("长距离起飞");
    }
}
