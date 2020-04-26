package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.ActivitySignUpMapper;
import com.ytb.education_activities.modal.ActivitySignUp;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IActivitySignUpService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class ActivitySignUpServiceImpl extends ServiceImpl<ActivitySignUpMapper, ActivitySignUp> implements IActivitySignUpService {
    public ActivitySignUp selectBySignUpId(Integer signUpId){
        ActivitySignUp asu=new ActivitySignUp();
        return asu;
    }

    public ObjectResult<ActivitySignUp> activitySignUp(Integer signUpId) {
        ObjectResult<ActivitySignUp> result = new ObjectResult<>();
        QueryWrapper<ActivitySignUp> queryWrapper = new QueryWrapper<>();
        if (signUpId != null) {
            queryWrapper.eq("sign_up_id", signUpId);
        }
        ActivitySignUp activitySignUp = this.baseMapper.selectOne(queryWrapper);
        result.setData(activitySignUp);
        return result;
    }
}
