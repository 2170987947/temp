package org.example;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 10:25
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    private ArrayList<Circle> arrayList;
    private ConcreteOfInvoke concreteOfInvoker;

    public ConcreteCommand(Receiver receiver, ConcreteOfInvoke concreteOfInvoker) {
        this.receiver = receiver;
        this.arrayList = new ArrayList<Circle>();
        this.concreteOfInvoker = concreteOfInvoker;
    }

    @Override
    public void execute(JPanel jPanel, Circle circle) {
        receiver.addSpot(jPanel, circle);
        arrayList.add(circle);
    }

    @Override
    public void undo(JPanel jPanel) {

        Circle circle;

        if (arrayList.size() > 1) {
            circle = arrayList.get(arrayList.size() - 1);
            receiver.deletSpotr(jPanel, circle);
            arrayList.remove(arrayList.size() - 1);
            int n = 2;
            concreteOfInvoker.notifyObservers(n, circle.getX(), circle.getY());
        }
    }
}
