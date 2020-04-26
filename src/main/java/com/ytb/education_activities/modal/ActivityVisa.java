package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.io.Serializable;
import java.util.Date;

/**
 * educational_activities Author ytb 2020/3/31 20:35
 */
@TableName("activity_visa")
public class ActivityVisa implements Serializable {
    @TableId(value = "visa_id",type = IdType.AUTO)
    private Integer visaId;

    @TableField("visa_img")
    private String visaImg;

    @TableField("visa_type")
    private Integer visaType;

    @TableField("visa_time")
    private Date visaTime;

    @TableField("teacher_code")
    private String teacherCode;

    @TableField("notice_code")
    private String noticeCode;


    public Integer getVisaId() {
        return visaId;
    }

    public void setVisaId(Integer visaId) {
        this.visaId = visaId;
    }

    public String getVisaImg() {
        return visaImg;
    }

    public void setVisaImg(String visaImg) {
        this.visaImg = visaImg;
    }

    public Integer getVisaType() {
        return visaType;
    }

    public void setVisaType(Integer visaType) {
        this.visaType = visaType;
    }

    public Date getVisaTime() {
        return visaTime;
    }

    public void setVisaTime(Date visaTime) {
        this.visaTime = visaTime;
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


    @Override
    public String toString() {
        return "ActivityVisa{" +
                "visaId=" + visaId +
                ", visaImg='" + visaImg + '\'' +
                ", visaType=" + visaType +
                ", visaTime=" + visaTime +
                ", teacherCode='" + teacherCode + '\'' +
                ", noticeCode='" + noticeCode + '\'' +
                '}';
    }
}
