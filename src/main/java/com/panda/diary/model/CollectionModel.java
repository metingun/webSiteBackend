package com.panda.diary.model;

import javax.persistence.*;

@Entity
public class CollectionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 500)
    private String pic1;

    @Column(length = 500)
    private String productName;

    @Column(length = 500)
    private String comment;

    @Column(length = 500)
    private String productProperties;

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
}
