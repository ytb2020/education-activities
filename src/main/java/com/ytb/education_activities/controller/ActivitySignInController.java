package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.IActivitySignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/ActivitySignIn")
@RestController
@CrossOrigin
public class ActivitySignInController {
    @Autowired
    IActivitySignInService ActivitySignInService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(Integer id){
        return ActivitySignInService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.ActivitySignIn k){
        return ActivitySignInService.save(k);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return ActivitySignInService.list();
    }

    @RequestMapping(value = "/activitysignin",method = RequestMethod.GET)
    public Object activitySignIn(Integer signInId){
        return ActivitySignInService.activitySignIn(signInId);
    }

}
