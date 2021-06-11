package test0611;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int r = 0;
        for (int i = 0; i < array.length; i++) {
            int index = map.getOrDefault(array[i], 0);
            map.put(array[i], index + 1);
        }
        for (Map.Entry e : map.entrySet()) {
            if ((int)e.getValue() > array.length / 2) {
                return (int)e.getKey();
            }
        }
        return r;
    }
}