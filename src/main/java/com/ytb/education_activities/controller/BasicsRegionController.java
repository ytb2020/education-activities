package com.ytb.education_activities.controller;

import com.ytb.education_activities.modal.BasicsRegion;
import com.ytb.education_activities.service.IBasicsRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/BasicsRegion")
@RestController
@CrossOrigin
public class BasicsRegionController {
    @Autowired
    IBasicsRegionService BasicsRegionService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(String id){
        return BasicsRegionService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.BasicsRegion g){
        return BasicsRegionService.save(g);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return BasicsRegionService.list();
    }


    @RequestMapping(value = "/basicsregion",method = RequestMethod.GET)
    public Object basicsRegion(String regionCode){
        return BasicsRegionService.basicsRegion(regionCode);
    }

}
