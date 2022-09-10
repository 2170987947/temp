package online.yang.cloud.service;

import online.yang.cloud.model.Admin;



public interface AdminService extends BaseService<Admin> {

    Admin findByAccountAndPwd(Admin admin);

    Admin findByCondition(Admin admin);

}
