package org.example;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 10:33
 */
@SuppressWarnings("serial")
class Invoke extends JPanel {
    private Command command;
    private ConcreteOfInvoke concreteOfInvoke;

    public Invoke(Command command, ConcreteOfInvoke concreteOfInvoke) {
        this.command = command;
        this.concreteOfInvoke = concreteOfInvoke;
        this.addMouseListener(new Mouse());
        this.addMouseMotionListener(new MouseMotion());
    }
    class Mouse implements MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) {
            executeCommand(e);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    class MouseMotion implements MouseMotionListener {
        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent arg0) {
            int n = 0;
            concreteOfInvoke.notifyObservers(n, arg0.getX(), arg0.getY());
        }
    }
    public void executeCommand(MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        Circle circle = new Circle(x, y);

        if (mouseEvent.getButton() == mouseEvent.BUTTON1) {
            this.command.execute(this,circle);
            int n = 1;
            concreteOfInvoke.notifyObservers(n,mouseEvent.getX(),mouseEvent.getY());
        } else if (mouseEvent.getButton() == mouseEvent.BUTTON3) {
            this.command.undo(this);
        }
    }
}

