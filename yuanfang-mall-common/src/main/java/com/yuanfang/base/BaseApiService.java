package com.yuanfang.base;

import com.yuanfang.constants.Constants;
/**
 * 返回方法
 */
public class BaseApiService {

    //通用
    public ResponseBase setResult(Integer code,String msg,Object data){
        ResponseBase responseBase=new ResponseBase();
        responseBase.setCode(code);
        responseBase.setResult(msg);
        if(data!=null){
            responseBase.setDate(data);
        }
        return responseBase;
    }
    //返回成功,不传递Data
    public ResponseBase setResultSuccess(){
        return setResult(Constants.HTTP_RES_CODE_200,Constants.HTTP_RES_CODE_200_VALUE,null);
    }

    //返回成功,传Data
    public ResponseBase setResultSuccess(Object data){
        return setResult(Constants.HTTP_RES_CODE_200,Constants.HTTP_RES_CODE_200_VALUE,data);
    }

    //返回失败
    public ResponseBase setResultError(String msg){
        return setResult(Constants.HTTP_RES_CODE_200,msg,null);
    }

}
