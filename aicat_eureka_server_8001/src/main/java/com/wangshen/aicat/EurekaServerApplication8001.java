package com.wangshen.aicat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启注册中心服务
public class EurekaServerApplication8001 {
    public static void main(String[] args) {
//        SpringApplication.run(EurekaServerApplication.class, args);
        SpringApplication.run(EurekaServerApplication8001.class);
    }
}
