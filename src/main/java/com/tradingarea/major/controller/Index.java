/* CopyRight www.smallyu.net */

package com.tradingarea.major.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author smallyu
 * @date 2019/8/13 23:15
 */
@RestController
public class Index {

    @RequestMapping("/")
    public String index() {
        return "This is index, please stop your illegal actions.";
    }
}
