package java0126_Library.userOperation;

import java0126_Library.Admin;
import java0126_Library.AdminList;
import java0126_Library.NormalUser;
import java0126_Library.NormalUserList;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:41
 */
public class AddUser implements IUserOperation {

    @Override
    public int menu() {
        System.out.println("添加用户");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.添加普通用户");
        System.out.println("2.添加图书管理员");
        System.out.print("请输入您的选择: ");
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void workNormalUserList(NormalUserList normalUserList) {
        System.out.println("添加普通用户");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i < normalUserList.getSize(); i++) {
            if (name.equals(normalUserList.getNormalUser(i).getName())) {
                System.out.println("该普通用户存在, 添加失败");
                System.out.println(normalUserList.getNormalUser(i));
                return;
            }
        }
        System.out.println("该普通用户不存在");
        System.out.print("请输入普通用户的密码: ");
        String password = scanner.next();
        // 将用户列表长度 + 1
        NormalUser normalUser = new NormalUser(name,password);
        normalUserList.setNormalUser(normalUserList.getSize(),normalUser);
        normalUserList.setSize(normalUserList.getSize() + 1);
    }

    @Override
    public void workAdminList(AdminList adminList) {
        System.out.println("添加图书管理员");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // 判断该 图书管理员 是否已经存在
        for (int i = 0; i < adminList.getSize(); i++) {
            if (name.equals(adminList.getAdmin(i).getName())) {
                System.out.println("该图书管理员存在, 添加失败");
                System.out.println(adminList.getAdmin(i));
                return;
            }
        }
//        System.out.println("该图书管理员不存在");
        System.out.print("请输入图书管理员的密码: ");
        String password = scanner.next();
        // 将用户列表长度 + 1
        Admin admin = new Admin(name,password);
        adminList.setAdmin(adminList.getSize(),admin);
        adminList.setSize(adminList.getSize() + 1);
    }

}
