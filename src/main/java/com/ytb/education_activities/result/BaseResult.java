package com.ytb.education_activities.result;

import java.io.Serializable;
import com.ytb.education_activities.result.ResultEnum;


/**
 * @ClassName BaseResult
 * @Description 基础返回封装类
 * @Author wzq
 * @Date 2020/1/7 15:49
 * @Version 1.0
 */
public class BaseResult implements Serializable {
    private static final long serialVersionUID = 7170396528329141770L;
    /** 返回状态码 **/
    private String code = ResultEnum.SUCCESS.getCode();
    /** 提示信息 **/
    private String msg = ResultEnum.SUCCESS.getMsg();
    /** 是否成功 **/
    private boolean isSuccess = true;

    /**
     * @Author wzq
     * @Description 操作成功
     * @Date 16:11 2020/1/7
     * @Param []
     * @return com.uhoer.healthy.common.result.BaseResult
     **/
    public static BaseResult success() {
        return new BaseResult();
    }

    public static BaseResult success(String msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.msg = msg;
        return baseResult;
    }

    public static BaseResult success(String code, String msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.code = code;
        baseResult.msg = msg;
        return baseResult;
    }

    /**
     * @Author wzq
     * @Description 操作失败
     * @Date 16:10 2020/1/7
     * @Param []
     * @return com.uhoer.healthy.common.result.BaseResult
     **/
    public static BaseResult error() {
        BaseResult baseResult = new BaseResult();
        baseResult.code = ResultEnum.ERROR.getCode();
        baseResult.msg = ResultEnum.ERROR.getMsg();
        baseResult.isSuccess = false;
        return baseResult;
    }

    public static BaseResult error(String msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.code = ResultEnum.ERROR.getCode();
        baseResult.msg = msg;
        baseResult.isSuccess = false;
        return baseResult;
    }

    public static BaseResult error(String code, String msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.code = code;
        baseResult.msg = msg;
        baseResult.isSuccess = false;
        return baseResult;
    }

    public void setSuccess(String msg) {
        this.msg = msg;
    }

    public void setSuccess(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setError(String msg) {
        this.code = ResultEnum.ERROR.getCode();
        this.msg = msg;
        this.isSuccess = false;
    }

    public void setError(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.isSuccess = false;
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

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}