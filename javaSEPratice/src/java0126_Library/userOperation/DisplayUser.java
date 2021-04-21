package java0126_Library.userOperation;

import java0126_Library.AdminList;
import java0126_Library.NormalUserList;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 10:42
 */
public class DisplayUser implements IUserOperation {

    @Override
    public int menu() {
        System.out.println("显示用户信息");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.显示普通用户");
        System.out.println("2.显示图书管理员");
        System.out.print("请输入您的选择: ");
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void workNormalUserList(NormalUserList normalUserList) {
        System.out.println("显示普通用户信息");
        for (int i= 0; i< normalUserList.getSize(); i++) {
            System.out.println(normalUserList.getNormalUser(i));
        }
    }

    @Override
    public void workAdminList(AdminList adminList) {
        System.out.println("显示图书管理员信息");
        for (int i= 0; i< adminList.getSize(); i++) {
            System.out.println(adminList.getAdmin(i));
        }
    }
}
