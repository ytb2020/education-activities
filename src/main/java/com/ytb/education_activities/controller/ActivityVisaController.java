package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.IActivityVisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/ActivityVisa")
@RestController
@CrossOrigin
public class ActivityVisaController {
    @Autowired
    IActivityVisaService ActivityVisaService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(Integer id){
        return ActivityVisaService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.ActivityVisa j){
        return ActivityVisaService.save(j);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return ActivityVisaService.list();
    }

    @RequestMapping(value = "/activityvisa",method = RequestMethod.GET)
    public Object activityVisa(Integer visaId,String visaImg){
        return ActivityVisaService.activityVisa(visaId,visaImg);
    }

}
