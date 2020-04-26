package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.NoticeMapper;
import com.ytb.education_activities.modal.Notice;
import com.ytb.education_activities.result.*;
import com.ytb.education_activities.service.INoticeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ResponseWrapper;
import java.util.*;

/**
 * education_activities Author ytb 2020/4/1 19:55
 */
@Service
public class NoticeServiceImpl extends ServiceImpl <NoticeMapper,Notice> implements INoticeService {
//单条插入
    public ObjectResult<Notice> insert(Notice notice) {
        ObjectResult<Notice> result = new ObjectResult<>();
        Notice n = null;
        int insert = this.baseMapper.insert(notice);
        if (insert == 0) {
            result.setMsg("插入失败");
        } else {
            n = notice;
            result.setMsg("插入成功");
        }
        result.setData(n);
        return result;
    }

    public ObjectResult<Integer> add(List<Notice> notice) {
        ObjectResult<Integer> result = new ObjectResult<>();
        int n = 0;
        for (int i = 0; i < notice.size(); i++) {
            if (this.baseMapper.insert(notice.get(i)) > 0) {
                n++;
            }
        }
        result.setData(n);
        return result;
    }

//单条更新
    public ObjectResult<Notice> update1(Notice notice) {
        ObjectResult<Notice> result = new ObjectResult<>();
        Notice n = null;
        int update = this.baseMapper.updateById(notice);
        if (update == 0) {
            result.setMsg("未修改数据");
        } else {
            n = notice;
            result.setMsg("已修改数据");
        }
        result.setData(n);
        return result;
    }

    public ObjectResult<Integer> updates(List<Notice> notice) {
        ObjectResult<Integer> result = new ObjectResult<>();
        int n = 0;
        for (int i = 0; i < notice.size(); i++) {
            if (this.updateById(notice.get(i))) {
                n++;
            }
        }
        result.setData(n);
        return result;
    }
//单条保存或更新
    public ObjectResult<Notice> saveOrUpdate1(Notice notice) {
        ObjectResult<Notice> result = new ObjectResult<>();
        Notice n = null;
        result.setMsg("操作失败！");
        if (this.saveOrUpdate(notice)) {
            result.setMsg("操作成功！");
            n = notice;
        }
        result.setData(n);
        return result;
    }


    //删除单条
    public ObjectResult<Integer> deleteById(String noticeCode) {
        ObjectResult<Integer> result = new ObjectResult<>();
        int n=-1;
        if (noticeCode == null || noticeCode.equals("")) {
            result.setMsg("参数错误！");
        } else {
            n = this.baseMapper.deleteById(noticeCode);
            if (n != 0) {
                result.setMsg("删除成功");
            } else {
                result.setMsg("删除失败");
            }
        }
        result.setData(Integer.valueOf(n));
        return result;
    }

    public ObjectResult<List<Notice>> deleteByMap(Map<String, Object> columnMap){
        ObjectResult<List<Notice>> result = new ObjectResult<>();
        List<Notice> notice = this.listByMap(columnMap);
        result.setData(notice);
        return result;
    }

    public ObjectResult<List<Notice>> deleteByIds(List<String> noticeCodes){
        ObjectResult<Notice> result = new ObjectResult<>();
        Map map=null;
        for (int i=0;i<noticeCodes.size();i++){
            map.put("noticeCode",noticeCodes.get(i));}
        return selectByMap(map);
    }

    public ObjectResult<Notice> selectByNotice(Notice notice){
        ObjectResult<Notice> result = new ObjectResult<>();
        QueryWrapper<Notice> queryWrapper = new QueryWrapper<>();
        queryWrapper.setEntity(notice);
        Notice n =this.getOne(queryWrapper);
        result.setData(notice);
        return result;
    }

    public ObjectResult<List<Notice>> selectByMap(Map<String, Object> columnMap){
        ObjectResult<List<Notice>> result = new ObjectResult<>();
        List<Notice> notice = this.listByMap(columnMap);
        result.setData(notice);
        return result;
    }

    public ObjectResult<List<Notice>> selectByIds(List<String> noticeCodes){
        Map map=null;
        for (int i=0;i<noticeCodes.size();i++){
            map.put("noticeCode",noticeCodes.get(i));
        }
        return selectByMap(map);
    }

    //根据ID查询
    public ObjectResult<Notice> getById1(String noticeCode){
        ObjectResult<Notice> result = new ObjectResult<>();
        Notice notice=null;
        if(noticeCode==null||noticeCode.equals("")) {
            result.setMsg("参数错误！");
        }
        else {
            notice = this.getById(noticeCode);
            if(notice==null){
                result.setMsg("未查询到！");
            }
            else {
                result.setMsg("操作成功！");
            }
        }
        result.setData(notice);
        return result;
    }

    //查询所有
    public ObjectResult<List<Notice>> selectAll(){
        ObjectResult<List<Notice>> result = new ObjectResult<>();
        List<Notice> notice = this.list();
        if(notice==null){
            result.setMsg("未查询到！");
        }
        else {
            result.setMsg("操作成功！");
        }
        result.setData(notice);
        return result;
    }
}
