package com.yuanfang.api.serivce.impl;

import com.yuanfang.api.service.TestApiService;
import com.yuanfang.base.BaseApiService;
import com.yuanfang.base.ResponseBase;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestApiServiceImpl extends BaseApiService implements TestApiService{
    @Override
    public Map<String, Object> test(String uuid, String name) {
        Map<String,Object> result=new HashMap<>();
        result.put("rtncode",200);
        result.put("rtnmsg","success");
        result.put("data","uuid:"+uuid+",name:"+name);
        return result;
    }

    @Override
    public ResponseBase testResponseBase() {
        return setResultSuccess();
    }
}
