package com.tradingarea.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @version 1.0
 * @author:dmx
 * 用户实体
 * @create:2019-08-26 15:02
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private Integer phonenum;

    @Column
    private String sex;

    @Column
    private String avatar;

    @Column
    private String mail;

    @Column
    private String wxid;

    @Column
    private Integer type;

    @Column
    private Integer status;

    @Column
    private Integer ismember;

    @Column
    private Integer invitenum;

    @Column
    private Timestamp createdtime;

    @Column
    private Timestamp updatetime;

    public User() {
    }

    public User(String password, String name, Integer phonenum, String sex, String avatar, String mail, String wxid, Integer type, Integer status, Integer ismember, Integer invitenum, Timestamp createdtime, Timestamp updatetime) {
        this.password = password;
        this.name = name;
        this.phonenum = phonenum;
        this.sex = sex;
        this.avatar = avatar;
        this.mail = mail;
        this.wxid = wxid;
        this.type = type;
        this.status = status;
        this.ismember = ismember;
        this.invitenum = invitenum;
        this.createdtime = createdtime;
        this.updatetime = updatetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Integer phonenum) {
        this.phonenum = phonenum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsmember() {
        return ismember;
    }

    public void setIsmember(Integer ismember) {
        this.ismember = ismember;
    }

    public Integer getInvitenum() {
        return invitenum;
    }

    public void setInvitenum(Integer invitenum) {
        this.invitenum = invitenum;
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
