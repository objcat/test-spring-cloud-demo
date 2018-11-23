package com.objcat.serviceb.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: service-b接口 <br>
 * date: 2018/11/23 上午9:49 <br>
 * author: objcat <br>
 * version: 1.0 <br>
 */

@RestController
public class TestController {

    @Autowired
    private ServiceAFeignClient client;

    @RequestMapping("/call")
    public String call() {
        return "b to a 访问结果 ----- " + client.hello();
    }
}
