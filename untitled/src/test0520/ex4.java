package test0520;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] nums = new int[10000];
        nums[0] = 1;
        nums[1] = 2;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
            nums[i] %= 10000;
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            StringBuffer stringBuffer = new StringBuffer();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                stringBuffer.append(String.format("%04d", nums[a - 1]));
            }
            System.out.println(stringBuffer);
        }
    }

}
