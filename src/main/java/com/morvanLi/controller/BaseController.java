package com.morvanLi.controller;


import com.morvanLi.common.CommonResult;
import com.morvanLi.common.ErrorCode;
import com.morvanLi.common.Response;
import com.morvanLi.exception.BusinessException;
import com.morvanLi.exception.DescribeAbleException;
import com.morvanLi.exception.RequestParameterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

/**
 * 所有controller的基类
 * <p/>
 */
public class BaseController {

    /**
     * 日志对象 *
     */
    protected Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 得到一个成功的结果对象
     *
     * @param responseData
     * @return
     */
    protected CommonResult getSuccessResult(Response responseData) {
        CommonResult result = new CommonResult();
        result.setSuccess(true);
        result.setData(responseData);
        return result;
    }

    protected CommonResult getSuccessResult() {
        CommonResult result = new CommonResult();
        result.setSuccess(true);
        result.setData(null);
        return result;
    }


    /**
     * 得到一个失败的结果对象
     *
     * @param errCode
     * @param ex
     * @return
     */
    protected CommonResult getFailResult(String errCode, Exception ex) {
        CommonResult result = new CommonResult();
        result.setSuccess(false);
        result.setCode(errCode);
        result.setMsg(ex.getMessage());
        return result;
    }

    /**
     * 得到一个失败的结果对象
     *
     * @param errCode
     * @param msg
     * @return
     */
    protected CommonResult getFailResult(String errCode, String msg) {
        CommonResult result = new CommonResult();
        result.setSuccess(false);
        result.setCode(errCode);
        result.setMsg(msg);
        return result;
    }

    /**
     * 全局异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler
    @ResponseBody
    public CommonResult gobalException(Exception e) {
        CommonResult cr = new CommonResult();
        cr.setSuccess(false);


        if (e instanceof DescribeAbleException) {

            DescribeAbleException ipe = (DescribeAbleException) e;
            String code = ipe.getErrorCode();
            String msg = ipe.getErrorMsg();
            cr.setMsg(msg);
            cr.setCode(code);

            if (e instanceof BusinessException) {
                log.info("业务异常，code:" + code + ",msg:" + msg);
            } else if (e instanceof RequestParameterException) {
                log.info("入参错误，code:" + code + ",msg:" + msg);
            } else {
                log.error("系统异常，code:" + code + ",msg:" + msg, e);
            }
        } else if (e.getCause() != null && e.getCause() instanceof SQLException) {
            log.error("数据库异常", e);
            cr.setMsg("数据库异常");
        } else {
            log.error("未知异常", e);
            cr.setCode(ErrorCode.UnknowException.UNKNOW_EXCEPTION.toString());
            cr.setMsg("系统异常，请联系客服");
        }
        return cr;
    }

}
