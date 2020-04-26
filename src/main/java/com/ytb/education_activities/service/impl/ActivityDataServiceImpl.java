package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.ActivityDataMapper;
import com.ytb.education_activities.modal.ActivityData;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IActivityDataService;
import org.springframework.stereotype.Service;

/**
 * education_activities Author ytb 2020/4/1 20:07
 */
@Service
public class ActivityDataServiceImpl extends ServiceImpl<ActivityDataMapper, ActivityData> implements IActivityDataService {
    public ActivityData selectByDataId(Integer dataId){
        ActivityData  ad=new ActivityData();
        return ad;
    }

    public ObjectResult<ActivityData> activityData(Integer dataId) {
        ObjectResult<ActivityData> result = new ObjectResult<>();
        QueryWrapper<ActivityData> queryWrapper = new QueryWrapper<>();
        if (dataId != null) {
            queryWrapper.eq("data_id", dataId);
        }
        ActivityData activityData = this.baseMapper.selectOne(queryWrapper);
        result.setData(activityData);
        return result;
    }
}
