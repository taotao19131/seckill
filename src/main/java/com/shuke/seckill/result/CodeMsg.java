package com.shuke.seckill.result;

public class CodeMsg {
    private int code;
    private String msg;

    private CodeMsg() {

    }

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //通用错误代码
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
