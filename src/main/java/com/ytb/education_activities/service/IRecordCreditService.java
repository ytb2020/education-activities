package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.RecordCredit;
import com.ytb.education_activities.result.ObjectResult;

import java.util.List;
import java.util.Map;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IRecordCreditService extends IService<RecordCredit> {

    public Object insert(RecordCredit recordCredit);
    public Object add(List<RecordCredit> recordCredit);
    public Object update1(RecordCredit recordCredit);
    public Object updates(List<RecordCredit> recordCredit);
    public Object saveOrUpdate1(RecordCredit recordCredit);
    public Object deleteById(Integer recordId);
    public Object deleteByMap(Map<String, Object> columnMap);
    public Object deleteByIds(List<Integer> recordIds);
    public Object selectByRecordCredit(RecordCredit recordCredit);
    public Object selectByMap(Map<String, Object> columnMap);
    public Object selectByIds(List<Integer> recordIds);
    public Object getByRecordYear(String recordYear);
    public Object selectAll();
}
