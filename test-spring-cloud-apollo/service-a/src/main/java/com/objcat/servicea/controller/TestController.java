package com.objcat.servicea.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 服务A <br>
 * date: 2018/12/14 下午5:34 <br>
 * author: objcat <br>
 * version: 1.0 <br>
 */

@RestController
public class TestController {

    @ApolloConfig
    private Config config;

    @RequestMapping("/hello")
    String hello() {
        return config.getProperty("name", "defaultName");
    }
}
