package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.ActivitySignIn;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IActivitySignInService extends IService<ActivitySignIn> {

    public ActivitySignIn selectBySignInId(Integer signInId);

    public ObjectResult<ActivitySignIn> activitySignIn(Integer signInId);
}
