package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.RecordCreditMapper;
import com.ytb.education_activities.modal.RecordCredit;
import com.ytb.education_activities.result.*;
import com.ytb.education_activities.service.IRecordCreditService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * education_activities Author ytb 2020/4/1 13:27
 */
@Service
public class RecordCreditServiceImpl extends ServiceImpl<RecordCreditMapper, RecordCredit> implements IRecordCreditService {

    /**
     * 学分记录表查询

    public ObjectResult<RecordCredit> recordCredit(Integer recordId){
        ObjectResult<RecordCredit> result=new ObjectResult<>();
        QueryWrapper<RecordCredit> queryWrapper=new QueryWrapper<>();
        if(recordId!=null){
            queryWrapper.eq("record_id",recordId);
        }
        RecordCredit recordCredit =this.baseMapper.selectOne(queryWrapper);
        System.out.println(recordCredit);
        result.setData(recordCredit);
        return result;
    }*/

    //单条插入
    public ObjectResult<RecordCredit> insert(RecordCredit recordCredit){
        ObjectResult<RecordCredit> result = new ObjectResult<>();
        RecordCredit rc = null;
        int insert = this.baseMapper.insert(recordCredit);
        if (insert == 0) {
            result.setMsg("参数错误");
        }else {
            result.setMsg("插入成功");
            rc = recordCredit;
        }
        result.setData(rc);
        return result;
    }

    public ObjectResult<Integer> add(List<RecordCredit> recordCredit){
        ObjectResult<Integer> result = new ObjectResult<>();
        int n=0;
        for(int i=0;i<recordCredit.size();i++) {
            if(this.baseMapper.insert(recordCredit.get(i))>0){
                n++;
            }
        }
        result.setData(n);
        return result;
    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public ObjectResult<RecordCredit> update1(RecordCredit recordCredit){
        ObjectResult<RecordCredit> result = new ObjectResult<>();
        // 参数校验
        String errorMessage = ValidateUtil.getErrorMessage(recordCredit, UpdateParam.class);
        if (!StringUtils.isBlank(errorMessage)) {
            result.setError(errorMessage);
            return result;
        }
        int update = this.baseMapper.updateById(recordCredit);
        if (update == 0) {
            result.setError("未修改数据");
            return result;
        }
        result.setData(recordCredit);
        return result;
    }

    public ObjectResult<Integer> updates(List<RecordCredit> recordCredit){
        ObjectResult<Integer> result = new ObjectResult<>();
        int n=0;
        for(int i=0;i<recordCredit.size();i++) {
            if(this.updateById(recordCredit.get(i))){
                n++;
            }
        }
        result.setData(n);
        return result;
    }
    public ObjectResult<RecordCredit> saveOrUpdate1(RecordCredit recordCredit){
        ObjectResult<RecordCredit> result = new ObjectResult<>();
        RecordCredit n =null;
        if(this.saveOrUpdate(recordCredit)){
            result.setSuccess("100","success");
            n=recordCredit;
        }
        result.setData(n);
        return result;
    }


    @Transactional(rollbackFor = {Exception.class})
    @Override
    public BaseResult deleteById(Integer recordId){
        this.baseMapper.deleteById(recordId);
        return BaseResult.success();
    }


    public ObjectResult<List<RecordCredit>> deleteByMap(Map<String, Object> columnMap){
        ObjectResult<List<RecordCredit>> result = new ObjectResult<>();
        List<RecordCredit> recordCredits = this.listByMap(columnMap);
        result.setData(recordCredits);
        return result;
    }
    public ObjectResult<List<RecordCredit>> deleteByIds(List<Integer> recordId){
        ObjectResult<RecordCredit> result = new ObjectResult<>();
        Map map=null;
        for (int i=0;i<recordId.size();i++){
            map.put("recordId",recordId.get(i));}
        return selectByMap(map);
    }

    public ObjectResult<RecordCredit> selectByRecordCredit(RecordCredit recordCredit){
        ObjectResult<RecordCredit> result = new ObjectResult<>();
        QueryWrapper<RecordCredit> queryWrapper = new QueryWrapper<>();
        queryWrapper.setEntity(recordCredit);
        RecordCredit n =this.getOne(queryWrapper);
        result.setData(recordCredit);
        return result;
    }

    public ObjectResult<List<RecordCredit>> selectByMap(Map<String, Object> columnMap){
        ObjectResult<List<RecordCredit>> result = new ObjectResult<>();
        List<RecordCredit> recordCredits = this.listByMap(columnMap);
        result.setData(recordCredits);
        return result;
    }

    public ObjectResult<List<RecordCredit>> selectByIds(List<Integer> recordId){
        Map map=null;
        for (int i=0;i<recordId.size();i++){
            map.put("recordId",recordId.get(i));
        }
        return selectByMap(map);
    }

    //根据年份查询
    public ObjectResult<List<RecordCredit>> getByRecordYear(String recordYear){
        ObjectResult<List<RecordCredit>> result = new ObjectResult<>();
        QueryWrapper<RecordCredit> queryWrapper = new QueryWrapper<>();
        List<RecordCredit> recordCredit = new ArrayList<>();
        if(recordYear==null||recordYear.equals("")) {
            result.setMsg("请输入年份！");
        }
        else {
            queryWrapper.eq("record_year", recordYear);
            recordCredit = this.baseMapper.selectList(queryWrapper);
            if(recordCredit==null){
                result.setMsg("未查询到！");
            }
            else {
                result.setMsg("操作成功！");

            }
        }
        result.setData(recordCredit);
        return result;
    }


    //查询所有
    public ObjectResult<List<RecordCredit>> selectAll(){
        ObjectResult<List<RecordCredit>> result = new ObjectResult<>();
        List<RecordCredit> recordCredit = this.list();
        if(recordCredit==null){
            result.setMsg("未查询到！");
        }
        else {
            result.setMsg("操作成功！");
        }
        result.setData(recordCredit);
        return result;
    }
}
