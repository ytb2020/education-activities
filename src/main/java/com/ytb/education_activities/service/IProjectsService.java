package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.Projects;

import java.util.List;
import java.util.Map;


/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IProjectsService extends IService<Projects> {
    public Object insert(Projects projects);
    public Object add(List<Projects> projects);
    public Object update1(Projects projects);
    public Object updates(List<Projects> projects);
    public Object saveOrUpdate1(Projects projects);
    public Object deleteById(String ProjectCode);
    public Object deleteByMap(Map<String, Object> columnMap);
    public Object deleteByIds(List<String> projectCodes);
    public Object selectByProject(Projects projects);
    public Object selectByMap(Map<String, Object> columnMap);
    public Object selectByIds(List<String> projectCodes);
    public Object getById1(String projectCode);
    public Object selectAll();
}
