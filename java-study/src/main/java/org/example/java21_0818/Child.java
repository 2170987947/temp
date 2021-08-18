package org.example.java21_0818;

public class Child extends Person {
    public String grade;

    public static void main(String[] args) {
        Person p = new Child();
        System.out.println(p.age);
    }
}
