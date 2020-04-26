package com.ytb.education_activities.controller;


import com.ytb.education_activities.modal.RecordCredit;
import com.ytb.education_activities.service.IRecordCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/RecordCredit")
@RestController
@CrossOrigin
public class RecordCreditController {
    @Autowired
    IRecordCreditService RecordCreditService;

    //增加一条
    @RequestMapping(value = "/insert")
    public Object insert(RecordCredit recordCredit){

        return RecordCreditService.insert(recordCredit);
    }


    //批量增加
    @RequestMapping(value = "/add")
    public Object add(List<RecordCredit> recordCredit){

        return RecordCreditService.add(recordCredit);
    }

    //单条更新
    @RequestMapping(value = "/update")
    public Object update(RecordCredit recordCredit){

        return RecordCreditService.update1(recordCredit);
    }

    //多条更新
    @RequestMapping(value = "/updates")
    public Object updates(List<RecordCredit> recordCredit){

        return RecordCreditService.updates(recordCredit);
    }

    //单条保存或更新
    @RequestMapping(value = "/saveOrUpdate")
    public Object saveOrUpdate(RecordCredit recordCredit){

        return RecordCreditService.saveOrUpdate1(recordCredit);
    }

    //删除单条
    @RequestMapping(value = "/deleteById")
    public Object deleteById(Integer recordId){

        return RecordCreditService.deleteById(recordId);
    }

    //根据Map删除多条
    @RequestMapping(value = "/deleteByMap")
    public Object deleteByMap(Map<String, Object> columnMap){

        return RecordCreditService.deleteByMap(columnMap);
    }

    //根据多个ID删除多条
    @RequestMapping(value = "/deleteByIds")
    public Object deleteByIds(List<Integer> recordIds){

        return RecordCreditService.deleteByIds(recordIds);
    }


    //根据实体类查询
    @RequestMapping(value="/selectByRecordCredit")
    public Object selectByRecordCredit(RecordCredit recordCredit){

        return RecordCreditService.selectByRecordCredit(recordCredit);
    }

    //根据Map多条查询
    @RequestMapping(value = "/selectByMap")
    public Object selectByMap(Map<String, Object> columnMap){

        return RecordCreditService.selectByMap(columnMap);
    }

    //根据多个ID查询多条
    @RequestMapping(value = "/selectByIds")
    public Object selectByIds(List<Integer> recordIds){

        return RecordCreditService.selectByIds(recordIds);
    }

    //根据年份查询
    @RequestMapping(value="/getByRecordYear")
    public Object getById(String recordYear){

        return RecordCreditService.getByRecordYear(recordYear);
    }

    //查询所有
    @RequestMapping(value="/selectAll")
    public Object selectAll(){

        return RecordCreditService.selectAll();
    }




}
