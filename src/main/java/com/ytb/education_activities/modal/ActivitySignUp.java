package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * educational_activities Author ytb 2020/3/31 20:42
 */
@TableName("activity_sign_up")
public class ActivitySignUp implements Serializable {
    @TableId(value = "sign_up_id",type = IdType.AUTO)
    private Integer signUpId;

    @TableField("teacher_code")
    private String teacherCode;

    @TableField("notice_code")
    private String noticeCode;

    @TableField("sign_up_time")
    private Date signUpTime;


    public Integer getSignUpId() {
        return signUpId;
    }

    public void setSignUpId(Integer signUpId) {
        this.signUpId = signUpId;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    public Date getSignUpTime() {
        return signUpTime;
    }

    public void setSignUpTime(Date signUpTime) {
        this.signUpTime = signUpTime;
    }


    @Override
    public String toString() {
        return "ActivitySignUp{" +
                "signUpId=" + signUpId +
                ", teacherCode='" + teacherCode + '\'' +
                ", noticeCode='" + noticeCode + '\'' +
                ", signUpTime=" + signUpTime +
                '}';
    }
}
