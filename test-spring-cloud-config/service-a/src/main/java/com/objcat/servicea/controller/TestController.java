package com.objcat.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: xxxxx <br>
 * date: 2018/12/14 下午5:34 <br>
 * author: objcat <br>
 * version: 1.0 <br>
 */

@RestController
@RefreshScope
public class TestController {

//    @Value("${name}")
//    private String name;

    @RequestMapping("/hello")
    String hello() {
        return "hello world";
    }
}
