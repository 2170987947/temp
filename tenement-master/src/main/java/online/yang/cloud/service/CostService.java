package online.yang.cloud.service;

import online.yang.cloud.model.Cost;
import online.yang.cloud.utils.PageInfo;



public interface CostService extends BaseService<Cost> {

    PageInfo<Cost> findAll(PageInfo<Cost> info, Cost cost);

    Cost findByTypeAndOwnerNo(String costType, String costOwnerNo);

}
