package java0126_Library;

import java0126_Library.bookOperation.*;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 12:51
 */
public class NormalUser extends User{
    public NormalUser(String name, String password) {
        this.name = name;
        this.password = password;
        this.iBookOperations = new IBookOperation[]{
                new FindBook(),
                new BorrowBook(),
                new ReturnBook(),
                new DisplayBook(),
                new Exit()
        };
    }

    @Override
    public int menu() {
        System.out.println("=====================");
        System.out.println("欢迎书籍管理员[ " + this.name + " ]" + "来到书籍管理系统");
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("4.显示书籍信息");
        System.out.println("5.退出");
        System.out.println("=====================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的选择的操作: ");
        int choice = scanner.nextInt();
        return choice;
    }
}
