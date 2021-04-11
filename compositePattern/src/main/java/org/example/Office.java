package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 13:02
 */
public class Office extends Unit {
    public String name;

    public Office (String name) {
        this.name = name;
    }

    public void handleArchives() {
        System.out.println(this.name + "处理公文");
    }
}
