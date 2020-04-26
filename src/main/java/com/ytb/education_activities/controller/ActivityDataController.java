package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.IActivityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/ActivityData")
@RestController
@CrossOrigin
public class ActivityDataController {
    @Autowired
    IActivityDataService ActivityDataService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(Integer id){
        return ActivityDataService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.ActivityData n){
        return ActivityDataService.save(n);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return ActivityDataService.list();
    }

}
