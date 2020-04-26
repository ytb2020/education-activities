package com.ytb.education_activities.result;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName ValidateUtil
 * @Description 属性参数校验
 * @Author wzq
 * @Date 2020/1/8 18:13
 * @Version 1.0
 */
public class ValidateUtil {

    /**
     * @Author wzq
     * @Description 获取错误信息
     * @Date 18:14 2020/1/8
     * @Param [obj, groups]
     * @return java.lang.String
     **/
    public static <T> String getErrorMessage(T obj, Class<?>... groups) {
        if (obj == null) {
            return "参数不能为空";
        }
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<T>> validations = validator.validate(obj, groups);
        Iterator<ConstraintViolation<T>> iterator = validations.iterator();
        if (iterator.hasNext()) {
            String errMessage = iterator.next().getMessage();
            return errMessage;
        }
        return null;
    }
}