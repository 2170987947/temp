package online.yang.cloud.model;

import java.util.Date;

public class Complain {
    private String complainId;

    private String complainTitle;

    private String complainContent;

    private Date complainDate;

    private String complainAdminer;

    private String complainNo;

    private String complainStatus;

    private String complainComment;

    public String getComplainId() {
        return complainId;
    }

    public void setComplainId(String complainId) {
        this.complainId = complainId;
    }

    public String getComplainTitle() {
        return complainTitle;
    }

    public void setComplainTitle(String complainTitle) {
        this.complainTitle = complainTitle;
    }

    public String getComplainContent() {
        return complainContent;
    }

    public void setComplainContent(String complainContent) {
        this.complainContent = complainContent;
    }

    public Date getComplainDate() {
        return complainDate;
    }

    public void setComplainDate(Date complainDate) {
        this.complainDate = complainDate;
    }

    public String getComplainAdminer() {
        return complainAdminer;
    }

    public void setComplainAdminer(String complainAdminer) {
        this.complainAdminer = complainAdminer;
    }

    public String getComplainNo() {
        return complainNo;
    }

    public void setComplainNo(String complainNo) {
        this.complainNo = complainNo;
    }

    public String getComplainStatus() {
        return complainStatus;
    }

    public void setComplainStatus(String complainStatus) {
        this.complainStatus = complainStatus;
    }

    public String getComplainComment() {
        return complainComment;
    }

    public void setComplainComment(String complainComment) {
        this.complainComment = complainComment;
    }
}