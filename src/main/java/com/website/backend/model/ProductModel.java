package com.website.backend.model;

import javax.persistence.*;

@Entity
public class ProductModel {
    @Id
    @GeneratedValue
    private long id;

    @Column(length = 500)
    private String pic1;

    @Column(length = 500)
    private String productTitle;

    @Column(length = 1000)
    private String comment;

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

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
