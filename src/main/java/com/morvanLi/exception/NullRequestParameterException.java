package com.morvanLi.exception;


import com.morvanLi.common.ErrorCode;

/**
 * 接口参数为空
 */
public class NullRequestParameterException extends RequestParameterException {

    private static final String code = ErrorCode.RequestParameterError.PARAMETER_NOT_BLANK.toString();

    public NullRequestParameterException(String msg) {
        super(code, msg);
    }

    @Override
    protected String getDefaultErrorMsg() {
        return "参数{msg}不能为空";
    }
}
