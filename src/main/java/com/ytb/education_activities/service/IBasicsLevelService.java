package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.BasicsLevel;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IBasicsLevelService extends IService<BasicsLevel> {
    public BasicsLevel selectByLevelCode(String levelCode);

    public ObjectResult<BasicsLevel> basicsLevel(String levelCode);
}
