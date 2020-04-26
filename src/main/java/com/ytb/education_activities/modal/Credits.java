package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import sun.awt.SunHints;

import java.io.Serializable;

/**
 * educational_activities Author ytb 2020/3/31 13:26
 */
@TableName("credits")
public class Credits implements Serializable {
    @TableId(value="credit_code",type= IdType.ASSIGN_UUID)
    private Integer creditCode;

    @TableField("credit")
    private Integer credit;

    @TableField("credit_time")
    private Integer creditTime;

    @TableField("credit_year")
    private String creditYear;

    @TableField("teacher_code")
    private String teacherCode;


    public Integer getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(Integer creditCode) {
        this.creditCode = creditCode;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Integer creditTime) {
        this.creditTime = creditTime;
    }

    public String getCreditYear() {
        return creditYear;
    }

    public void setCreditYear(String creditYear) {
        this.creditYear = creditYear;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }


    @Override
    public String toString() {
        return "Credits{" +
                "creditCode=" + creditCode +
                ", credit=" + credit +
                ", creditTime=" + creditTime +
                ", creditYear='" + creditYear + '\'' +
                ", teacherCode='" + teacherCode + '\'' +
                '}';
    }
}
