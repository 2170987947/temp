package java0126_Library.userOperation;

import java0126_Library.*;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:44
 */
public class DeleteUser implements IUserOperation {
    @Override
    public int menu() {
        System.out.println("删除用户");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.删除普通用户");
        System.out.println("2.删除图书管理员");
        System.out.print("请输入您的选择: ");
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void workNormalUserList(NormalUserList normalUserList) {
        System.out.println("删除普通用户");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入普通用户的名字: ");
        String name = scanner.next();
        for (int i = 0; i < normalUserList.getSize(); i++) {
            if (name.equals(normalUserList.getNormalUser(i).getName())) {
                // 获取管理员列表中最后一个对象
                NormalUser normalUser = normalUserList.getNormalUser(normalUserList.getSize() - 1);
                // 将获取到的对象放在要删除的用户的位置
                normalUserList.setNormalUser(i,normalUser);
                // 将管理员列表中的元素个数 - 1
                normalUserList.setSize(normalUserList.getSize() - 1);
                return;
            }
        }
        System.out.println("该普通用户不存在, 删除失败");
    }

    @Override
    public void workAdminList(AdminList adminList) {
        System.out.println("删除图书管理员");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入图书管理员的名字: ");
        String name = scanner.next();
        for (int i = 0; i < adminList.getSize(); i++) {
            if (name.equals(adminList.getAdmin(i).getName())) {
                // 获取管理员列表中最后一个对象
                Admin admin = adminList.getAdmin(adminList.getSize() - 1);
                // 将获取到的对象放在要删除的用户的位置
                adminList.setAdmin(i,admin);
                // 将管理员列表中的元素个数 - 1
                adminList.setSize(adminList.getSize() - 1);
                return;
            }
        }
        System.out.println("该图书管理员不存在, 删除失败");
    }
}
