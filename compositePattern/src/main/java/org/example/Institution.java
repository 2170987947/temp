package org.example;

import java.util.ArrayList;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/10 10:25
 */
public class Institution extends Unit {
    public ArrayList list;
    public String name;

    public Institution(String name) {
        list = new ArrayList();
        this.name = name;
    }

    public void add(Unit unit) {
        list.add(unit);
    }

    public void handleArchives() {
        System.out.println(this.name + "接收并下发公文");
        for (Object object: list) {
            ((Unit) object).handleArchives();
        }
    }
}
