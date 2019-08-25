package com.tradingarea.major.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tradingarea.major.entity.Order;
import com.tradingarea.major.repository.OrderRepository;
import com.tradingarea.major.util.ResUtil;

/**
 * @author jie
 * @date 2019/8/16 15:09
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderRepository rderRepository;
	
	 @RequestMapping("/listOrder")
	 @ResponseBody
	    public Map<String, Object> findAllById() {
	        int code = 200;
	        String data = "请求成功";
	        Order order = rderRepository.findByid(1);

	        return ResUtil.resMap(code, data, order);
	    }
}
