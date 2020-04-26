package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.IBasicsTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/BasicsTeacher")
@RestController
@CrossOrigin
public class BasicsTeacherController {
    @Autowired
    IBasicsTeacherService BasicsTeacherService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(String id){
        return BasicsTeacherService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.BasicsTeacher e){
        return BasicsTeacherService.save(e);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return BasicsTeacherService.list();
    }

    @RequestMapping(value = "/basicsteacher",method = RequestMethod.GET)
    public Object basicsTeacher(String teacherCode, String teacherName){
        return BasicsTeacherService.basicsTeacher(teacherCode, teacherName);
    }

}
