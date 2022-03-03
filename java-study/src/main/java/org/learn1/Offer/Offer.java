package org.learn1.Offer;

import java.util.*;


public class Offer {

}
//剑指offer 03 数组中重复的数字
class Q3 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return i;
            }
        }
        return -1;
    }
}

//剑指offer 04 二维数组中的查找
class Q4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (target < matrix[i][j]) {
                j--;
            } else if (target == matrix[i][j]) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }
}
//剑指offer 05 替换空格
class Q5 {
    public String replaceSpace(String s) {
        s.replace(" ", "%20");
        return s;
    }
    public String replaceSpace2(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] a = new char[s.length() * 3];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                a[index++] = '%';
                a[index++] = '2';
                a[index++] = '0';
            } else {
                a[index++] = s.charAt(i);
            }
        }
        return new String(a, 0, index);
    }
}

//剑指offer 06 从尾到头打印链表
class Q6 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (cur !=null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        int[] ans = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
//剑指offer 07 重建二叉树
class Q7 {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        ArrayList<Integer> preOrderList = new ArrayList<>();
        ArrayList<Integer> inOrderList = new ArrayList<>();
        for (int i = 0; i < preorder.length; i++) {
            preOrderList.add(preorder[i]);
            inOrderList.add(inorder[i]);
        }
        return helper(preOrderList, inOrderList);
    }

    private TreeNode helper(List<Integer> preOrderList, List<Integer> inOrderList) {
        if (inOrderList.size() == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preOrderList.remove(0));
        int index = inOrderList.indexOf(root.val);
        root.left = helper(preOrderList, inOrderList.subList(0, index));
        root.right = helper(preOrderList, inOrderList.subList(index + 1, inOrderList.size()));
        return root;
    }
}
// 剑指 Offer 09. 斐波那契数列用两个栈实现队列
class Q9 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void appendTail(int value) {
        s1.push(value);
    }
    public int deleteHead() {
        if (s2.size() > 0) {
            return s2.pop();
        } else {
            if (s1.size() <= 0) {
                return -1;
            } else {
                while (s1.size() > 0) {
                    s2.push(s1.pop());
                }
                return s2.pop();
            }
        }

    }

}

class Q10 {
    //剑指 Offer 10- I. 斐波那契数列
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int one = 0;
        int two = 1;
        for (int i = 2; i <= n; i++) {
            int three = (one + two) % 1000000007;
            one = two;
            two = three;
        }
        return two;
    }
    // 剑指 Offer 10- II. 青蛙跳台阶问题
    public int numWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int one = 1;
        int two = 1;
        for (int i = 2; i <= n; i++) {
            int three = (one + two) % 1000000007;
            one = two;
            two = three;
        }
        return two;
    }
}
