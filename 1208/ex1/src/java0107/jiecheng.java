package java0107;

public class jiecheng {
    //求 N 的阶乘
    public static void main(String[] args) {
        //System.out.println(factor(5));
        System.out.println(sum(5));
    }

    public static int sum(int m) {
        int result = 0;
        for (int i = 1; i <= m; i++) {
            result += factor(i);
        }
        return result;
    }

    public static int factor(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return  result;
    }
}
