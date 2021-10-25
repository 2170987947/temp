package org.example.java21_1025;

import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MinStack() {

    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        minStack.min();
        minStack.pop();
        minStack.min();
        minStack.pop();
        minStack.min();
        minStack.pop();
        minStack.min();
    }
    public void push(int x) {
        s1.push(x);
        if (!s2.isEmpty()) {
            s2.push(Math.min(x, s2.peek()));
        } else {
            s2.push(x);
        }
    }
    
    public void pop() {
        if (!s1.isEmpty() && !s2.isEmpty()) {
            s1.pop();
            s2.pop();
        }
    }
    
    public int top() {
        //if (!s1.isEmpty()) {
            return s1.peek();
        //}
        //return -1;
    }
    
    public int min() {
        //if (!s2.isEmpty()) {
            return s2.peek();
        //}
        //return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */