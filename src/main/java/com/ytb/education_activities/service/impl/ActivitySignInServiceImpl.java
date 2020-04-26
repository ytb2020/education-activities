package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.ActivitySignInMapper;
import com.ytb.education_activities.modal.ActivitySignIn;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IActivitySignInService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class ActivitySignInServiceImpl extends ServiceImpl<ActivitySignInMapper, ActivitySignIn> implements IActivitySignInService {
    public ActivitySignIn selectBySignInId(Integer signInId){
        ActivitySignIn asi=new ActivitySignIn();
        return asi;
    }

    public ObjectResult<ActivitySignIn> activitySignIn(Integer signInId) {
        ObjectResult<ActivitySignIn> result = new ObjectResult<>();
        QueryWrapper<ActivitySignIn> queryWrapper = new QueryWrapper<>();
        if (signInId != null) {
            queryWrapper.eq("sign_in_id", signInId);
        }
        ActivitySignIn activitySignIn = this.baseMapper.selectOne(queryWrapper);
        result.setData(activitySignIn);
        return result;
    }
}
