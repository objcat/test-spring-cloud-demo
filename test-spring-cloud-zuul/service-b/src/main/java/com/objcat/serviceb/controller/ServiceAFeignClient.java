package com.objcat.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description: xxxxx <br>
 * date: 2018/12/14 下午5:38 <br>
 * author: objcat <br>
 * version: 1.0 <br>
 */

@FeignClient("SERVICE-OBJCAT-A")
public interface ServiceAFeignClient {
    @RequestMapping("/hello")
    String hello();
}
