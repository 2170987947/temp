package org.learn1.Offer;

import java.util.HashSet;
import java.util.Set;

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

}
