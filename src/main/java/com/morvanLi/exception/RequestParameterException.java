package com.morvanLi.exception;

/**
 * 接口入参异常，包括非空、范围、大小等
 *
 */
public class RequestParameterException extends BaseException {

    public RequestParameterException() {
    }

    public RequestParameterException(String code) {
        super(code);
    }

    public RequestParameterException(String code, String msg) {
        super(code, msg);
    }

    @Override
    protected String getDefaultErrorMsg() {
        return "非法参数{msg}";
    }
}
