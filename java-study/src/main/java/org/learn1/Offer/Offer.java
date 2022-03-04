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
// 剑指 Offer 11. 旋转数组的最小数字
class Q11 {
    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (numbers[m] < numbers[r]) {
                r = m;
            } else if (numbers[m] > numbers[r]) {
                l = m + 1;
            } else {
                r--;
            }
        }
        return numbers[l];
    }
}
// 剑指 Offer 12. 矩阵中的路径
class Q12 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(i, j, 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(int x, int y, int index, String word, char[][] array) {
        if (x < 0 || x >= array.length || y < 0 || y >= array[0].length || array[x][y] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        array[x][y] = '\0';
        boolean r = dfs(x + 1, y, index + 1, word, array) || dfs(x - 1, y, index + 1, word, array) || dfs(x, y + 1, index + 1, word, array) || dfs(x, y - 1, index + 1, word, array);
        array[x][y] = word.charAt(index);
        return r;
    }
}
// 剑指 Offer 13. 机器人的运动范围
class Q13 {
    public int movingCount(int m, int n, int k) {
        if (m <= 0 || n <= 0 || k < 0) {
            return 0;
        }
        boolean[][] visit = new boolean[m][n];
        int count = 0;
        visit[0][0] = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (get(i) + get(j) > k) {
                    continue;
                }
                if (i - 1 >= 0 && visit[i - 1][j]) {
                    visit[i][j] = true;
                }
                if (j - 1 >= 0 && visit[i][j - 1]) {
                    visit[i][j] = true;
                }
                if (visit[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
    private static int get(int num) {
        int r = 0;
        while (num > 0) {
            r += num % 10;
            num /= 10;
        }
        return r;
    }
    // dfs + 剪枝
    public int movingCount2(int m, int n, int k) {
        if (m <= 0 || n <= 0 || k < 0) {
            return 0;
        }
        boolean[][] visit = new boolean[m][n];
        return dfs(visit, 0, 0, m, n, k);
    }
    private static int dfs(boolean[][] visit, int x, int y, int m, int n, int k) {
        if (x < 0 || y < 0 || x >= m || y >= n || visit[x][y] || get(x) + get(y) > k) {
            return 0;
        }
        visit[x][y] = true;
        return 1 + dfs(visit, x + 1, y, m, n, k) + dfs(visit, x, y + 1, m, n, k);
    }
}
// 剑指 Offer 14- I. 剪绳子
// ① 当所有绳段长度相等时，乘积最大。② 最优的绳段长度为 33 。
class Q14 {
    public int cuttingRope(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3;
        int b = n % 3;
        if (b == 0) {
            return (int)Math.pow(3, a);
        } else if (b == 1) {
            return (int)Math.pow(3, a - 1) * 4;
        } else {
            return (int)Math.pow(3, a) * 2;
        }
    }
}
// 剑指 Offer 14- II. 剪绳子 II
class Q14II {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        long r = 1;
        while (n > 4) {
            r *= 3;
            r %= 1000000007;
            n -= 3;
        }
        return (int)(r * n % 1000000007);
    }
}
// 剑指 Offer 15. 二进制中1的个数
class Q15 {
    public int hammingWeight(int n) {
        int c = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                c++;
            }
        }
        return c;
    }
}
// 剑指 Offer 16. 数值的整数次方
class Q16 {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }
    public double myPow2(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == -1) {
            return 1/x;
        }
        if (n == 1) {
            return x;
        }
        double half = myPow2(x, n/2);
        return n % 2 == 0 ? half * half : half * half * (n > 0 ? x : 1/x);
    }
}
// 剑指 Offer 17. 打印从1到最大的n位数
class Q17 {
    public int[] printNumbers(int n) {
        if (n <= 0) {
            return new int[]{0};
        }
        int length = (int)Math.pow(10, n);
        int[] arr = new int[length - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
// 剑指 Offer 18. 删除链表的节点
class Q18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode t = new ListNode(0);
        t.next = head;
        ListNode pre = t;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return t.next;
    }
}
// 剑指 Offer 20. 表示数值的字符串
class Q20 {
    public boolean isNumber(String s) {
        // ToDo:
        return false;
    }
}
// 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
class Q21 {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            while (l <= r && nums[r] % 2 == 0) {
                r--;
            }
            while (l <= r && nums[l] % 2 != 0) {
                l++;
            }
            if (l < r) {
                swap(nums, l, r);
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
// 剑指 Offer 22. 链表中倒数第k个节点
class Q22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (k <= 0 || head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (k > 0) {
            if (fast != null) {
                fast = fast.next;
            } else {
                return null;
            }
            k--;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
// 剑指 Offer 24. 反转链表
class Q24 {
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode c = head;
        ListNode n = null;
        while (c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
}
// 剑指 Offer 25. 合并两个排序的链表
class Q25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return head.next;
    }
}
// 剑指 Offer 26. 树的子结构
class Q26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        if (A.val == B.val && helper(A.left, B.left) && helper(A.right, B.right)) {
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    private static boolean helper(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null) {
            return false;
        }
        return a.val == b.val && helper(a.left, b.left) && helper(a.right, b.right);
    }
}
// 剑指 Offer 27. 二叉树的镜像
class Q27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
// 剑指 Offer 28. 对称的二叉树
class Q28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    private static boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null){
            return false;
        }
        return a.val == b.val && isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}
// 剑指 Offer 29. 顺时针打印矩阵
class Q29 {
    public int[] spiralOrder(int[][] matrix) {

    }
}