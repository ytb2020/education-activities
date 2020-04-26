package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.ICreditsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/Credits")
@RestController
@CrossOrigin
public class CreditsController {
    @Autowired
    ICreditsService CreditsService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(Integer id){
        return CreditsService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.Credits d){
        return CreditsService.save(d);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return CreditsService.list();
    }

    @RequestMapping(value="/credits",method = RequestMethod.GET)
    public Object credits (Integer creditCode){
        return CreditsService.credits(creditCode);
    }

}
