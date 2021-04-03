package com.website.backend.model;

import javax.persistence.*;

@Entity
public class AboutUsModel {
    @Id
    @GeneratedValue
    private long id;

    @Column(length = 500)
    private String missionPic;

    @Column(length = 1000)
    private String missionComment;

    @Column(length = 500)
    private String missionSpeakerName;

    @Column(length = 1000)
    private String missionSpeak;

    @Column(length = 1000)
    private String missionCommentEn;

    @Column(length = 500)
    private String missionSpeakerNameEn;

    @Column(length = 1000)
    private String missionSpeakEn;

    @Column(length = 500)
    private String visionPic;

    @Column(length = 1000)
    private String visionComment;

    @Column(length = 500)
    private String visionSpeakerName;

    @Column(length = 1000)
    private String visionSpeak;

    @Column(length = 1000)
    private String visionCommentEn;

    @Column(length = 500)
    private String visionSpeakerNameEn;

    @Column(length = 1000)
    private String visionSpeakEn;

    public String getMissionCommentEn() {
        return missionCommentEn;
    }

    public void setMissionCommentEn(String missionCommentEn) {
        this.missionCommentEn = missionCommentEn;
    }

    public String getMissionSpeakerNameEn() {
        return missionSpeakerNameEn;
    }

    public void setMissionSpeakerNameEn(String missionSpeakerNameEn) {
        this.missionSpeakerNameEn = missionSpeakerNameEn;
    }

    public String getMissionSpeakEn() {
        return missionSpeakEn;
    }

    public void setMissionSpeakEn(String missionSpeakEn) {
        this.missionSpeakEn = missionSpeakEn;
    }

    public String getVisionCommentEn() {
        return visionCommentEn;
    }

    public void setVisionCommentEn(String visionCommentEn) {
        this.visionCommentEn = visionCommentEn;
    }

    public String getVisionSpeakerNameEn() {
        return visionSpeakerNameEn;
    }

    public void setVisionSpeakerNameEn(String visionSpeakerNameEn) {
        this.visionSpeakerNameEn = visionSpeakerNameEn;
    }

    public String getVisionSpeakEn() {
        return visionSpeakEn;
    }

    public void setVisionSpeakEn(String visionSpeakEn) {
        this.visionSpeakEn = visionSpeakEn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMissionPic() {
        return missionPic;
    }

    public void setMissionPic(String missionPic) {
        this.missionPic = missionPic;
    }

    public String getMissionComment() {
        return missionComment;
    }

    public void setMissionComment(String missionComment) {
        this.missionComment = missionComment;
    }

    public String getMissionSpeakerName() {
        return missionSpeakerName;
    }

    public void setMissionSpeakerName(String missionSpeakerName) {
        this.missionSpeakerName = missionSpeakerName;
    }

    public String getMissionSpeak() {
        return missionSpeak;
    }

    public void setMissionSpeak(String missionSpeak) {
        this.missionSpeak = missionSpeak;
    }

    public String getVisionPic() {
        return visionPic;
    }

    public void setVisionPic(String visionPic) {
        this.visionPic = visionPic;
    }

    public String getVisionComment() {
        return visionComment;
    }

    public void setVisionComment(String visionComment) {
        this.visionComment = visionComment;
    }

    public String getVisionSpeakerName() {
        return visionSpeakerName;
    }

    public void setVisionSpeakerName(String visionSpeakerName) {
        this.visionSpeakerName = visionSpeakerName;
    }

    public String getVisionSpeak() {
        return visionSpeak;
    }

    public void setVisionSpeak(String visionSpeak) {
        this.visionSpeak = visionSpeak;
    }
}
