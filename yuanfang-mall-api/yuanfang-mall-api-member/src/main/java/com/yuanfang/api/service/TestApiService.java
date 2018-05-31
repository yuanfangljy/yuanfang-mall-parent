package com.yuanfang.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/member")
public interface TestApiService {

    @RequestMapping("/test")
    Map<String,Object> test(String uuid,String name);
}
