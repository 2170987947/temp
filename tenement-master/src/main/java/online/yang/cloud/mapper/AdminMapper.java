package online.yang.cloud.mapper;

import online.yang.cloud.model.Admin;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminMapper {
    int deleteByPrimaryKey(String adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    Admin selectByAccountAndPwd(Admin admin);

    Admin selectByCondition(Admin admin);
}