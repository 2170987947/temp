package org.example;

import org.example.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/6 14:04
 */
public class Receiver {
    private Graphics2D graphics2D;
    public void addSpot(JPanel jPanel, Circle circle) {
        Shape shape = new Ellipse2D.Double(circle.getX() - 10, circle.getY() - 10, 20, 20);
        graphics2D = (Graphics2D) jPanel.getGraphics();
        graphics2D.setPaint(Color.black);
        graphics2D.fill(shape);

    }


    public void deletSpotr(JPanel jPanel, Circle circle) {

        Shape shape = new Ellipse2D.Double(circle.getX() - 10, circle.getY() - 10, 20, 20);
        graphics2D = (Graphics2D) jPanel.getGraphics();
        graphics2D.setPaint(jPanel.getBackground());
        graphics2D.fill(shape);
    }
}
