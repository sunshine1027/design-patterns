package com.sunshine1027.factorymethod;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class AToy implements IToy{
    private String msg;

    public AToy(String msg) {
        this.msg = "A" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public String showInfo() {
        return msg;
    }
}
