package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 10:49
 */
public interface Subject {

    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
}
