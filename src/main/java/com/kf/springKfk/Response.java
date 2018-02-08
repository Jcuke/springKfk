package com.kf.springKfk;

import java.io.Serializable;

/**
 * Created by wangjw on 2018/2/8 0008.
 */
public class Response implements Serializable{
    private static final long serialVersionUID = -5369225396303988283L;
    public String status;
    public String msg;

    public Response(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
