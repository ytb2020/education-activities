package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.BasicsTeacher;
import com.ytb.education_activities.result.ObjectResult;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IBasicsTeacherService extends IService<BasicsTeacher> {
    public BasicsTeacher selectByTeacherCode(String teacherCode);

    public ObjectResult<BasicsTeacher> basicsTeacher(String teacherCode, String teacherName);
}
