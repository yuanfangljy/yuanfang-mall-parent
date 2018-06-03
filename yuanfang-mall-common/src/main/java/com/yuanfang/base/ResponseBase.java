package com.yuanfang.base;

import lombok.Data;

@Data
public class ResponseBase {
    //响应code
    private Integer code;
    //消息内容
    private String result;
    //返回date
    private Object date;


}
