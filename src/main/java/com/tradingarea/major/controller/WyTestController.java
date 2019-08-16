/* CopyRight UMF */
package com.tradingarea.major.controller;

import com.tradingarea.major.entity.WyTest;
import com.tradingarea.major.repository.WyTestRepository;
import com.tradingarea.major.util.ResUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangyu
 * @date 2019/8/16 15:09
 */
@RestController
@RequestMapping("/wytest")
public class WyTestController {

    @Autowired
    WyTestRepository wyTestRepository;

    @RequestMapping("/")
    public Map<String, Object> findAllById() {
        int code = 200;
        String data = "请求成功";
        WyTest wyTest = wyTestRepository.findAllById((long) 1);

        return ResUtil.resMap(code, data, wyTest);
    }

}
