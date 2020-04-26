package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.ActivityVisa;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IActivityVisaService extends IService<ActivityVisa> {
    public ActivityVisa selectByVisaImg(String visaImg);

    public ObjectResult<ActivityVisa> activityVisa(Integer visaId, String visaImg);
}
