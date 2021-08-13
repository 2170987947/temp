package org.example.java21_0812;

import org.example.java21_0810.TreeNode;

import java.util.ArrayList;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

class Ex1 {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    private ArrayList<Integer> pre = new ArrayList<>();
    private ArrayList<Integer> in = new ArrayList<>();
    private ArrayList<Integer> post = new ArrayList<>();
    public int[][] threeOrders (TreeNode root) {
        // write code here
        int[][] arr = new int[3][];
        preOrder(root);
        inOrder(root);
        postOrder(root);
        arr[0] = toIntArray(pre);
        arr[1] = toIntArray(in);
        arr[2] = toIntArray(post);
        return arr;
    }

    private int[] toIntArray(ArrayList<Integer> in) {
        int[] r = new int[in.size()];
        for (int i = 0; i < in.size(); i++) {
            r[i] = in.get(i);
        }
        return r;
    }

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        pre.add(root.val);
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inOrder(root.left);
        }
        in.add(root.val);
        if (root.right != null) {
            inOrder(root.right);
        }
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        post.add(root.val);
    }
}