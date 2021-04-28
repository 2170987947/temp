package test0428;

import java.util.Arrays;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/28 8:40
 */
public class ex3 {
    public int findMinimum(int n, int[] left, int[] right) {
        // write code here
        int index1 = min(left);
        int zuo = sum(left);
        int you = sum(right);
        if (left[index1] == 0) {

        } else {
            if (right[index1] == 0) {

            } else {

            }
        }
        int index2 = min(right);
        return zuo + you;
    }

    private int sum(int[] left) {
        int sum = 0;
        for (int i : left) {
            sum += i;
        }
        return sum;
    }

    private int min(int[] left) {
        int ret = 0;
        for (int i : left) {
            if (left[ret] < left[i]) {
                ret = i;
            }
        }
        return ret;
    }
}
