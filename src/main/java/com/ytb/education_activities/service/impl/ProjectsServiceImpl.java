package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.ProjectsMapper;
import com.ytb.education_activities.modal.Notice;
import com.ytb.education_activities.modal.Projects;
import com.ytb.education_activities.result.*;
import com.ytb.education_activities.service.IProjectsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * education_activities Author ytb 2020/4/1 13:27
 */
@Service
public class ProjectsServiceImpl extends ServiceImpl<ProjectsMapper, Projects> implements IProjectsService {

    /**
      * 教育项目表查询

    public ObjectResult<Projects> projects(String projectCode, String projectName){
        ObjectResult<Projects> result=new ObjectResult<>();
        QueryWrapper<Projects> queryWrapper=new QueryWrapper<>();
        if(projectCode!=null){
            queryWrapper.eq("project_code",projectCode);
        }
        if(projectName!=null){
            queryWrapper.eq("project_name",projectName);
        }
        Projects projects =this.baseMapper.selectOne(queryWrapper);
        System.out.println(projects);
        result.setData(projects);
        return result;
    }

     */


    //单条插入
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public ObjectResult<Projects> insert(Projects projects){
            ObjectResult<Projects> result = new ObjectResult<>();
            Projects n = null;
            int insert = this.baseMapper.insert(projects);
            if (insert == 0) {
                result.setMsg("插入失败");
            } else {
                n = projects;
                result.setMsg("插入成功");
            }
            result.setData(n);
            return result;
    }

    public ObjectResult<Integer> add(List<Projects> projects){
        ObjectResult<Integer> result = new ObjectResult<>();
        int n=0;
        for(int i=0;i<projects.size();i++) {
            if(this.baseMapper.insert(projects.get(i))>0){
                n++;
            }
        }
        result.setData(n);
        return result;
    }

    //单条更新
    public ObjectResult<Projects> update1(Projects projects) {
        ObjectResult<Projects> result = new ObjectResult<>();
        Projects n = null;
        int update = this.baseMapper.updateById(projects);
        if (update == 0) {
            result.setMsg("未修改数据");
        } else {
            n = projects;
            result.setMsg("已修改数据");
        }
        result.setData(n);
        return result;
    }

    public ObjectResult<Integer> updates(List<Projects> projects){
        ObjectResult<Integer> result = new ObjectResult<>();
        int n=0;
        for(int i=0;i<projects.size();i++) {
            if(this.updateById(projects.get(i))){
                n++;
            }
        }
        result.setData(n);
        return result;
    }

    //单条保存或更新
    public ObjectResult<Projects> saveOrUpdate1(Projects projects) {
        ObjectResult<Projects> result = new ObjectResult<>();
        Projects n = null;
        result.setMsg("操作失败！");
        if (this.saveOrUpdate(projects)) {
            result.setMsg("操作成功！");
            n = projects;
        }
        result.setData(n);
        return result;
    }


    //删除单条
    public ObjectResult<Integer> deleteById(String projectCode) {
        ObjectResult<Integer> result = new ObjectResult<>();
        int n=-1;
        if (projectCode == null || projectCode.equals("")) {
            result.setMsg("参数错误！");
        } else {
            n = this.baseMapper.deleteById(projectCode);
            if (n != 0) {
                result.setMsg("删除成功");
            } else {
                result.setMsg("删除失败");
            }
        }
        result.setData(Integer.valueOf(n));
        return result;
    }


    public ObjectResult<List<Projects>> deleteByMap(Map<String, Object> columnMap){
        ObjectResult<List<Projects>> result = new ObjectResult<>();
        List<Projects> projects = this.listByMap(columnMap);
        result.setData(projects);
        return result;
    }
    public ObjectResult<List<Projects>> deleteByIds(List<String> projectCodes){
        ObjectResult<Projects> result = new ObjectResult<>();
        Map map=null;
        for (int i=0;i<projectCodes.size();i++){
            map.put("projectCode",projectCodes.get(i));}
        return selectByMap(map);
    }

    public ObjectResult<Projects> selectByProject(Projects projects){
        ObjectResult<Projects> result = new ObjectResult<>();
        QueryWrapper<Projects> queryWrapper = new QueryWrapper<>();
        queryWrapper.setEntity(projects);
        Projects n =this.getOne(queryWrapper);
        result.setData(projects);
        return result;
    }

    public ObjectResult<List<Projects>> selectByMap(Map<String, Object> columnMap){
        ObjectResult<List<Projects>> result = new ObjectResult<>();
        List<Projects> projects = this.listByMap(columnMap);
        result.setData(projects);
        return result;
    }

    public ObjectResult<List<Projects>> selectByIds(List<String> projectCodes){
        Map map=null;
        for (int i=0;i<projectCodes.size();i++){
            map.put("projectCode",projectCodes.get(i));
        }
        return selectByMap(map);
    }

    //根据ID查询
    public ObjectResult<Projects> getById1(String projectCode){
        ObjectResult<Projects> result = new ObjectResult<>();
        Projects projects=null;
        if(projectCode==null||projectCode.equals("")) {
            result.setMsg("参数错误！");
        }
        else {
            projects = this.getById(projectCode);
            if(projects==null){
                result.setMsg("未查询到！");
            }
            else {
                result.setMsg("操作成功！");
            }
        }
        result.setData(projects);
        return result;
    }

    //查询所有
    public ObjectResult<List<Projects>> selectAll(){
        ObjectResult<List<Projects>> result = new ObjectResult<>();
        List<Projects> projects = this.list();
        if(projects==null){
            result.setMsg("未查询到！");
        }
        else {
            result.setMsg("操作成功！");
        }
        result.setData(projects);
        return result;
    }

}
