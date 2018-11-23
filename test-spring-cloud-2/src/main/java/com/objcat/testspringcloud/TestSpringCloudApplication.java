package com.objcat.testspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestSpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringCloudApplication.class, args);
    }
}