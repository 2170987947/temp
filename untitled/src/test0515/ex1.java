package test0515;

import java.util.HashMap;
import java.util.Map;

public class ex1 {

    public int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int gift : gifts) {
            int index = map.getOrDefault(gift, 0);
            map.put(gift, index + 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((int)entry.getValue() > gifts.length / 2) {
                return (int)entry.getKey();
            }
        }
        return 0;
    }
}
