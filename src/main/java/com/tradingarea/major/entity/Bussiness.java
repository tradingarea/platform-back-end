package com.tradingarea.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @version 1.0
 * @author:dmx
 * @create:2019-08-21 14:54
 */
@Entity
public class Bussiness {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String userid;

    @Column
    private String name;

    @Column
    private String introduction;

    @Column
    private String detail;

    @Column
    private String address;

    @Column
    private String logo;

    @Column
    private String picture;

    @Column
    private Integer status;

    @Column
    private Integer level;

    @Column
    private Timestamp createdtime;

    @Column
    private Timestamp updatetime;

    public Bussiness() {}

    public Bussiness(String userid, String name, String introduction, String detail, String address, String logo, String picture, Integer status, Integer level, Timestamp createdtime, Timestamp updatetime) {
        this.userid = userid;
        this.name = name;
        this.introduction = introduction;
        this.detail = detail;
        this.address = address;
        this.logo = logo;
        this.picture = picture;
        this.status = status;
        this.level = level;
        this.createdtime = createdtime;
        this.updatetime = updatetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Timestamp getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Timestamp createdtime) {
        this.createdtime = createdtime;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }
}
