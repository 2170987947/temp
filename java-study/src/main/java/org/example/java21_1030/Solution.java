package org.example.java21_1030;

class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    private int mergeSort(int[] nums, int l, int r) {
        // 终止条件
        if (r - l <= 1) return 0;
        // 递归划分
        int m = (l + r) / 2;
        int res = mergeSort(nums, l, m) + mergeSort(nums,m + 1, r);
        // 合并阶段
        int[] tmp = new int[r - l];
        int i = l, j = m + 1;
        for (int k = l; k < r; k++) {
            if (i == m + 1)
                nums[k] = tmp[j++];
            else if (j == r + 1 || tmp[i] <= tmp[j])
                nums[k] = tmp[i++];
            else {
                nums[k] = tmp[j++];
                res += m - i + 1; // 统计逆序对
            }
        }
        for (int k = l; k < r; k++)
            nums[k] = tmp[k];
        return res;
    }
}
