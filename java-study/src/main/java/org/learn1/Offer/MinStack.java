package org.learn1.Offer;

import java.util.Stack;

// 最小栈
class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        } else {
            minStack.push(Math.min(minStack.peek(), x));
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        } else {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.peek();
        }
    }

    public int min() {
        if (minStack.isEmpty()) {
            return -1;
        } else {
            return minStack.peek();
        }
    }
}
