package org.example;

import javax.swing.*;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 11:01
 */
@SuppressWarnings("serial")
public class ConcreteObserver1 extends JLabel implements Observer {

    ConcreteObserver1() {
        super("新增原点位于: (0, 0)");
    }

    public void update(int n, int x,  int y) {
        if (n == 1) {
            this.setText("新增原点位于： (" + x + "," + y + ")");
        } else if (n == 2) {
            this.setText("删除原点位于： (" + x + "," + y + ")");
        }
    }

}
