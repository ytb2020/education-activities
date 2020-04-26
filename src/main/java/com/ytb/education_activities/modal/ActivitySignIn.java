package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * educational_activities Author ytb 2020/3/31 20:47
 */
@TableName("activity_sign_in")
public class ActivitySignIn implements Serializable {
    @TableId(value = "sign_in_id",type = IdType.AUTO)
    private Integer signInId;

    @TableField("teacher_code")
    private String teacherCode;

    @TableField("notice_code")
    private String noticeCode;

    @TableField("sign_in_type")
    private String signInType;

    @TableField("sign_time")
    private Date signTime;

    @TableField("sign_position")
    private String signPosition;


    public Integer getSignInId() {
        return signInId;
    }

    public void setSignInId(Integer signInId) {
        this.signInId = signInId;
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

    public String getSignInType() {
        return signInType;
    }

    public void setSignInType(String signInType) {
        this.signInType = signInType;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getSignPosition() {
        return signPosition;
    }

    public void setSignPosition(String signPosition) {
        this.signPosition = signPosition;
    }


    @Override
    public String toString() {
        return "ActivitySignIn{" +
                "signInId=" + signInId +
                ", teacherCode='" + teacherCode + '\'' +
                ", noticeCode='" + noticeCode + '\'' +
                ", signInType='" + signInType + '\'' +
                ", signTime=" + signTime +
                ", signPosition='" + signPosition + '\'' +
                '}';
    }
}
