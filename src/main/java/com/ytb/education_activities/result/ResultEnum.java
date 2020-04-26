package com.ytb.education_activities.result;

/**
 * @Author wzq
 * @Description 返回信息枚举类
 * @Date 16:08 2020/1/7
 * @Param
 * @return
 **/
public enum ResultEnum {
    /** 操作成功 **/
    SUCCESS("200", "操作成功"),
    /** 操作失败 **/
    ERROR("500", "操作失败"),

    AUTHOR_ERROR("501", "认证失败")
    ;

    String code;
    String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
