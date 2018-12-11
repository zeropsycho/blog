package com.zero.blog.exception;

/**
 * @author ZERO
 * @version V1.4
 * @description 用户异常
 * @package com.zero.blog.exception
 * @date 2018 12-11 15:38
 */
public class UserException extends RuntimeException {

    int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
