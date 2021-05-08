package org.example;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/6 13:56
 */
public class LeftCommand implements Command {
    private Receiver receiver;
    private ArrayList<Circle> arrayList;
    private ConcreteOfInvoke concreteOfInvoke;

    public LeftCommand(Receiver receiver, ArrayList<Circle> arrayList, ConcreteOfInvoke concreteOfInvoke) {
        this.receiver = receiver;
        this.arrayList = arrayList;
        this.concreteOfInvoke = concreteOfInvoke;
    }

    @Override
    public void execute(JPanel jPanel, Circle circle) {
        receiver.addSpot(jPanel, circle);
        arrayList.add(circle);
    }

    @Override
    public void undo(JPanel jPanel) {
        Circle circle;
        if (arrayList.size() >= 1) {
            circle = arrayList.get(arrayList.size() - 1);
            receiver.deleteSpot(jPanel, circle);
            arrayList.remove(arrayList.size() - 1);
            int n = 2;
            concreteOfInvoke.notifyObservers(n, circle.getX(), circle.getY());
        }
    }
}
