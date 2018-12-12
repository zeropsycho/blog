package com.zero.blog.util;

import com.zero.blog.entity.Result;

/**
 * @author ZERO
 * @version V1.4
 * @description 结果返回类
 * @package com.zero.blog.util
 * @date 2018 12-11 15:44
 */
public class ResultUtil {

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("success");
        result.setData(data);
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("success");
        result.setData(null);
        return result;
    }

    public static Result success(int code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static Result success(int code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    public static Result error(int code, String message, String explain) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setExplain(explain);
        return result;
    }
}
