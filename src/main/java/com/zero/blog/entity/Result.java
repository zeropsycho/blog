package com.zero.blog.entity;

/**
 * @author ZERO
 * @version V1.4
 * @description
 * @package com.zero.blog.entity
 * @date 2018 12-11 15:45
 */
public class Result {

    private int code;

    private String message;

    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
