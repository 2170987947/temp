package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 22:56
 */
public class MyIterator implements Iterator {
    private Aggregate strings;

    public MyIterator(Aggregate strings) {
        this.strings = strings;
    }

    @Override
    public void forward() {

    }

    @Override
    public void backword() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String currentItem() {
        return null;
    }
}
