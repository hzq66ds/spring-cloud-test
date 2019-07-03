package com.controllers.beans;

import java.util.List;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/6/21.
 */
public class ReturnMsg<T> {
    private String code;
    private String message;
    private String othMessage;
    private List<T> list;


    public ReturnMsg(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ReturnMsg(String code, String message,List<T> list) {
        this.code = code;
        this.message = message;
        this.list = list;
    }

    public ReturnMsg(String code, String message, String othMessage) {
        this.code = code;
        this.message = message;
        this.othMessage = othMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOthMessage() {
        return othMessage;
    }

    public void setOthMessage(String othMessage) {
        this.othMessage = othMessage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
