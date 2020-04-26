package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * education_activities Author ytb 2020/4/2 16:08
 */
@TableName("record_credit")
public class RecordCredit implements Serializable {

    @TableId(value="record_id",type= IdType.AUTO)
    private Integer recordId;

    @TableField("teacher_code")
    private String teacherCode;

    @TableField("notice_code")
    private String noticeCode;

    @TableField("r_credit")
    private Integer rCredit;

    @TableField("record_time")
    private Date recordTime;

    @TableField("record_year")
    private String recordYear;


    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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

    public Integer getrCredit() {
        return rCredit;
    }

    public void setrCredit(Integer rCredit) {
        this.rCredit = rCredit;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getRecordYear() {
        return recordYear;
    }

    public void setRecordYear(String recordYear) {
        this.recordYear = recordYear;
    }

    @Override
    public String toString() {
        return "RecordCredit{" +
                "recordId=" + recordId +
                ", teacherCode='" + teacherCode + '\'' +
                ", noticeCode='" + noticeCode + '\'' +
                ", recordTime=" + recordTime +
                ", recordYear='" + recordYear + '\'' +
                '}';
    }
}
