package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * educational_activities Author ytb 2020/3/31 13:35
 */
@TableName("basics_code")
public class BasicsTeacher implements Serializable {
    @TableId(value="teacher_code",type= IdType.ASSIGN_UUID)
    private String teacherCode;

    @TableField("teacher_name")
    private String teacherName;

    @TableField("school_code")
    private String schoolCode;

    @TableField("teacher_id")
    private String teacherId;

    @TableField("major_code")
    private String majorCode;

    @TableField("teacher_sex")
    private Boolean teacherSex;

    @TableField("teacher_birthday")
    private Date teacherBirthday;

    @TableField("teacher_region")
    private String teacherRegion;


    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public Boolean getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(Boolean teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Date getTeacherBirthday() {
        return teacherBirthday;
    }

    public void setTeacherBirthday(Date teacherBirthday) {
        this.teacherBirthday = teacherBirthday;
    }

    public String getTeacherRegion() {
        return teacherRegion;
    }

    public void setTeacherRegion(String teacherRegion) {
        this.teacherRegion = teacherRegion;
    }


    @Override
    public String toString() {
        return "BasicsTeacher{" +
                "teacherCode='" + teacherCode + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", majorCode='" + majorCode + '\'' +
                ", teacherSex=" + teacherSex +
                ", teacherBirthday=" + teacherBirthday +
                ", teacherRegion='" + teacherRegion + '\'' +
                '}';
    }
}
