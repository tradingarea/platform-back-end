/* CopyRight www.smallyu.net */

package com.tradingarea.major.controller;

import com.tradingarea.major.entity.Bussiness;
import com.tradingarea.major.entity.User;
import com.tradingarea.major.repository.UserRepository;
import com.tradingarea.major.util.ResUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author smallyu
 * @date 2019/8/20 15:58
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

    /*
     * 根据ID查询
     */
    @RequestMapping("/findById")
    public Map<String, Object> findById(int id) {
        int code = 200;
        String msg = "请求成功";
        User res = userRepository.findAllById(id);
        return ResUtil.resMap(code, msg, res);
    }

}
