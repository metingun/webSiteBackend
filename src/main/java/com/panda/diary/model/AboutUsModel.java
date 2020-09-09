package com.panda.diary.model;

import javax.persistence.*;

@Entity
public class AboutUsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 500)
    private String missionPic;

    @Column(length = 500)
    private String missionComment;

    @Column(length = 500)
    private String missionSpeakerName;

    @Column(length = 500)
    private String missionSpeak;

    @Column(length = 500)
    private String visionPic;

    @Column(length = 500)
    private String visionComment;

    @Column(length = 500)
    private String visionSpeakerName;

    @Column(length = 500)
    private String visionSpeak;

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
