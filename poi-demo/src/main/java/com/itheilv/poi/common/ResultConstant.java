package com.itheilv.poi.common;

/**
 * @author WSQ
 * @since 2020-07-30
 */
public enum ResultConstant {

    FAILED("0", "操作失败！请刷新重试"),
    SUCCESS("1", "操作成功！");

    private final String code;
    private final String message;

    ResultConstant(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
