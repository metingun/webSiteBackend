package com.panda.diary.model;

import javax.persistence.*;

@Entity
public class HomePageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 500)
    private String bannerPic1;

    @Column(length = 500)
    private String bannerPic2;

    @Column(length = 500)
    private String bannerPic3;

    @Column
    private String bannerTitle;

    @Column
    private String bannerSubtitle;

    @Column
    private String bannerButtonText;

    @Column
    private String title1;

    @Column(length = 500)
    private String pic1;

    @Column(length = 500)
    private String pic2;

    @Column(length = 500)
    private String pic3;

    @Column
    private String newSeasonTitle;

    @Column(length = 500)
    private String newSeasonPic1;

    @Column(length = 500)
    private String newSeasonPic2;

    @Column(length = 500)
    private String newSeasonPic3;

    @Column(length = 500)
    private String newSeasonPic4;

    @Column(length = 500)
    private String newSeasonPic5;

    @Column(length = 500)
    private String newSeasonPic6;

    @Column(length = 500)
    private String newSeasonPic7;

    @Column(length = 500)
    private String newSeasonPic8;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBannerPic1() {
        return bannerPic1;
    }

    public void setBannerPic1(String bannerPic1) {
        this.bannerPic1 = bannerPic1;
    }

    public String getBannerPic2() {
        return bannerPic2;
    }

    public void setBannerPic2(String bannerPic2) {
        this.bannerPic2 = bannerPic2;
    }

    public String getBannerPic3() {
        return bannerPic3;
    }

    public void setBannerPic3(String bannerPic3) {
        this.bannerPic3 = bannerPic3;
    }

    public String getBannerTitle() {
        return bannerTitle;
    }

    public void setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
    }

    public String getBannerSubtitle() {
        return bannerSubtitle;
    }

    public void setBannerSubtitle(String bannerSubtitle) {
        this.bannerSubtitle = bannerSubtitle;
    }

    public String getBannerButtonText() {
        return bannerButtonText;
    }

    public void setBannerButtonText(String bannerButtonText) {
        this.bannerButtonText = bannerButtonText;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    public String getNewSeasonTitle() {
        return newSeasonTitle;
    }

    public void setNewSeasonTitle(String newSeasonTitle) {
        this.newSeasonTitle = newSeasonTitle;
    }

    public String getNewSeasonPic1() {
        return newSeasonPic1;
    }

    public void setNewSeasonPic1(String newSeasonPic1) {
        this.newSeasonPic1 = newSeasonPic1;
    }

    public String getNewSeasonPic2() {
        return newSeasonPic2;
    }

    public void setNewSeasonPic2(String newSeasonPic2) {
        this.newSeasonPic2 = newSeasonPic2;
    }

    public String getNewSeasonPic3() {
        return newSeasonPic3;
    }

    public void setNewSeasonPic3(String newSeasonPic3) {
        this.newSeasonPic3 = newSeasonPic3;
    }

    public String getNewSeasonPic4() {
        return newSeasonPic4;
    }

    public void setNewSeasonPic4(String newSeasonPic4) {
        this.newSeasonPic4 = newSeasonPic4;
    }

    public String getNewSeasonPic5() {
        return newSeasonPic5;
    }

    public void setNewSeasonPic5(String newSeasonPic5) {
        this.newSeasonPic5 = newSeasonPic5;
    }

    public String getNewSeasonPic6() {
        return newSeasonPic6;
    }

    public void setNewSeasonPic6(String newSeasonPic6) {
        this.newSeasonPic6 = newSeasonPic6;
    }

    public String getNewSeasonPic7() {
        return newSeasonPic7;
    }

    public void setNewSeasonPic7(String newSeasonPic7) {
        this.newSeasonPic7 = newSeasonPic7;
    }

    public String getNewSeasonPic8() {
        return newSeasonPic8;
    }

    public void setNewSeasonPic8(String newSeasonPic8) {
        this.newSeasonPic8 = newSeasonPic8;
    }
}
