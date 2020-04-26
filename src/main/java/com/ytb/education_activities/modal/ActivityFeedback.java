package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * educational_activities Author ytb 2020/3/31 20:53
 */
@TableName("activity_feedback")
public class ActivityFeedback implements Serializable {
    @TableId(value="feedback_id",type = IdType.AUTO)
    private Integer feedbackId;

    @TableField("feedback_content")
    private String feedbackContent;

    @TableField("notice_code")
    private String noticeCode;

    @TableField("teacher_code")
    private String teacherCode;

    @TableField("feedback_time")
    private Date feedbackTime;


    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }


    @Override
    public String toString() {
        return "ActivityFeedback{" +
                "feedbackId=" + feedbackId +
                ", feedbackContent='" + feedbackContent + '\'' +
                ", noticeCode='" + noticeCode + '\'' +
                ", teacherCode='" + teacherCode + '\'' +
                ", feedbackTime=" + feedbackTime +
                '}';
    }
}
