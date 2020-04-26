package com.ytb.education_activities.controller;

import com.ytb.education_activities.modal.BasicsLevel;
import com.ytb.education_activities.service.IBasicsLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/BasicsLevel")
@RestController
@CrossOrigin
public class BasicsLevelController {
    @Autowired
    IBasicsLevelService BasicsLevelService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(String id){
        return BasicsLevelService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.BasicsLevel i){
        return BasicsLevelService.save(i);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return BasicsLevelService.list();
    }

    @RequestMapping(value = "/basicslevel",method = RequestMethod.GET)
    public Object basicsLevel(String levelCode){
        return BasicsLevelService.basicsLevel(levelCode);
    }

}
