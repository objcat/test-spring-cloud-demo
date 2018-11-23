package com.objcat.serviceb.controller;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description: xxxxx <br>
 * date: 2018/11/23 上午9:50 <br>
 * author: objcat <br>
 * version: 1.0 <br>
 */

@FeignClient("SERVICE-OBJCAT-A")
public interface ServiceAFeignClient {
    @RequestMapping("/hello")
    public String hello();
}
