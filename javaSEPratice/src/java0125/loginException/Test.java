package java0125.loginException;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/25 15:04
 */
public class Test {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入用户名:");
            String name = scanner.next();
            System.out.print("请输入密码:");
            String password = scanner.next();
            login(name, password);
        } catch (MyPasswordException e) {
            e.getStackTrace();
        } finally {
            System.out.println("结束");
        }
        System.out.println();
    }
    public static void login (String name, String password) throws MyPasswordException {
        if (!name.equals("fmm")) {
            throw new MyNameException();
        }
        if (!password.equals("123")) {
            throw new MyPasswordException();
        }
        if (name.equals("fmm") && password.equals("123")) {
            System.out.println("登陆成功!");
        }
    }
}


