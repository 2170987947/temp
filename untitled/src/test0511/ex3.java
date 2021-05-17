package test0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/12 21:22
 */
public class ex3 {
    public static void mouseMove(String numStr, String orderStr) {
        int n = Integer.parseInt(numStr);
        char[] order = orderStr.toCharArray();
        int mouse = 1;
        int first = 1;
        if (n <= 4) {
            for (int i = 0; i < order.length; i++) {
                if (mouse == 1 && order[i] == 'U') {
                    mouse = n;
                } else if (mouse == n && order[i] == 'D') {
                    mouse = 1;
                } else if (order[i] == 'U') {
                    mouse--;
                } else if (order[i] == 'D') {
                    mouse++;
                }
            }
            for (int i = 1; i < n; i++) {
                System.out.print(i + " ");
            }
            System.out.println(n);
            System.out.println(mouse);
        } else {
            for (int i = 0; i < order.length; i++) {
                if (first == 1 && mouse == 1 && order[i] == 'U') {
                    mouse = n;
                    first = n - 3;
                } else if (first == n - 3 && mouse == n && order[i] == 'D') {
                    mouse = 1;
                    first = 1;
                } else if (first != 1 && mouse == first && order[i] == 'U') {
                    mouse--;
                    first--;
                } else if (first != n - 3 && first + 3 == mouse && order[i] == 'D') {
                    mouse++;
                    first++;
                } else if (order[i] == 'D') {
                    mouse++;
                } else if (order[i] == 'U') {
                    mouse--;
                }
            }
            for (int i = first; i < first + 3; i++) {
                System.out.print(i + " ");
            }
            System.out.println(first + 3);
            System.out.println(mouse);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numStr;
        while ((numStr = reader.readLine()) != null) {
            String orderStr = reader.readLine();
            mouseMove(numStr, orderStr);
        }
    }

}
