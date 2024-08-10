package com.chen.entity;

public enum ResultCode {

    SUCCESS(1, "成功"),
    FAIL(-1, "失败");

    final int code;
    final String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
