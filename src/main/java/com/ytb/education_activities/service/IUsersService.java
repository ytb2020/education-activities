package com.ytb.education_activities.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytb.education_activities.modal.Users;
import com.ytb.education_activities.result.ObjectResult;

import java.util.List;

/**
 * education_activities Author ytb 2020/4/1 13:21
 */
public interface IUsersService extends IService<Users> {
  public   Users selectByUserName(String userName);

  public   Users selectByUserCode(String userCode);

  public ObjectResult<Users> login(String userName, String userPassword);

  public ObjectResult<List<Users>> getById(String userCode);

  public ObjectResult<List<Users>> selectAll();
}
