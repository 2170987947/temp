package online.yang.cloud.service;

import online.yang.cloud.model.Repair;
import online.yang.cloud.utils.PageInfo;


public interface RepairService extends BaseService<Repair> {

    PageInfo<Repair> findAll(PageInfo<Repair> info);

}
