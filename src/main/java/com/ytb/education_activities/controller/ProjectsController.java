package com.ytb.education_activities.controller;

import com.ytb.education_activities.modal.Projects;
import com.ytb.education_activities.service.IProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/Projects")
@RestController
@CrossOrigin
public class ProjectsController {
    @Autowired
    IProjectsService ProjectsService;

    //增加一条
    @RequestMapping(value = "/insert")
    public Object insert(Projects projects){

        return ProjectsService.insert(projects);
    }


    //批量增加
    @RequestMapping(value = "/add")
    public Object add(List<Projects> projects){
        return ProjectsService.add(projects);
    }

    //单条更新
    @RequestMapping(value = "/update")
    public Object update(Projects projects){

        return ProjectsService.update1(projects);
    }

    //多条更新
    @RequestMapping(value = "/updates")
    public Object updates(List<Projects> projects){

        return ProjectsService.updates(projects);
    }

    //单条保存或更新
    @RequestMapping(value = "/saveOrUpdate")
    public Object saveOrUpdate(Projects projects){

        return ProjectsService.saveOrUpdate1(projects);
    }

    //删除单条
    @RequestMapping(value = "/deleteById")
    public Object deleteById(String projectCode){

        return ProjectsService.deleteById(projectCode);
    }

    //根据Map删除多条
    @RequestMapping(value = "/deleteByMap")
    public Object deleteByMap(Map<String, Object> columnMap){

        return ProjectsService.deleteByMap(columnMap);
    }

    //根据多个ID删除多条
    @RequestMapping(value = "/deleteByIds")
    public Object deleteByIds(List<String> projectCodes){

        return ProjectsService.deleteByIds(projectCodes);
    }


    //根据实体类查询
    @RequestMapping(value="/selectByProject")
    public Object selectByProject(Projects projects){

        return ProjectsService.selectByProject(projects);
    }

    //根据Map多条查询
    @RequestMapping(value = "/selectByMap")
    public Object selectByMap(Map<String, Object> columnMap){

        return ProjectsService.selectByMap(columnMap);
    }

    //根据多个ID查询多条
    @RequestMapping(value = "/selectByIds")
    public Object selectByIds(List<String> projectCodes){

        return ProjectsService.selectByIds(projectCodes);
    }

    //根据ID查询
    @RequestMapping(value="/getById")
    public Object getById1(String projectCode){

        return ProjectsService.getById1(projectCode);
    }

    //查询所有
    @RequestMapping(value="/selectAll")
    public Object selectAll(){

        return ProjectsService.selectAll();
    }


    }

