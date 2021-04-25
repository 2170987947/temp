package test0425;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 12:47
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            if (num > 1000) {
                num = 999;
            }
            List<Integer> list = new ArrayList<>(num);
            for (int i = 0; i < num; i++) {
                list.add(in.nextInt());
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove((i));
            }
            System.out.println(list.get(0));
        }
    }
}
