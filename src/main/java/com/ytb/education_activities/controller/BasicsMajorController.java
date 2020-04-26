package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.IBasicsMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/BasicsMajor")
@RestController
@CrossOrigin
public class BasicsMajorController {
    @Autowired
    IBasicsMajorService BasicsMajorService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(String id){
        return BasicsMajorService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.BasicsMajor h){
        return BasicsMajorService.save(h);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return BasicsMajorService.list();
    }


    @RequestMapping(value = "/basicsmajor",method = RequestMethod.GET)
    public Object basicsMajor(String majorCode){
        return BasicsMajorService.basicsMajor(majorCode);
    }

}
