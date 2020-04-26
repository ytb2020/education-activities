package com.ytb.education_activities.controller;

import com.ytb.education_activities.service.IActivityFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/ActivityFeedback")
@RestController
@CrossOrigin
public class ActivityFeedbackController {
    @Autowired
    IActivityFeedbackService ActivityFeedbackService;

    @RequestMapping(value="/getById",method= RequestMethod.GET)
    public Object getById(Integer id){
        return ActivityFeedbackService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(com.ytb.education_activities.modal.ActivityFeedback m){
        return ActivityFeedbackService.save(m);
    }

    @RequestMapping(value="/selectAll",method= RequestMethod.GET)
    public Object selectAll(){
        return ActivityFeedbackService.list();
    }

    @RequestMapping(value = "/activityfeedback",method = RequestMethod.GET)
    public Object activityFeedback(Integer feedbackId){
        return ActivityFeedbackService.activityFeedback(feedbackId);
    }

}
