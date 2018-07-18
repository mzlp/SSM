package com.morvanLi.exception;

/**
 * 用于向前端展示，美化后的错误信息
 */
public interface DescribeAbleException {

    String getErrorCode();

    String getErrorMsg();

}
