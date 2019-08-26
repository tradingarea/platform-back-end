package com.tradingarea.major.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @version 1.0
 * @author:dmx
 * 聊天群组实体
 * @create:2019-08-26 15:02
 */
public class ChatGroup {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer adminid;

    @Column
    private Integer membernum;

    @Column
    private String avatar;

    @Column
    private String introduction;

    @Column
    private String notice;

    @Column
    private Timestamp createdtime;

    @Column
    private Timestamp updatetime;

    public ChatGroup() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getMembernum() {
        return membernum;
    }

    public void setMembernum(Integer membernum) {
        this.membernum = membernum;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
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
        return "ChatGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adminid=" + adminid +
                ", membernum=" + membernum +
                ", avatar='" + avatar + '\'' +
                ", introduction='" + introduction + '\'' +
                ", notice='" + notice + '\'' +
                ", createdtime=" + createdtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
