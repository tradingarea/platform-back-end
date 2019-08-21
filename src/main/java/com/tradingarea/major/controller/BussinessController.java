/* CopyRight www.smallyu.net */

package com.tradingarea.major.controller;

import com.tradingarea.major.entity.Bussiness;
import com.tradingarea.major.repository.BussinessRepository;
import com.tradingarea.major.util.ResUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author smallyu
 * @date 2019/8/20 15:58
 */
@RestController
@RequestMapping("/bussiness")
public class BussinessController {

    @Autowired
    BussinessRepository bussinessRepository;

    @RequestMapping("/")
    public Map<String, Object> findAllById() {
        int code = 200;
        String msg = "请求成功";
        Bussiness bussiness = bussinessRepository.findAllById(1);

        return ResUtil.resMap(code, msg, bussiness);
    }
}
