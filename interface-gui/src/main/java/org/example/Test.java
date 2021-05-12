package org.example;

import javax.swing.*;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 10:52
 */
@SuppressWarnings("serial")
public class Test extends JFrame {

    public Test() {

        Receiver receiver = new Receiver();
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Command command = new ConcreteCommand(receiver, concreteSubject);
        Invoke invoke = new Invoke(command, concreteSubject);
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        concreteSubject.addObserver(concreteObserver1);
        concreteSubject.addObserver(concreteObserver2);
        this.add("North", concreteObserver1);
        this.add("South", concreteObserver2);
        this.add("Center", invoke);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Test();
    }
}