package org.example;

import javax.swing.*;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/6 13:54
 */
public interface Command {
    void execute(JPanel jPanel, Circle circle);
    void undo(JPanel jPanel);
}
