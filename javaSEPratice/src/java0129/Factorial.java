    package java0129;

    import java.util.Scanner;

    /**
     * @author FMM
     * @version 7.0
     * @date 2021/1/30 1:40
     */
    public class Factorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入阶乘中的 n : ");
            int n = scanner.nextInt();
            System.out.println(n + " 的阶乘: " + factorial(n));
        }
        public static int factorial(int num) {
            if (num == 0 || num == 1) {
                return 1;
            }
            return num * factorial(num - 1);
        }
    }
