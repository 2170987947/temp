package java0126_Library.userOperation;

import java0126_Library.AdminList;
import java0126_Library.NormalUserList;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/1/27 0:43
 */
public interface IUserOperation {
    public int menu();
    public void workNormalUserList(NormalUserList normalUserList);
    public void workAdminList(AdminList adminList);

}
