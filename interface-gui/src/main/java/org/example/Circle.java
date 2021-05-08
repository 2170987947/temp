package org.example;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/6 13:49
 */
@Getter
@Setter
@ToString
public class Circle {
    private int x;
    private int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
