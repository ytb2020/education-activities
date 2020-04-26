package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.ActivityFeedbackMapper;
import com.ytb.education_activities.modal.ActivityFeedback;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IActivityFeedbackService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class ActivityFeedbackServiceImpl extends ServiceImpl<ActivityFeedbackMapper, ActivityFeedback> implements IActivityFeedbackService {
    public ActivityFeedback selectByFeedbackId(Integer feedbackId){
        ActivityFeedback  af=new ActivityFeedback();
        return af;
    }

    public ObjectResult<ActivityFeedback> activityFeedback(Integer feedbackId) {
        ObjectResult<ActivityFeedback> result = new ObjectResult<>();
        QueryWrapper<ActivityFeedback> queryWrapper = new QueryWrapper<>();
        if (feedbackId != null) {
            queryWrapper.eq("feedback_id", feedbackId);
        }
        ActivityFeedback activityFeedback = this.baseMapper.selectOne(queryWrapper);
        result.setData(activityFeedback);
        return result;
    }

}
