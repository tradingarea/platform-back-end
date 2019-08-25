package com.tradingarea.major.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jie
 * @date 2019/8/16 14:45
 */
@Entity
@Table(name = "order")
public class Order {
	  
	    @Id
	    @GeneratedValue
	    private Integer id;

	    @Column
	    private String userid;

	    @Column
	    private String productid;

	    @Column
	    private Integer status;

	    @Column
	    private Timestamp createdtime;

		@Column
	    public Timestamp getCreatedtime() {
			return createdtime;
		}

		@Column
		public void setCreatedtime(Timestamp createdtime) {
			this.createdtime = createdtime;
		}

		@Column
	    private Timestamp updatetime;

	    public Order() {
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
		public String getProductid() {
			return productid;
		}
		public void setProductid(String productid) {
			this.productid = productid;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		
		@Override
	    public String toString() {
	        return "Order{" +
	                "id=" + id +
	                ", userid='" + userid + '\'' +
	                ", productid='" +productid + '\'' +
	                ", status='" +status + '\'' +
	                 ", createdtime=" + createdtime +
                    ", updatetime=" + updatetime +
                   '}';
	    }
	    
}
