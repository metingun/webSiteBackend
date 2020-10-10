package com.website.backend.model;

import javax.persistence.*;

@Entity
public class CollectionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 500)
    private String pic1;

    @Column(length = 500)
    private String pic2;

    @Column(length = 500)
    private String productName;

    @Column(length = 50)
    private String sex;

    @Column(length = 1000)
    private String comment;

    @Column(length = 1000)
    private String productProperties;

    @Column(length = 50)
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getProductProperties() {
        return productProperties;
    }

    public void setProductProperties(String productProperties) {
        this.productProperties = productProperties;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
