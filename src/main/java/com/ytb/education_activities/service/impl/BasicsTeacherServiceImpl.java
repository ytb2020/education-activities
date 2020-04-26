package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.BasicsTeacherMapper;
import com.ytb.education_activities.modal.BasicsTeacher;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IBasicsTeacherService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class BasicsTeacherServiceImpl extends ServiceImpl<BasicsTeacherMapper, BasicsTeacher> implements IBasicsTeacherService {
    public BasicsTeacher selectByTeacherCode(String teacherCode){
        BasicsTeacher bt=new BasicsTeacher();
        return bt;
    }

    public ObjectResult<BasicsTeacher> basicsTeacher(String teacherCode, String teacherName) {
        ObjectResult<BasicsTeacher> result = new ObjectResult<>();
        QueryWrapper<BasicsTeacher> queryWrapper = new QueryWrapper<>();
        if (teacherCode != null) {
            queryWrapper.eq("teacher_code", teacherCode);
        }
        if (teacherName != null) {
            queryWrapper.eq("teacher_name", teacherName);
        }
        BasicsTeacher basicsTeacher = this.baseMapper.selectOne(queryWrapper);
        result.setData(basicsTeacher);
        return result;
    }
}
