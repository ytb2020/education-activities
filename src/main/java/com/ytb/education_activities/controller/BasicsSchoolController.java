package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.IBasicsSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/BasicsSchool")
@RestController
@CrossOrigin
public class BasicsSchoolController {
    @Autowired
    IBasicsSchoolService BasicsSchoolService;

    @RequestMapping(value="/getById",method= RequestMethod.POST)
    public Object getById(String schoolCode){
        return BasicsSchoolService.getById(schoolCode);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.BasicsSchool f){
        return BasicsSchoolService.save(f);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.POST)
    public Object selectAll(){
        return BasicsSchoolService.list();
    }

    @RequestMapping(value = "/basicSchool",method = RequestMethod.POST)
    public Object basicsSchool(String schoolCode, String schoolName){
        return BasicsSchoolService.basicsSchool(schoolCode, schoolName);
    }

}
