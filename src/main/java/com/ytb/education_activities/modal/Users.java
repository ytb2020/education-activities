package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.xml.crypto.Data;
import java.io.Serializable;

/**
 * educational_activities Author ytb 2020/3/30 13:47
 */
@TableName("users")
public class Users implements Serializable {

    @TableId(value="user_code",type= IdType.AUTO)
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_psw")
    private String userPsw;

    @TableField("school_code")
    private String schoolCode;

    @TableField("user_role")
    private Integer userRole;

    @TableField("teacher_code")
    private String teacherCode;



    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userPsw='" + userPsw + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                ", userRole=" + userRole +
                ", teacherCode='" + teacherCode + '\'' +
                '}';
    }
}