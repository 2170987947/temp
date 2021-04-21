package java0126_Library.userOperation;

import java0126_Library.*;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:47
 */
public class UpdateUser implements IUserOperation {
    @Override
    public int menu() {
        System.out.println("更新用户信息用户");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.更新普通用户");
        System.out.println("2.更新图书管理员");
        System.out.print("请输入您的选择: ");
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void workNormalUserList(NormalUserList normalUserList) {
        System.out.println("更新普通用户信息");
        System.out.print("请输入修改前普通用户的名字: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i < normalUserList.getSize(); i++) {
            if (name.equals(normalUserList.getNormalUser(i).getName())) {
                System.out.print("请输入修改后普通用户的名字: ");
                String name1 = scanner.next();
                System.out.print("请输入修改后普通用户的密码: ");
                String password1 = scanner.next();
                normalUserList.setNormalUser(i,new NormalUser(name1,password1));
                return;
            }
        }
        System.out.println("该普通用户 " + name + "不存在, 更新失败");
    }

    @Override
    public void workAdminList(AdminList adminList) {
        System.out.println("更新图书管理员信息");
        System.out.println("更新图书管理员信息");
        System.out.print("请输入修改前图书管理员的名字: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i < adminList.getSize(); i++) {
            if (name.equals(adminList.getAdmin(i).getName())) {
                System.out.print("请输入修改后图书管理员的名字: ");
                String name1 = scanner.next();
                System.out.print("请输入修改后图书管理员的密码: ");
                String password1 = scanner.next();
                adminList.setAdmin(i,new Admin(name1,password1));
                return;
            }
        }
        System.out.println("该图书管理员 " + name + "不存在, 更新失败");
    }
}
