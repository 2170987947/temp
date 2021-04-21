package java0126_Library;

import java0126_Library.bookOperation.IBookOperation;
import java0126_Library.userOperation.IUserOperation;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/26 12:51
 */
public abstract class User {
    protected String name;
    protected String password;
    protected IBookOperation[] iBookOperations;
    protected IUserOperation[] iUserOperations;
    public abstract int menu();
    public void doOperation(int choice, BookList bookList, AdminList adminList, NormalUserList normalUserList) {
        // 如果是总经理: 既要可以对图书管理员进行管理, 也可以对用户进行管理.同时可以对书进行操作.
        if (this instanceof Manager) {
            if (choice >=1 && choice <=5) {
                // 调用总经理操作对象(1. 普通用户 2. 图书管理员)菜单
                if (this.iUserOperations[choice - 1].menu() == 1)  {
                    // 对普通用户进行操作
                    this.iUserOperations[choice - 1].workNormalUserList(normalUserList);
                } else {
                    // 对图书管理员进行操作
                    this.iUserOperations[choice - 1].workAdminList(adminList);
                }
            } else {
                // 对书进行操作
                this.iBookOperations[choice - 5 - 1].work(bookList);
            }
        } else {
            // 非管理员: 只能对书进行操作
            this.iBookOperations[choice - 1].work(bookList);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
