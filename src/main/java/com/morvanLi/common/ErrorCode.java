package com.morvanLi.common;

/**
 * error 客观错误，wrong主观错误
 */
public final class ErrorCode {

    /**
     * 1，接口入参错误
     */
    public static class RequestParameterError {
        /* 空入参 */
        public static final Integer PARAMETER_NOT_BLANK = 1100;
        /* 未定义的参数 */
        public static final Integer UNEXPECTED_PARAMETER = 1101;
        /* 重复请求 */
        public static final Integer REPEAT_REQUEST = 1102;
    }

    /**
     * 2，业务异常
     */
    public static class BusinessException {
        /**
         * 20，数据配置问题，如卡类型、积分类型、积分规则的配置
         */
        public static class Config {

        }

    }

    /**
     * 3，数据库数据异常，人为修改数据库导致的错误数据
     */
    public static class DatabaseError {


    }

    /**
     * 未知异常，空指针或未知bug导致的
     */
    public static class UnknowException {
        public static final Integer UNKNOW_EXCEPTION = 9999;
    }

}
