package org.example.java21_1030;

public class Outer {
    void outMethod(){
        int a =10;
        class Inner {
            void innerMethod(){
                System.out.println(a);
            }
        }
    }
}

