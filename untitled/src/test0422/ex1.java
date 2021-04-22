package test0422;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/22 12:31
 */
public class ex1 {
    public class Solution {
        public int MoreThanHalfNum_Solution(int[] array) {
            if (array == null || array.length == 0) {
                return 0;
            }
            int result = array[0];
            int times = 1;
            for (int i = 1; i < array.length; i++) {
                if (times > 0) {
                    if (array[i - 1] == array[i]) {
                        times++;
                        result = array[i];
                    } else {
                        times--;
                        result = array[i];
                    }
                } else {
                    times--;
                    result = array[i];
                }
            }
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (result == array[i]) {
                    count++;
                }
            }
            if (count > array.length) {
                return result;
            }
            return 0;
        }
    }
}
