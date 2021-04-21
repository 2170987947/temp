package java0126_Library;

import java0126_Library.User;
import java0126_Library.bookOperation.*;
import java0126_Library.userOperation.*;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:57
 */
public class Manager extends User {
    public Manager(String name, String password) {
        this.name = name;
        this.password = password;
        this.iUserOperations = new IUserOperation[]{
                new FindUser(),
                new AddUser(),
                new DeleteUser(),
                new UpdateUser(),
                new DisplayUser()
        };
        this.iBookOperations = new IBookOperation[]{
                new FindBook(),
                new AddBook(),
                new DeleteBook(),
                new UpdateBook(),
                new BorrowBook(),
                new ReturnBook(),
                new DisplayBook(),
                new Exit()
        };
    }
    @Override
    public int menu() {
        System.out.println("=====================");
        System.out.println("欢迎总经理[ " + this.name + " ]" + "来到书籍管理系统");
        System.out.println("1.查找用户");
        System.out.println("2.添加用户");
        System.out.println("3.删除用户");
        System.out.println("4.更新用户信息");
        System.out.println("5.显示用户信息");
        System.out.println("6.查找书籍");
        System.out.println("7.添加书籍");
        System.out.println("8.删除书籍");
        System.out.println("9.更新书籍信息");
        System.out.println("10.借阅书籍");
        System.out.println("11.归还书籍");
        System.out.println("12.显示书籍信息");
        System.out.println("13.退出");
        System.out.println("=====================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的选择的操作: ");
        int choice = scanner.nextInt();
        return choice;
    }

}
