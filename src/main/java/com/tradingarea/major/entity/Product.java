package com.tradingarea.major.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @version 1.0
 * @author:dmx
 * 商品实体
 * @create:2019-08-26 15:02
 */
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private Timestamp starttime;

    @Column
    private Timestamp endtime;

    @Column
    private Integer status;

    @Column
    private Timestamp createdtime;

    @Column
    private Timestamp updatetime;

    public Product() {
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

    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", status=" + status +
                ", createdtime=" + createdtime +
                ", updatetime=" + updatetime +
                '}';
    }
}
