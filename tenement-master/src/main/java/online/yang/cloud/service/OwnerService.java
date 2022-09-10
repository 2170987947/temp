package online.yang.cloud.service;

import online.yang.cloud.model.Owner;
import online.yang.cloud.utils.PageInfo;

import java.util.Map;



public interface OwnerService extends BaseService<Owner> {
    Owner findByAccountAndPwd(Owner owner);

    PageInfo<Owner> findAllByPage(PageInfo<Owner> info, Owner owner);

    Owner findByOwnerNo(String ownerNo);

    Map<String, Object> getEchartsMap();

}
