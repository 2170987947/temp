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
        if (matrix == null || matrix.length ==0 || matrix[0].length == 0) {
            return new int[0];
        }
        int[] arr = new int[matrix.length * matrix[0].length];
        int index = 0;
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            for (int col = left; col <= right; col++) {
                arr[index++] = matrix[top][col];
            }
            for (int row = top + 1; row <= bottom; row++) {
                arr[index++] = matrix[row][right];
            }
            if (left < right && top < bottom) {
                for (int col = right - 1; col > left; col--) {
                    arr[index++] = matrix[bottom][col];
                }
                for (int row = bottom; row > top; row--) {
                    arr[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return arr;
    }
}
// 剑指 Offer 32 - II. 从上到下打印二叉树 II
class Q32II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                list.add(t.val);
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
// 剑指 Offer 32 - III. 从上到下打印二叉树 III
class Q32III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                if (lists.size() % 2 == 0) {
                    list.addLast(t.val);
                } else {
                    list.addFirst(t.val);
                }
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
// 剑指 Offer 33. 二叉搜索树的后序遍历序列
class Q33 {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null) {
            return false;
        }
        return recur(postorder, 0, postorder.length - 1);
    }
    private static boolean recur(int[] postorder, int left, int right) {
        if (left >= right) {
            return true;
        }
        int index = left;
        int root = postorder[right];
        while (postorder[index] < root) {
            index++;
        }
        int mid = index;
        while (postorder[index] > root) {
            index++;
        }
        return index == right && recur(postorder, left, mid - 1)
                && recur(postorder, mid, right - 1);
    }
}
// 剑指 Offer 34. 二叉树中和为某一值的路径
class Q34 {
    List<List<Integer>> lists = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        helper(root, target, new LinkedList<Integer>());
        return lists;
    }
    private void helper(TreeNode root, int sum, LinkedList<Integer> tmp) {
        if (root == null) {
            return;
        }
        tmp.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            lists.add(new LinkedList<>(tmp));
        } else {
            helper(root.left, sum, tmp);
            helper(root.right, sum, tmp);
        }
        tmp.remove(tmp.size() - 1);
    }
}
// 剑指 Offer 35. 复杂链表的复制
class Q35 {
    Map<Node, Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        while (!map.containsKey(head)) {
            Node node = new Node(head.val);
            map.put(head, node);
            node.next = copyRandomList(head.next);
            node.random = copyRandomList(head.random);
        }
        return map.get(head);
    }
}
// 剑指 Offer 36. 二叉搜索树与双向链表
class Q36 {
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        pre.right = head;
        head.left = pre;
        return head;
    }
    private void dfs(Node cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.left);
        if (pre == null) {
            head = cur;
        } else {
            pre.right = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}
// 剑指 Offer 38. 字符串的排列
class Q38 {
    public String[] permutation(String s) {
        if (s == null) {
            return new String[0];
        }
        Set<String> list = new HashSet<>();
        char[] arr = s.toCharArray();
        boolean[] visited = new boolean[arr.length];
        dfs(arr, "", visited, list);
        return list.toArray(new String[0]);
    }
    private void dfs(char[] arr, String s, boolean[] visited, Set<String> list) {
        if (arr.length == s.length()) {
            list.add(s);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            dfs(arr, s + String.valueOf(arr[i]), visited, list);
            visited[i] = false;
        }
    }
}
// 剑指 Offer 39. 数组中出现次数超过一半的数字
class Q39 {
    public static int majorityElementDiy(int[] nums) {
        if (nums == null) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
            if (count + 1 > (nums.length / 2)) {
                return num;
            }
        }
        return -1;
    }
    public static int majorityElementDiy2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
//剑指 Offer 40. 最小的k个数
class Q40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        Arrays.sort(arr);
        if (arr.length <= k) {
            return arr;
        }
        int[] r = new int[k];
        r = Arrays.copyOfRange(arr, 0, k);
        return r;
    }
}
// 剑指 Offer 42. 连续子数组的最大和
class Q42 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
// 剑指 Offer 45. 把数组排成最小的数
class Q45 {
    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        quickSort(arr, 0, arr.length - 1);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]);
        }
        return s.toString();
    }
    private void quickSort(String[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && (arr[l] + arr[j]).compareTo(arr[j] + arr[l]) <= 0) {
                j--;
            }
            while (i < j && (arr[l] + arr[i]).compareTo(arr[i] + arr[l]) >= 0) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, l, j);
        quickSort(arr, l, j - 1);
        quickSort(arr, j + 1, r);
    }
    private void swap(String[] arr, int i, int j) {
        String t = arr[i];
        arr[i] =arr[j];
        arr[j] = t;
    }
}
// 剑指 Offer 47. 礼物的最大价值
class Q47 {
    public int maxValue(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int[][] value = new int[grid.length + 1][grid[0].length + 1];
        for (int row = 0; row < value.length; row++) {
            value[row][0] = 0;
        }
        for (int col = 0; col < value[0].length; col++) {
            value[0][col] = 0;
        }
        for (int i = 1; i < value.length; i++) {
            for (int j = 1; j < value[0].length; j++) {
                value[i][j] = Math.max(value[i - 1][j], value[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return value[grid.length][grid[0].length];
    }
}
// 剑指 Offer 48. 最长不含重复字符的子字符串
class Q48 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int max = 0;
        int index = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(index++));
            }
            set.add(s.charAt(i));
            max = Math.max(set.size(), max);
        }
        return max;
    }
}
// 剑指 Offer 52. 两个链表的第一个公共节点
class Q52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode cur = headA;
        while (cur != null) {
            set.add(cur);
            cur = cur.next;
        }
        cur = headB;
        while (cur != null) {
            if (set.contains(cur)) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
}
// 剑指 Offer 53 - I. 在排序数组中查找数字 I
class Q53I {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        int index = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                while (m > 0 && nums[m] == nums[m - 1]) {
                    m--;
                }
                index = m;
                break;
            }
        }
        int count = 0;
        while (index < nums.length) {
            if (nums[index] == target) {
                count++;
            } else {
                break;
            }
            index++;
        }
        return count;
    }
}
// 剑指 Offer 53 - II. 0～n-1中缺失的数字
class Q53II {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
// 剑指 Offer 55 - I. 二叉树的深度
class Q55I {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
// 剑指 Offer 55 - II. 平衡二叉树
class Q55II {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        return Math.abs(l - r) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
// 剑指 Offer 56 - II. 数组中数字出现的次数 II
class Q56II {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[nums.length - 1];
        }
        Arrays.sort(nums);
        int index = 0;
        while (index < nums.length - 1) {
            if (nums[index] == nums[index + 1]) {
                index += 3;
            } else {
                return nums[index];
            }
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        } else {
            return -1;
        }
    }
}
// 剑指 Offer 57. 和为s的两个数字
class Q57 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[]{nums[l], nums[r]};
            }
        }
        return new int[0];
    }
}