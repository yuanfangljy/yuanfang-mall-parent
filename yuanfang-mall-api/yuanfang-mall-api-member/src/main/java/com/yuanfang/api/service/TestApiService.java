package com.yuanfang.api.service;

import com.yuanfang.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/member")
public interface TestApiService {

    @RequestMapping("/test")
    public Map<String,Object> test(String uuid,String name);

    @RequestMapping("/testResponseBase")
    public ResponseBase testResponseBase();
}
