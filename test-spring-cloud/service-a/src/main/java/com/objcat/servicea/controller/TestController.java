package com.objcat.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: service-a接口 <br>
 * date: 2018/11/23 上午9:43 <br>
 * author: objcat <br>
 * version: 1.0 <br>
 */

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello world";
    }
}
