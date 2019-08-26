package com.tradingarea.major.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @version 1.0
 * @author:dmx
 * 用户关系实体
 * @create:2019-08-26 15:02
 */
public class UserRelationship {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String userid;

    @Column
    private String inviteuserid;

    @Column
    private Timestamp createdtime;

    @Column
    private Timestamp updatetime;

    public UserRelationship() {
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

    public String getInviteuserid() {
        return inviteuserid;
    }

    public void setInviteuserid(String inviteuserid) {
        this.inviteuserid = inviteuserid;
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

    @Override
    public String toString() {
        return "UserRelationship{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", inviteuserid='" + inviteuserid + '\'' +
                ", createdtime=" + createdtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
