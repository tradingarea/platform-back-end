package com.tradingarea.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tradingarea.major.entity.Order;

/**
 * @author jie
 * @date 2019/8/16 14:49
 */
public interface OrderRepository extends JpaRepository<Order, Integer>{
	Order findByid(Integer i);
}
