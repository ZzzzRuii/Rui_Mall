package com.zzr.common.exception;

/**
 * 错误码和错误信息定义类
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/7 20:27
 */
public enum BizCodeEnume {
    UNKNOWN_EXCEPTION(10000, "系统未知异常"),
    VALID_EXCEPTION(10001, "参数格式校验失败");

    private int code;
    private String msg;

    BizCodeEnume(int code, String msg) {
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