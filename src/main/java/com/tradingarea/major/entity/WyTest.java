/* CopyRight UMF */
package com.tradingarea.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author wangyu
 * @date 2019/8/16 14:45
 */
@Entity
public class WyTest {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String a;

    @Column
    private String b;

    public WyTest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "WyTest{" +
                "id=" + id +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}


/* 表结构

CREATE TABLE `wy_test` (
	`id` BIGINT(20) NOT NULL,
	`a` VARCHAR(256) NULL DEFAULT NULL,
	`b` VARCHAR(256) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_bin'
ENGINE=InnoDB
;
*/
