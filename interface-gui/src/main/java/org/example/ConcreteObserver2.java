package org.example;

import javax.swing.*;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 11:01
 */
@SuppressWarnings("serial")
public class ConcreteObserver2 extends JLabel implements Observer {

    public void update(int n, int x,  int y) {
        this.setText("鼠标位于： (" + x + "," + y + ")");
    }

}
