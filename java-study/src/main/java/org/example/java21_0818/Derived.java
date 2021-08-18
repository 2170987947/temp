package org.example.java21_0818;

public class Derived extends Base {
    public Derived(String s) {
        super(s);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Derived("E");
    }
}
