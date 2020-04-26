package com.ytb.education_activities.result;

/**
 * @ClassName ObjectResult
 * @Description 自定义封装类
 * @Author wzq
 * @Date 2020/1/7 16:14
 * @Version 1.0
 */
public class ObjectResult<T> extends BaseResult{
    private static final long serialVersionUID = 5248635273033428927L;

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}