package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.BasicsRegion;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IBasicsRegionService extends IService<BasicsRegion> {
    public BasicsRegion selectByRegionCode(String regionCode);

    public ObjectResult<BasicsRegion> basicsRegion(String regionCode);
}
