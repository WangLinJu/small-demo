package com.itheilv.poi.common;


import java.io.Serializable;

/**
 * @author WSQ
 * @since 2020/7/20
 * 统一返回结果集
 */
public class BaseResult implements Serializable {

    private static final Integer FAILED = 0;
    private static final Integer SUCCESS = 1;

    /**
     * 状态码为1：其他为失败
     */
    private Integer code;
    /**
     * 成功为SUCCESS,其他为失败原因
     */
    private String message;
    /**
     * 数据结果集
     */
    private Object data;


    public BaseResult() {
    }

    public BaseResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static BaseResult successResult(Object data) {
        return new BaseResult(SUCCESS, ResultConstant.SUCCESS.getMessage(), data);
    }

    public static BaseResult successResult(String message, Object data) {
        return new BaseResult(SUCCESS, message, data);
    }

    public static BaseResult failResult(String message) {
        return new BaseResult(FAILED, message, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
