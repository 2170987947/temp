package java0126_Library.userOperation;

import java0126_Library.AdminList;
import java0126_Library.NormalUserList;

import java.util.Scanner;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:45
 */
public class FindUser implements IUserOperation {
    @Override
    public int menu() {
        System.out.println("查找用户");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.查找普通用户");
        System.out.println("2.查找图书管理员");
        System.out.print("请输入您的选择: ");
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void workNormalUserList(NormalUserList normalUserList) {
        System.out.println("查找普通用户");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入普通用户的名字: ");
        String name = scanner.next();
        for (int i = 0; i < normalUserList.getSize(); i++) {
            if (normalUserList.getNormalUser(i).getName().equals(name)) {
//                System.out.println("该普通用户存在");
                System.out.println(normalUserList.getNormalUser(i));
                return;
            }
        }
        System.out.println("该普通用户不存在, 查找失败");
    }

    @Override
    public void workAdminList(AdminList adminList) {
        System.out.println("查找图书管理员");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入图书管理员的名字: ");
        String name = scanner.next();
        for (int i = 0; i < adminList.getSize(); i++) {
            if (adminList.getAdmin(i).getName().equals(name)) {
//                System.out.println("该图书管理员存在");
                System.out.println(adminList.getAdmin(i));
                return;
            }
        }
        System.out.println("该图书管理员不存在, 查找失败");
    }
}
