package com.jike.demo.vo;


import java.io.Serializable;

/**
 * Created by zhenhui on 2016/9/22.
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -1686054524991742104L;
    public static final Integer SUCCESS = 200;
    public static final Integer ERROR = 500;

    protected Integer code = 200;
    protected String msg = "success";
    protected T data;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> Result<T> error(String msg) {
        return new Result(ERROR, msg);
    }

    public static <T> Result<T> error(String msg, T data) {
        Result<T> result = new Result(ERROR, msg);
        if (null != result) {
            result.setData(data);
        }

        return result;
    }

    public static <T> Result<T> error(Integer code, String msg, T data) {
        Result<T> result = new Result(code, msg);
        if (null != result) {
            result.setData(data);
        }

        return result;
    }

    public static <T> Result<T> success() {
        return success(null, null);
    }

    public static <T> Result<T> success(String msg) {
        return success(msg, null);
    }

    public static <T> Result<T> success(T data) {
        return success((String)null, data);
    }

    public static <T> Result<T> success(String msg, T data) {
        Result<T> result = new Result();
        if (msg!=null) {
            result.setMsg(msg);
            result.setCode(200);
        }

        if (null != result) {
            result.setData(data);
        }

        return result;
    }

    public boolean isSuccess() {
        return this.code == 200;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public String toString() {
        return "Result(code=" + this.getCode() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }
}
