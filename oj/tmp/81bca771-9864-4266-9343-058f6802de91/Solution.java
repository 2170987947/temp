public class Solution {
    public int addDigits(int num) {
  return 0; 
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