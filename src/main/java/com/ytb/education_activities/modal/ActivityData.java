package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * educational_activities Author ytb 2020/3/31 20:58
 */
@TableName("activity_data")
public class ActivityData implements Serializable {
    @TableId(value="data_id",type = IdType.AUTO)
    private Integer dataId;

    @TableField("data_document_url")
    private String dataDocumentUrl;

    @TableField("data_time")
    private Date dataTime;

    @TableField("teacher_code")
    private String teacherCode;

    @TableField("notice_code")
    private String noticeCode;


    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getDataDocumentUrl() {
        return dataDocumentUrl;
    }

    public void setDataDocumentUrl(String dataDocumentUrl) {
        this.dataDocumentUrl = dataDocumentUrl;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
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
        return "ActivityData{" +
                "dataId=" + dataId +
                ", dataDocumentUrl='" + dataDocumentUrl + '\'' +
                ", dataTime=" + dataTime +
                ", teacherCode='" + teacherCode + '\'' +
                ", noticeCode='" + noticeCode + '\'' +
                '}';
    }
}
