package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * educational_activities Author ytb 2020/3/31 20:17
 */
@TableName("basics_region")
public class BasicsRegion implements Serializable {
    @TableId(value = "region_code",type = IdType.INPUT)
    private String regionCode;

    @TableField("region_name")
    private String regionName;


    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }


    @Override
    public String toString() {
        return "BasicsRegion{" +
                "regionCode='" + regionCode + '\'' +
                ", regionName='" + regionName + '\'' +
                '}';
    }
}
