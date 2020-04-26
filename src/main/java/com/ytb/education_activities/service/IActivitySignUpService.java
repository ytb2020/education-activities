package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.ActivitySignUp;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IActivitySignUpService extends IService<ActivitySignUp> {
    public ActivitySignUp selectBySignUpId(Integer signUpId);

    public ObjectResult<ActivitySignUp> activitySignUp(Integer signUpId);
}

