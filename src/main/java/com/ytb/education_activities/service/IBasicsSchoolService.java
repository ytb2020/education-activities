package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.BasicsSchool;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IBasicsSchoolService extends IService<BasicsSchool> {
    public BasicsSchool selectBySchoolCode(String schoolCode);

    public ObjectResult<BasicsSchool> basicsSchool(String schoolCode, String schoolName);
}
