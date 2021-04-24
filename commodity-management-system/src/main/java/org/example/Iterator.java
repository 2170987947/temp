package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/23 22:55
 */
public interface Iterator {
    void forward();
    void backword();
    boolean hasNext();
    Object currentItem();
}
