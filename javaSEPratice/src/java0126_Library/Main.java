package java0126_Library;

import java0126_Library.MyException.MyNameException;
import java0126_Library.MyException.MyPasswordException;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 12:49
 */
public class Main {
    public static void main(String[] args) {
//        1. 初始化书籍
        BookList bookList = new BookList();
        AdminList adminList = new AdminList();
        NormalUserList normalUserList = new NormalUserList();
//        2. 登录
        User user = login();
//        3. 执行相关操作
        while (user != null && true) {
            int choice = user.menu();
            user.doOperation(choice, bookList, adminList, normalUserList);
        }
    }

    public static User login() {
        System.out.println("1.普通用户");
        System.out.println("2.图书管理员");
        System.out.println("3.总经理");
        System.out.print("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        String name;
        String password;
        try {
            System.out.print("请输入用户名: ");
            name = scanner.next();
            if (choice == 3 && !name.equals("樊茂茂")) {
                throw new MyNameException();
            }
            System.out.print("请输入密码: ");
            password = scanner.next();
            if (choice == 3 && !password.equals("123")) {
                throw new MyPasswordException();
            }
            switch (choice) {
                case 1:
                    return new NormalUser(name, password);
                case 2:
                    return new Admin(name, password);
                case 3:
                    return new Manager(name, password);
                default:
                    return null;
            }
        } catch (MyNameException | MyPasswordException e) {
        }
        return null;
    }
}
