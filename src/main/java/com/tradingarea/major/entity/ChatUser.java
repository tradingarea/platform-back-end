package com.tradingarea.major.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @version 1.0
 * @author:dmx
 * 聊天群组和用户关系实体
 * @create:2019-08-26 15:02
 */
public class ChatUser {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String userid;

    @Column
    private String groupid;

    @Column
    private String lastchatid;

    @Column
    private Integer userstatus;

    @Column
    private Timestamp createdtime;

    @Column
    private Timestamp updatetime;

    public ChatUser() {
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

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getLastchatid() {
        return lastchatid;
    }

    public void setLastchatid(String lastchatid) {
        this.lastchatid = lastchatid;
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
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
        return "ChatUser{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", groupid='" + groupid + '\'' +
                ", lastchatid='" + lastchatid + '\'' +
                ", userstatus=" + userstatus +
                ", createdtime=" + createdtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
