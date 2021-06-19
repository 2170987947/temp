package test0619;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int m = s.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            dfs(arr, n, m, 0, 1);
        }
    }

    private static void dfs(ArrayList<Integer> arr, int n, int m, int sum, int pos) {
        if (sum == m) {
//            count++;
//            System.out.println(count);
            for (int i = 0; i < arr.size(); i++) {
                if (i != arr.size() - 1) {
                    System.out.print(arr.get(i) + " ");
                } else {
                    System.out.print(arr.get(i));
                }
            }
            System.out.println();
            sum -= pos;
            return;
        }
        if (sum > m) {
            return;
        }
        for (int i = pos; i <= n; i++) {
             sum += i;
             arr.add(i);
             dfs(arr, n, m, sum, i + 1);
             arr.remove(arr.size() - 1);
             sum -= i;
        }
    }
}
