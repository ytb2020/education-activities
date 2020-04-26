package com.ytb.education_activities.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ytb.education_activities.modal.Users;
import com.ytb.education_activities.result.ObjectResult;
import com.ytb.education_activities.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

/**
 * education_activities Author ytb 2020/4/1 20:27
 */
@RequestMapping("/Users")
@RestController
@CrossOrigin
public class UsersController {
    @Autowired
    IUsersService UsersService;
    private BaseMapper<Object> comm;

    /**
     * YTB
     * 登录接口
     *   @param userName：用户名
     *   @param passWord：密码
     *   @return
     */
    @RequestMapping(value="/login" , method=RequestMethod.POST)
    public String loginCheck(String userName,String passWord) {
        Users u;
        System.out.println(userName + passWord);
        u = UsersService.selectByUserName(userName);
        System.out.println(JSONArray.toJSONString(u));
        if (u == null) {
            return "yonghubucunzai";
        } else {
            if (passWord.equals(u.getUserPsw())) {
                return JSONArray.toJSONString(u);
            } else {
                return "mimacuowu";
            }
        }
    }




    /**
     * 新增用户
     * @param userName:用户名
     * @param passWord：密码
     * @param schoolCode：学校代码
     * @param teacherCode：教师代码
     * @param userRole：用户权限
     * @return
     */
    @RequestMapping(value="/insertUser" , method=RequestMethod.POST )
    public String insertUser(String userName, String passWord, String schoolCode,
                             Integer userRole, String teacherCode) {
        Users checkUser;
        checkUser = UsersService.selectByUserName(userName);
        if(checkUser != null){
            return "yonghuyicunzai";
        }else{
            Users user = new Users();
            boolean b;
            System.out.println(user);
            user.setUserName(userName);
            user.setUserPsw(passWord);
            user.setSchoolCode(schoolCode);
            user.setUserRole(userRole);
            user.setTeacherCode(teacherCode);
            b = UsersService.save(user);
            System.out.println(b);
            if(b){
                return "成功新增用户";
            }else{
                return "新增用户失败";
            }
        }
    }

    /**
     *根据userCode修改密码
     * @param userCode:用户代码
     * @param passWord：密码
     * @return
     */
    @RequestMapping(value="/updatePassByUserCode" , method=RequestMethod.POST )
    public String updatePassByUserCode(String userCode, String passWord) {
        Users checkUser;
        checkUser = UsersService.selectByUserCode(userCode);
        if(checkUser == null){
            return "用户不存在";
        }else{
            Users user = new Users();
            boolean b;
            user.setUserCode(userCode);
            user.setUserPsw(passWord);
            b = UsersService.updateById(user);
            if(b){
                return "密码修改成功";
            }else{
                return "密码修改失败";
            }
        }
    }


    /**
     *根据userName删除用户
     * @param userName:用户名
     * @return
     */
    @RequestMapping(value="/deleteUser" , method=RequestMethod.POST)
    public String deleteUser(String userName) {
        Users checkUser;
        checkUser = UsersService.selectByUserName(userName);
        if(checkUser == null){
            return "用户不存在";
        }else{
            boolean b;
            QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("user_name",userName);
            b = UsersService.remove(queryWrapper);
            if(b){
                return "用户删除成功";
            }else{
                return "用户删除失败";
            }
        }
    }




    @RequestMapping(value="/login1",method= RequestMethod.POST)
    public Object login1(String userName, String userPassword){

        return UsersService.login(userName,userPassword);
    }




    @RequestMapping(value="/getById",method= RequestMethod.POST)
    public Object getById(String id){

        return UsersService.getById(id);
    }

    /**
     * 增加
     *
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert1(Users b){

        return UsersService.save(b);
    }



    @RequestMapping(value = "/selectAll")
    public ObjectResult<List<Users>> selectAll(){

        return UsersService.selectAll();
    }

    @RequestMapping(value = "/wgdCsh")
    public String wgdCsh(){
        String s="Wang GuoDe";
        return s;
    }

}
