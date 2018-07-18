package com.morvanLi.exception;

/**
 * 系统异常基类，定义错误码和错误信息
 */
public class BaseException extends RuntimeException implements DescribeAbleException {

    protected String code;
    protected String msg;

    public BaseException() {
    }

    public BaseException(String code) {
        this(code, null);
    }

    public BaseException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = buildErrorMsg(code, msg);
    }

    private String buildErrorMsg(String code, String msg) {
        // TODO
        String value = null;
        if (value == null) {
            value = getDefaultErrorMsg();
        }
        if (msg != null) {
            value = value.replace("{msg}", msg);
        }
        return value;
    }


    @Override
    public String getErrorCode() {
        return code;
    }

    @Override
    public String getErrorMsg() {
        return msg;
    }

    protected String getDefaultErrorMsg() {
        return "未知异常";
    }

}
