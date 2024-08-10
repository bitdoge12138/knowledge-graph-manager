package com.chen.entity;

import lombok.Data;

@Data
public class Result<T> {

    T data;

    String msg;

    int status;

    public Result() {

    }

    public Result(T obj) {
        data = obj;
    }

    public Result(T obj, int status, String msg) {
        this.data = obj;
        this.status = status;
        this.msg = msg;
    }

    public static <T> Result<T> packSuccess(T data) {
        return pack(data, ResultCode.SUCCESS);
    }

    public static <T> Result<T> packSuccess(T data, String msg) {
        return pack(data, ResultCode.SUCCESS, msg);
    }

    public static <T> Result<T> packFailure(T data) {
        return pack(data, ResultCode.FAIL);
    }

    public static <T> Result<T> packFailure(T data, String msg) {
        return pack(data, ResultCode.FAIL, msg);
    }

    public static <T> Result<T> pack(T data, ResultCode resultCode) {
        return pack(data, resultCode.code, resultCode.msg);
    }

    public static <T> Result<T> pack(T data, ResultCode resultCode, String msg) {
        return pack(data, resultCode.code, msg);
    }

    public static <T> Result<T> pack(T data, int status, String msg) {
        return new Result<T>(data, status, msg);
    }

}
