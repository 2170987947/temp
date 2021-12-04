public class Solution {
    public int addDigits(int num) {
        int r = num;
        while (r >= 10) {
            r = 0;
            while (num > 0) {
                r += num % 10;
                num /= 10;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        if (s.addDigits(38) == 2) {
            System.out.println("test OK");
        } else {
            System.out.println("test failed");
        }

        if (s.addDigits(1) == 1) {
            System.out.println("test OK");
        } else {
            System.out.println("test failed");
        }
    }
}