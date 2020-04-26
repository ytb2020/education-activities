package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * educational_activities Author ytb 2020/3/31 13:08
 */
@TableName("notices")
public class Notice implements Serializable {
    @TableId(value="notice_code",type = IdType.ASSIGN_UUID)
    private String noticeCode;

    @TableField("notice_release_date")
    private Date noticeReleaseDate;

    @TableField("notice_content")
    private String noticeContent;

    @TableField("notice_credit")
    private Integer noticeCredit;

    @TableField("notice_publisher")
    private String noticePublisher;

    @TableField("notice_auditor")
    private String noticeAuditor;

    @TableField("notice_title")
    private String noticeTitle;

    @TableField("notice_start_date")
    private Date noticeStartDate;

    @TableField("notice_end_date")
    private Date noticeEndDate;

    @TableField("project_code")
    private String projectCode;

    @TableField("notice_type")
    private Integer noticeType;

    @TableField("notice_ubtitle")
    private String noticeUbtitle;

    @TableField("notice_year")
    private String noticeYear;

    @TableField("notice_sign_in")
    private Boolean noticeSignIn;

    @TableField("notice_sign_up")
    private Boolean noticeSignUp;

    @TableField("notice_visa")
    private Boolean noticeVisa;

    @TableField("notice_feedback")
    private Boolean noticeFeedback;

    @TableField("notice_state")
    private Integer noticeState;

    @TableField("level_code")
    private String levelCode;


    public String getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    public Date getNoticeReleaseDate() {
        return noticeReleaseDate;
    }

    public void setNoticeReleaseDate(Date noticeReleaseDate) {
        this.noticeReleaseDate = noticeReleaseDate;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Integer getNoticeCredit() {
        return noticeCredit;
    }

    public void setNoticeCredit(Integer noticeCredit) {
        this.noticeCredit = noticeCredit;
    }

    public String getNoticePublisher() {
        return noticePublisher;
    }

    public void setNoticePublisher(String noticePublisher) {
        this.noticePublisher = noticePublisher;
    }

    public String getNoticeAuditor() {
        return noticeAuditor;
    }

    public void setNoticeAuditor(String noticeAuditor) {
        this.noticeAuditor = noticeAuditor;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public Date getNoticeStartDate() {
        return noticeStartDate;
    }

    public void setNoticeStartDate(Date noticeStartDate) {
        this.noticeStartDate = noticeStartDate;
    }

    public Date getNoticeEndDate() {
        return noticeEndDate;
    }

    public void setNoticeEndDate(Date noticeEndDate) {
        this.noticeEndDate = noticeEndDate;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    public String getNoticeUbtitle() {
        return noticeUbtitle;
    }

    public void setNoticeUbtitle(String noticeUbtitle) {
        this.noticeUbtitle = noticeUbtitle;
    }

    public String getNoticeYear() {
        return noticeYear;
    }

    public void setNoticeYear(String noticeYear) {
        this.noticeYear = noticeYear;
    }

    public Boolean getNoticeSignIn() {
        return noticeSignIn;
    }

    public void setNoticeSignIn(Boolean noticeSignIn) {
        this.noticeSignIn = noticeSignIn;
    }

    public Boolean getNoticeSignUp() {
        return noticeSignUp;
    }

    public void setNoticeSignUp(Boolean noticeSignUp) {
        this.noticeSignUp = noticeSignUp;
    }

    public Boolean getNoticeVisa() {
        return noticeVisa;
    }

    public void setNoticeVisa(Boolean noticeVisa) {
        this.noticeVisa = noticeVisa;
    }

    public Boolean getNoticeFeedback() {
        return noticeFeedback;
    }

    public void setNoticeFeedback(Boolean noticeFeedback) {
        this.noticeFeedback = noticeFeedback;
    }

    public Integer getNoticeState() {
        return noticeState;
    }

    public void setNoticeState(Integer noticeState) {
        this.noticeState = noticeState;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }


    @Override
    public String toString() {
        return "Notice{" +
                "noticeCode='" + noticeCode + '\'' +
                ", noticeReleaseDate=" + noticeReleaseDate +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeCredit=" + noticeCredit +
                ", noticePublisher='" + noticePublisher + '\'' +
                ", noticeAuditor='" + noticeAuditor + '\'' +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeStartDate=" + noticeStartDate +
                ", noticeEndDate=" + noticeEndDate +
                ", projectCode='" + projectCode + '\'' +
                ", noticeType=" + noticeType +
                ", noticeUbtitle='" + noticeUbtitle + '\'' +
                ", noticeYear='" + noticeYear + '\'' +
                ", noticeSignIn=" + noticeSignIn +
                ", noticeSignUp=" + noticeSignUp +
                ", noticeVisa=" + noticeVisa +
                ", noticeFeedback=" + noticeFeedback +
                ", noticeState=" + noticeState +
                ", levelCode='" + levelCode + '\'' +
                '}';
    }
}
