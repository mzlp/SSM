package com.morvanLi.exception;


public class NewBusinessException extends BusinessException {

    public NewBusinessException(Integer code, String msg) {
        super(msg);
        super.code = code + "";
        super.msg = msg;
    }

}
