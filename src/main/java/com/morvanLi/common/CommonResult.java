package com.morvanLi.common;


/**
 *
 * @param <T>
 */
public class CommonResult<T extends Response> {

    /**
     * 本次请求结果 *
     */
    private boolean success;

    /**
     * 错误代码 *
     */
    private String code;

    /**
     * 错误信息 *
     */
    private String msg;

    /**
     * 相应数据 *
     */
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Jackson.asString(this);
    }
}
