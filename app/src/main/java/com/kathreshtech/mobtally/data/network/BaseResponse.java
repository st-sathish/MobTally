package com.kathreshtech.mobtally.data.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class BaseResponse {

    @Expose
    @SerializedName("code")
    private String code = "";

    @Expose
    @SerializedName("message")
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
