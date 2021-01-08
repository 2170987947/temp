import java.util.Arrays;
import java.util.Scanner;

public class java1224 {
    public static void main(String[] args) {
//        System.out.println(computer());
//        System.out.println("30和20的最大公约数为："+maxYueShu(30,20));
//        System.out.println(binaryOneCount(21));
//        System.out.println(sum(1,100));
//        int[] arrOuShu= new int[16];
//        int[] arrJiShu= new int[16];
//        System.out.println("21 的偶数序列：" + Arrays.toString(ouShu(21, arrOuShu)));
//        System.out.println("21 的奇数序列：" + Arrays.toString(jiShu(21, arrJiShu)));
//        String password = "123";
//        login(password);
//        int a = 123;
//        System.out.println(a + ":"D + Arrays.toString(wei(123)));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入乘法口诀表的行数 row :");
        int row = scanner.nextInt();
        chengFaKouJue(row);
    }

    public static void chengFaKouJue(int row) {
        for (int row1 = 1; row1 <= row; row1++) {
            for (int col1 = 1; col1 <= row1; col1++) {
                System.out.print(col1 + "*" + row1 + "=" + col1*row1 + "\t");
            }
            System.out.println();
        }
    }

    public static int[] wei(int num) {
        int num1 = num;//将 num 保存在 num1 中
        int ge;
        int shi;
        int bai;
        int[] arr = new  int[3];
        ge = num1 % 10;
        arr[2] = ge;
        shi = (num1 / 10) % 10;
        arr[1] = shi;
        bai = (num1 / 100) % 10;
        arr[0] = bai;
        return arr;

    }

    public static void login(String password) {
        int i = 1;
        while (i <= 3) {
            System.out.println("请输入密码：");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (password.equals(input)) {
                System.out.println("登录成功");
                break;
            } else if (i < 3){
                System.out.println("登录失败,请重新登录");
            } else {
                System.out.println("三次输入错误，程序退出！");
                break;
            }
            i++;
        }
    }

    public static int[] ouShu(int num, int[] a1) {
        for (int i = 30; i >= 0; i -= 2) {
            if (((num >> i) & 1) == 1) {
                a1[(i / 2)] = 1;
            }
        }
        return a1;
    }

    public static int[] jiShu(int num, int[] a2) {
        for (int i = 31; i > 0; i -= 2) {
            if (((num >> i) & 1) == 1) {
                a2[(i / 2)] = 1;
            }
        }
        return a2;
    }

    public static double sum(int start, int end) {
        double result = 0;
        for (int i = 1; i <= end; i += 2) {
            result += (1.0 / i) + (1.0 / (i + 1));
        }
        return result;
    }

    public static int binaryOneCount(int num) {
        int count = 0;
        while (num!=0){
            if ((num & 1)== 1) {
                count++;
            }
            num >>= 1;
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
