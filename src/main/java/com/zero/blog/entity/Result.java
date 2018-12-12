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

    private String explain;

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

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", explain='" + explain + '\'' +
                ", data=" + data +
                '}';
    }
}
