package com.itheilv.mybatisplus.base;

import com.itheilv.mybatisplus.conatant.ResultConstant;

import java.io.Serializable;

/**
 * @author WSQ
 * @since 2020-09-27
 */
public class BaseResult implements Serializable {
    /**
     * 业务错误
     */
    public static final int FAILED = 0;

    /**
     * 成功
     */
    public static final int SUCCESS = 1;

    /**
     * 验证报错返回2
     */
    public static final int VALIDATOR = 2;

    /**
     * 状态码：1成功，其他为失败
     */
    private int code;

    /**
     * 成功为success，其他为失败原因
     */
    private String message;

    /**
     * 数据结果集
     */
    private Object data;

    public BaseResult() {
    }

    public BaseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * @param message 错误提示信息
     * @return BaseResult
     */
    public static BaseResult failResultCreate(String message) {
        return new BaseResult(FAILED, message);
    }

    /**
     * 返回成功信息：
     *
     * @param data Get：传入的是查询业务数据
     * @return BaseResult
     */
    public static BaseResult successResultCreate(Object data) {
        return new BaseResult(SUCCESS, ResultConstant.SUCCESS.getMessage(), data);
    }

    /**
     * 返回成功信息
     *
     * @param message 自定义前台显示成功信息
     * @param data    业务数据
     * @return BaseResult
     */
    public static BaseResult successResultCreate(String message, Object data) {
        return new BaseResult(SUCCESS, message, data);
    }
}
