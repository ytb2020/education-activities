package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * educational_activities Author ytb 2020/3/31 20:07
 */
@TableName("basics_school")
public class BasicsSchool implements Serializable {
    @TableId(value = "school_code",type = IdType.INPUT)
    private String schoolCode;

    @TableField("school_name")
    private String schoolName;

    @TableField("school_explain")
    private String schoolExplain;

    @TableField("school_type")
    private String schoolType;

    @TableField("school_nature")
    private String schoolNature;

    @TableField("school_region")
    private String schoolRegion;


    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolExplain() {
        return schoolExplain;
    }

    public void setSchoolExplain(String schoolExplain) {
        this.schoolExplain = schoolExplain;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getSchoolNature() {
        return schoolNature;
    }

    public void setSchoolNature(String schoolNature) {
        this.schoolNature = schoolNature;
    }

    public String getSchoolRegion() {
        return schoolRegion;
    }

    public void setSchoolRegion(String schoolRegion) {
        this.schoolRegion = schoolRegion;
    }


    @Override
    public String toString() {
        return "BasicsSchool{" +
                "schoolCode='" + schoolCode + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", schoolExplain='" + schoolExplain + '\'' +
                ", schoolType='" + schoolType + '\'' +
                ", schoolNature='" + schoolNature + '\'' +
                ", schoolRegion='" + schoolRegion + '\'' +
                '}';
    }
}
