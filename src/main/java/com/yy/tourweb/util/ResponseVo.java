package com.yy.tourweb.util;

import java.io.Serializable;

/**
 * ResponseVo
 *
 * @author lufl
 * @date 2016/4/29
 */
public class ResponseVo<T> implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String time = System.currentTimeMillis() + "";
    private int status = 200;
    private String message = "成功";
    private T result;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    /*public void setErrorMsg(ErrorEnumInterface error) {
        this.status = Integer.parseInt(error.getCode());
        this.message = error.getDesc();
    }*/
}
