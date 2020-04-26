package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.IActivitySignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/ActivitySignUp")
@RestController
@CrossOrigin
public class ActivitySignUpController {
    @Autowired
    IActivitySignUpService ActivitySignUpService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(Integer id){
        return ActivitySignUpService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.ActivitySignUp l){
        return ActivitySignUpService.save(l);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return ActivitySignUpService.list();
    }

    @RequestMapping(value = "/activitysignup",method = RequestMethod.GET)
    public Object activitySignUp(Integer signUpId){
        return ActivitySignUpService.activitySignUp(signUpId);
    }

}
