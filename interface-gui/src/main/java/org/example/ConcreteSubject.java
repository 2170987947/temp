package org.example;

import java.util.ArrayList;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 10:56
 */
public class ConcreteSubject implements ConcreteOfInvoke, Subject {

    ArrayList<Observer> arrayList;

    ConcreteSubject() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void notifyObservers(int n, int x, int y) {
        for (Observer observer : arrayList) {
            observer.update(n, x, y);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        arrayList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        arrayList.remove(observer);
    }


}
