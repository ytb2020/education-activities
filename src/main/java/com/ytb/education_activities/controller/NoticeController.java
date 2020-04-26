package com.ytb.education_activities.controller;

import com.alibaba.fastjson.JSON;
import com.ytb.education_activities.modal.Notice;
import com.ytb.education_activities.service.INoticeService;
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
@RequestMapping("/Notice")
@RestController
@CrossOrigin
public class NoticeController {
    @Autowired
    INoticeService NoticeService;

    //增加一条
    @RequestMapping(value = "/insert")
    public Object insert(Notice notice){

        return NoticeService.insert(notice);
    }


    //批量增加
    @RequestMapping(value = "/add")
    public Object add(List<Notice> notice){
        return NoticeService.add(notice);
    }

    //单条更新
    @RequestMapping(value = "/update")
    public Object update(Notice notice){

        return NoticeService.update1(notice);
    }

    //多条更新
    @RequestMapping(value = "/updates")
    public Object updates(List<Notice> notice){

        return NoticeService.updates(notice);
    }

    //单条保存或更新
    @RequestMapping(value = "/saveOrUpdate")
    public Object saveOrUpdate(Notice notice){

        return NoticeService.saveOrUpdate1(notice);
    }

    //删除单条
    @RequestMapping(value = "/deleteById")
    public Object deleteById(String noticeCode){

        return NoticeService.deleteById(noticeCode);
    }

    //根据Map删除多条
    @RequestMapping(value = "/deleteByMap")
    public Object deleteByMap(Map<String, Object> columnMap){

        return NoticeService.deleteByMap(columnMap);
    }

    //根据多个ID删除多条
    @RequestMapping(value = "/deleteByIds")
    public Object deleteByIds(List<String> noticeCodes){

        return NoticeService.deleteByIds(noticeCodes);
    }


    //根据实体类查询
    @RequestMapping(value="/selectByNotice")
    public Object selectByNotice(Notice notice){

        return NoticeService.selectByNotice(notice);
    }

    //根据Map多条查询
    @RequestMapping(value = "/selectByMap")
    public Object selectByMap(Map<String, Object> columnMap){

        return NoticeService.selectByMap(columnMap);
    }

    //根据多个ID查询多条
    @RequestMapping(value = "/selectByIds")
    public Object selectByIds(List<String> noticeCodes){

        return NoticeService.selectByIds(noticeCodes);
    }

    //根据ID查询
    @RequestMapping(value="/getById")
    public Object getById(String noticeCode){

        return NoticeService.getById1(noticeCode);
    }

    //查询所有
    @RequestMapping(value="/selectAll")
    public Object selectAll(){

        return NoticeService.selectAll();
    }

}
