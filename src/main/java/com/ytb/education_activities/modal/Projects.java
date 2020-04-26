package com.ytb.education_activities.modal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.io.Serializable;
import java.util.Date;

/**
 * educational_activities Author ytb 2020/3/31 12:39
 */
@TableName("projects")
public class Projects implements Serializable {
    @TableId(value="project_code",type =IdType.ASSIGN_UUID)
    private String projectCode;

    @TableField("project_name")
    private String projectName;

    @TableField("level_code")
    private String levelCode;

    @TableField("project_start_date")
    private Date projectStartDate;

    @TableField("project_end_date")
    private Date projectEndDate;

    @TableField("project_explain")
    private String projectExplain;

    @TableField("project_publisher")
    private String projectPublisher;

    @TableField("project_auditor")
    private String projectAuditor;

    @TableField("project_participant")
    private String projectParticipant;

    @TableField("project_expect")
    private String projectExpect;

    @TableField("project_feedback")
    private String projectFeedback;

    @TableField("project_release_date")
    private Date projectReleaseDate;

    @TableField("project_year")
    private String projectYear;


    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getProjectExplain() {
        return projectExplain;
    }

    public void setProjectExplain(String projectExplain) {
        this.projectExplain = projectExplain;
    }

    public String getProjectPublisher() {
        return projectPublisher;
    }

    public void setProjectPublisher(String projectPublisher) {
        this.projectPublisher = projectPublisher;
    }

    public String getProjectAuditor() {
        return projectAuditor;
    }

    public void setProjectAuditor(String projectAuditor) {
        this.projectAuditor = projectAuditor;
    }

    public String getProjectParticipant() {
        return projectParticipant;
    }

    public void setProjectParticipant(String projectParticipant) {
        this.projectParticipant = projectParticipant;
    }

    public String getProjectExpect() {
        return projectExpect;
    }

    public void setProjectExpect(String projectExpect) {
        this.projectExpect = projectExpect;
    }

    public String getProjectFeedback() {
        return projectFeedback;
    }

    public void setProjectFeedback(String projectFeedback) {
        this.projectFeedback = projectFeedback;
    }

    public Date getProjectReleaseDate() {
        return projectReleaseDate;
    }

    public void setProjectReleaseDate(Date projectReleaseDate) {
        this.projectReleaseDate = projectReleaseDate;
    }

    public String getProjectYear() {
        return projectYear;
    }

    public void setProjectYear(String projectYear) {
        this.projectYear = projectYear;
    }


    @Override
    public String toString() {
        return "Projects{" +
                "projectCode='" + projectCode + '\'' +
                ", projectName='" + projectName + '\'' +
                ", levelCode='" + levelCode + '\'' +
                ", projectStartDate=" + projectStartDate +
                ", projectEndDate=" + projectEndDate +
                ", projectExplain='" + projectExplain + '\'' +
                ", projectPublisher='" + projectPublisher + '\'' +
                ", projectAuditor='" + projectAuditor + '\'' +
                ", projectParticipant='" + projectParticipant + '\'' +
                ", projectExpect='" + projectExpect + '\'' +
                ", projectFeedback='" + projectFeedback + '\'' +
                ", projectReleaseDate=" + projectReleaseDate +
                ", projectYear='" + projectYear + '\'' +
                '}';
    }
}
