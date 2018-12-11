package com.zero.blog.enums;

/**
 * @author ZERO
 * @version V1.4
 * @description 统一返回异常类
 * @package com.zero.blog.enums
 * @date 2018 12-11 15:54
 */
public enum ResultEnum {
    UNKOWN_ERROR(-1, "未知异常"),

    // 统一成功返回状态码参数
    SUCCESS(1000000, "成功"),

    // 失败状态码参数
    QUERY_FAILURE(2000000, "查询失败"),
    ADDED_FAILURE(2000001, "新增失败"),
    UPDATE_FAILURE(2000002, "修改失败"),
    DELETE_FAILURE(2000003, "删除失败"),

    NAME_EXIST(2000004, "名称已存在"),

    PERSON_NOT_EXIST(2000005, "用户不存在"),

    PARAMETER_NOT_NULL(2000006, "参数不能为空"),

    SQL_ERROR(2000007, "SQL异常");

    private int code;

    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code查找对应的value
     */
    public String getMsg(int code) {
        for (ResultEnum resultEnum : ResultEnum.values()) {
            if (resultEnum.code == code) {
                return resultEnum.msg;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}