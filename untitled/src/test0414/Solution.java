package test0414;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/14 20:15
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: array) {
            Integer size = map.get(i);
            if (size == null) {
                map.put(i, 1);
            } else {
                map.put(i, size + 1);
            }
        }
        int resultKey = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > array.length / 2) {
                resultKey = key;
            }
        }
        return resultKey;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(new Solution().MoreThanHalfNum_Solution(a));
    }
}
