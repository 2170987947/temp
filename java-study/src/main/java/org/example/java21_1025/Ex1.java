package org.example.java21_1025;

import java.util.Stack;

class CQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public CQueue() {
        if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
    }

    public void appendTail(int value) {
        s2.push(value);
    }

    public int deleteHead() {
        if (!s1.isEmpty()) {
            return s1.pop();
        } else if (!s2.isEmpty()){
            return s1.pop();
        } else {
            return -1;
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
