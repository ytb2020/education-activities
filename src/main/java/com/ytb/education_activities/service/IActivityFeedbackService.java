package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.ActivityFeedback;
import com.ytb.education_activities.modal.ActivitySignIn;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IActivityFeedbackService extends IService<ActivityFeedback> {

    public ActivityFeedback selectByFeedbackId(Integer feedbackId);

    public ObjectResult<ActivityFeedback> activityFeedback(Integer feedbackId);
}
