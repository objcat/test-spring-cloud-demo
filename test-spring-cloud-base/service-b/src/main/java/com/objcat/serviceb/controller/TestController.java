package com.objcat.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

/**
 * description: xxxxx <br>
 * date: 2018/12/14 下午5:37 <br>
 * author: objcat <br>
 * version: 1.0 <br>
 */

@RestController
public class TestController {

    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @RequestMapping("/call")
    String call() {
        return "b to a 访问结果 ----- " + serviceAFeignClient.hello();
    }
}
