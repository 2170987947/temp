public class java1224 {
    public static void main(String[] args) {
//        System.out.println(computer());
//        System.out.println("30和20的最大公约数为："+maxYueShu(30,20));
        System.out.println(binaryTwoCount(10));
    }

    public static int binaryTwoCount(int num) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            for (;;num = (num >>> i)) {
                if ((num & 1)== 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int maxYueShu(int num1, int num2) {
        int min = num1<num2 ? num1:num2;
        for (int i = min; i >= 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static double computer() {
        double result = 0.0;
        for (int i = 1; i < 100; i=i+2) {
            result += (1.0/i)-(1.0/(i+1));
        }
        return result;
    }
}
