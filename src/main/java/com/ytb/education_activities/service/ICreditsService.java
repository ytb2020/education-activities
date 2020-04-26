package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.Credits;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface ICreditsService extends IService<com.ytb.education_activities.modal.Credits> {
    public Credits selectByCreditCode (Integer creditCode);

    public ObjectResult<Credits> credits(Integer creditCode);
}
