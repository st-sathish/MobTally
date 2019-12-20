package com.kathreshtech.mobtally.data.network;

public abstract class BaseResponse {

    private String code = "";
    private String msg = "";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
