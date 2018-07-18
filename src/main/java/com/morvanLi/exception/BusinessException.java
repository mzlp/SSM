package com.morvanLi.exception;

/**
 * 业务操作异常基类，用于接口返回。
 * 此种类型的错误信息，可以直接返回
 */
public abstract class BusinessException extends BaseException {

    public BusinessException(String code) {
        super(code);
    }

    public BusinessException(String code, String msg) {
        super(code, msg);
    }
}
