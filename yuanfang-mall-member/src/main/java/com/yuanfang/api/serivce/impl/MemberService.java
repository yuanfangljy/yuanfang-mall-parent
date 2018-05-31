package com.yuanfang.api.serivce.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MemberService {

    public static void main(String[] args) {
        SpringApplication.run(MemberService.class,args);
    }
}
