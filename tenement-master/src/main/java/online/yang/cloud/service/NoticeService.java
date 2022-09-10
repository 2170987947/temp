package online.yang.cloud.service;

import online.yang.cloud.model.Notice;
import online.yang.cloud.utils.PageInfo;



public interface NoticeService extends BaseService<Notice> {

    PageInfo<Notice> findAll(PageInfo<Notice> info);

    Notice findLastNotice();

}
