package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * educational_activities Author ytb 2020/3/31 20:22
 */
@TableName("basics_major")
public class BasicsMajor implements Serializable {
    @TableId(value = "major_code",type = IdType.INPUT)
    private String majorCode;

    @TableField("major_name")
    private String majorName;

    @TableField("major_level")
    private String majorLevel;


    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorLevel() {
        return majorLevel;
    }

    public void setMajorLevel(String majorLevel) {
        this.majorLevel = majorLevel;
    }


    @Override
    public String toString() {
        return "BasicsMajor{" +
                "majorCode='" + majorCode + '\'' +
                ", majorName='" + majorName + '\'' +
                ", majorLevel='" + majorLevel + '\'' +
                '}';
    }
}
