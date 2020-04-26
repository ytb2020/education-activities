package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.ActivityVisaMapper;
import com.ytb.education_activities.modal.ActivityVisa;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IActivityVisaService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class ActivityVisaServiceImpl extends ServiceImpl<ActivityVisaMapper, ActivityVisa> implements IActivityVisaService {
    public ActivityVisa selectByVisaImg(String visaImg) {
        ActivityVisa av=new ActivityVisa();
        QueryWrapper<ActivityVisa> queryWrapper=new QueryWrapper<>();
        if(visaImg!=null){
            queryWrapper.eq("visa_img",visaImg);
        }
        av =this.baseMapper.selectOne(queryWrapper);
        return av;
    }



    public ObjectResult<ActivityVisa> activityVisa(Integer visaId, String visaImg) {
        ObjectResult<ActivityVisa> result = new ObjectResult<>();
        QueryWrapper<ActivityVisa> queryWrapper = new QueryWrapper<>();
        if (visaId != null) {
            queryWrapper.eq("visa_id", visaId);
        }
        if (visaImg != null) {
            queryWrapper.eq("visa_img", visaImg);
        }
        ActivityVisa activityVisa = this.baseMapper.selectOne(queryWrapper);
        result.setData(activityVisa);
        return result;
    }
}
