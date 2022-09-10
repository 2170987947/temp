package online.yang.cloud.service.impl;

import cn.hutool.core.util.IdUtil;
import online.yang.cloud.mapper.AdminMapper;
import online.yang.cloud.mapper.ManagerMapper;
import online.yang.cloud.mapper.NoticeMapper;
import online.yang.cloud.model.Notice;
import online.yang.cloud.service.NoticeService;
import online.yang.cloud.utils.PageInfo;
import org.springframework.stereotype.Service;

import java.util.Date;



@Service
public class NoticeServiceImpl implements NoticeService {

    private NoticeMapper noticeMapper;
    private AdminMapper adminMapper;
    private ManagerMapper managerMapper;


//    public NoticeServiceImpl(NoticeMapper noticeMapper, AdminMapper adminMapper) {
//        this.noticeMapper = noticeMapper;
//        this.adminMapper = adminMapper;
//    }
public NoticeServiceImpl(NoticeMapper noticeMapper, ManagerMapper managerMapper) {
    this.noticeMapper = noticeMapper;
    this.managerMapper = managerMapper;
}

    @Override
    public Notice findById(String id) {
        return noticeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Notice notice) {
        notice.setNoticeId(IdUtil.simpleUUID());
        notice.setNoticeDate(new Date());
        notice.setNoticeCreater(managerMapper.selectByPrimaryKey(notice.getNoticeCreaterNo()).getEmpName());

//        notice.setNoticeCreater(adminMapper.selectByPrimaryKey(notice.getNoticeCreaterNo()).getAccount());
        System.out.println("打印： " + notice.getNoticeId() + " " + notice.getNoticeCreaterNo() + " " + notice.getNoticeCreater() + " " + notice.getNoticeContent() + " " + notice.getNoticeDate());
        return noticeMapper.insertSelective(notice);
    }

    @Override
    public int update(Notice notice) {
        return noticeMapper.updateByPrimaryKeySelective(notice);
    }

    @Override
    public int delete(String id) {
        return noticeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<Notice> findAll(PageInfo<Notice> info) {
        info.setCount(noticeMapper.getCount());
        info.setData(noticeMapper.findAll((info.getPage() - 1) * info.getLimit(), info.getLimit()));
        return info;
    }

    @Override
    public Notice findLastNotice() {
        return noticeMapper.selectLastNotice();
    }
}
