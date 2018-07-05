package org.ddr.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Draco
 * @since 2018/7/5
 */
public class ResponseData<T> {
    public static final ResponseData<Void> SUCCESS = new ResponseData<>();

    private int code = 200;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseData(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseData(T data) {
        this.data = data;
    }

    public ResponseData() {
    }

    public static <T> ResponseData<T> success(T t) {
        return new ResponseData<>(t);
    }
}