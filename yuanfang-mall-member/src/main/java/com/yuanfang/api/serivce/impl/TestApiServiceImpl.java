package com.yuanfang.api.serivce.impl;

import com.yuanfang.api.service.TestApiService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestApiServiceImpl implements TestApiService{
    @Override
    public Map<String, Object> test(String uuid, String name) {
        Map<String,Object> result=new HashMap<>();
        result.put("rtncode",200);
        result.put("rtnmsg","success");
        result.put("data","uuid_"+uuid+"__name_"+name);
        return result;
    }
}
