package com.wangshen.aicat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlatServiceApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication9001.class, args);
    }
}
