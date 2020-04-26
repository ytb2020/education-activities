package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.BasicsSchoolMapper;
import com.ytb.education_activities.modal.BasicsSchool;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IBasicsSchoolService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class BasicsSchoolServiceImpl extends ServiceImpl<BasicsSchoolMapper, BasicsSchool> implements IBasicsSchoolService {
    public BasicsSchool selectBySchoolCode(String schoolCode){
        BasicsSchool bs=new BasicsSchool();
        return bs;
    }

    public ObjectResult<BasicsSchool> basicsSchool(String schoolCode, String schoolName) {
        ObjectResult<BasicsSchool> result = new ObjectResult<>();
        QueryWrapper<BasicsSchool> queryWrapper = new QueryWrapper<>();
        if (schoolCode != null) {
            queryWrapper.eq("school_code", schoolCode);
        }
        if (schoolName != null) {
            queryWrapper.eq("school_name", schoolName);
        }
        BasicsSchool basicsSchool = this.baseMapper.selectOne(queryWrapper);
        result.setData(basicsSchool);
        return result;
    }
}
