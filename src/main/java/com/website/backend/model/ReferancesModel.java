package com.website.backend.model;

import javax.persistence.*;

@Entity
public class ReferancesModel {
    @Id
    @GeneratedValue
    private long id;

    @Column(length = 500)
    private String pic1;

    @Column(length = 500)
    private String companyName;

    @Column(length = 1000)
    private String comment;

    @Column(length = 1000)
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
