package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * educational_activities Author ytb 2020/3/31 20:31
 */
@TableName("basics_level")
public class BasicsLevel implements Serializable {
    @TableId(value="level_code",type = IdType.AUTO)
    private String levelCode;

    @TableField("level_name")
    private String levelName;


    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }


    @Override
    public String toString() {
        return "BasicsLevel{" +
                "levelCode='" + levelCode + '\'' +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
