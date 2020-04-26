package com.ytb.education_activities.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ytb.education_activities.mapper.UsersMapper;
import com.ytb.education_activities.modal.Notice;
import com.ytb.education_activities.modal.Users;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IUsersService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * education_activities Author ytb 2020/4/1 13:27
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper,Users> implements IUsersService {
    public   Users selectByUserName(String userName) {
      Users u=new Users();
      QueryWrapper<Users> queryWrapper=new QueryWrapper<>();
      if(userName!=null){
          queryWrapper.eq("user_name",userName);
      }
      u =this.baseMapper.selectOne(queryWrapper);
     return u;
    }

    public   Users selectByUserCode(String userCode){
        Users u=new Users();
        QueryWrapper<Users> queryWrapper=new QueryWrapper<>();
        if(userCode!=null){
            queryWrapper.eq("user_code",userCode);
        }
        u =this.baseMapper.selectOne(queryWrapper);
        return u;
    }

    public ObjectResult<Users> login(String userName, String userPassword) {
        ObjectResult<Users> result = new ObjectResult<>();
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        Users users;
        if ((userName != null) &&(userPassword != null)){
            queryWrapper.eq("user_name", userName);
            users = this.baseMapper.selectOne(queryWrapper);
            if(users==null){
                result.setMsg("用户不存在！");
            }
            else{
                if(!users.getUserPsw().equals(userPassword)){
                    result.setMsg("密码错误！");
                    users=null;
                }
                else{
                    result.setMsg("登陆成功！");
                }
            }
        }
        else {
            if(userName==null||userName.equals("")) {
                result.setMsg("用户名或密码不能为空！");
            }
            if(userPassword==null||userPassword.equals("")) {
                result.setMsg("用户名或密码不能为空！");
            }
            users=null;
        }
        result.setData(users);
        return result;
    }

    @Override
    public ObjectResult<List<Users>> getById(String userCode){
        ObjectResult<List<Users>> result = new ObjectResult<>();
        Users u=null;
        List<Users> user = new ArrayList<>();
        if(userCode==null||userCode.equals("")) {
            result.setMsg("参数错误！");
        }
        else {
            u = this.baseMapper.selectById(userCode);
            if(u==null){
                result.setMsg("未查询到！");
            }
            else {
                result.setMsg("操作成功！");
            }
        }
        user.add(u);
        result.setData(user);
        return result;
    }

    //查询所有
    public ObjectResult<List<Users>> selectAll(){
        ObjectResult<List<Users>> result = new ObjectResult<>();
        List<Users> users = this.list();
        if(users==null){
            result.setMsg("未查询到！");
        }
        else {
            result.setMsg("操作成功！");
        }
        result.setData(users);
        return result;
    }
}
