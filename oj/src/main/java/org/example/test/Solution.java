package org.example.test;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{2, 5, 7, 11};
        int target = 9;
        int[] result = solution.twoSum(arr, target);
        if (result.length == 2 && result[0] + result[1] == target) {
            System.out.println("TestCase OK!");
        } else {
            System.out.println("TestCaseFailed! arr :{2, 5, 7, 11}");
        }
    }
}
