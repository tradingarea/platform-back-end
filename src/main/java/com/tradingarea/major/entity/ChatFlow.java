package com.tradingarea.major.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @version 1.0
 * @author:dmx
 * 聊天记录流水实体
 * @create:2019-08-26 15:02
 */
public class ChatFlow {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String groupid;

    @Column
    private String fromuserid;

    @Column
    private Integer type;

    @Column
    private String content;

    @Column
    private String picture;

    @Column
    private String link;

    @Column
    private Timestamp createdtime;

    @Column
    private Timestamp updatetime;

    public ChatFlow() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(String fromuserid) {
        this.fromuserid = fromuserid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
        return "ChatFlow{" +
                "id=" + id +
                ", groupid='" + groupid + '\'' +
                ", fromuserid='" + fromuserid + '\'' +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                ", link='" + link + '\'' +
                ", createdtime=" + createdtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
