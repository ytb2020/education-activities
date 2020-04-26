package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.Notice;
import com.ytb.education_activities.result.ObjectResult;

import java.util.List;
import java.util.Map;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface INoticeService extends IService<Notice> {
    public Object insert(Notice notice);
    public Object add(List<Notice> notice);
    public Object update1(Notice notice);
    public Object updates(List<Notice> notice);
    public Object saveOrUpdate1(Notice notice);
    public Object deleteById(String noticeCode);
    public Object deleteByMap(Map<String, Object> columnMap);
    public Object deleteByIds(List<String> noticeCodes);
    public Object selectByNotice(Notice notice);
    public Object selectByMap(Map<String, Object> columnMap);
    public Object selectByIds(List<String> noticeCodes);
    public Object getById1(String noticeCode);
    public Object selectAll();

}
