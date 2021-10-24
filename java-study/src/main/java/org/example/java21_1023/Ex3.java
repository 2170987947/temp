package org.example.java21_1023;

import org.example.java21_0810.TreeNode;

import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {

    }

    private static void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            cur = stack.pop();
            System.out.println(cur.val);
            while (cur.left != null) {
                stack.push(cur.left);
                cur = cur.left;
            }
            cur = cur.right;
        }
    }
}
