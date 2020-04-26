package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.BasicsMajor;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IBasicsMajorService extends IService<BasicsMajor> {
    public BasicsMajor selectByMajorCode(String majorCode);

    public ObjectResult<BasicsMajor> basicsMajor(String majorCode);
}
