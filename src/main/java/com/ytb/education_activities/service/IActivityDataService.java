package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.ActivityData;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IActivityDataService extends IService<ActivityData> {

    public ActivityData selectByDataId(Integer dataId);

    public ObjectResult<ActivityData> activityData(Integer dataId);
}
