package com.insuracne.response;

import java.io.Serializable;

import com.insuracne.common.ResponseCodeEnum;

public class Response<T> implements Serializable {

	private static final long serialVersionUID = 8191987210221083411L;
	
	private boolean success = true;
	private int code;
	private String message;
	private T result;
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		if(code != ResponseCodeEnum.SUCCESS.getCode()){
			this.success = false;
		}
		this.code = code;
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
	
	public void setResponseCode(ResponseCodeEnum error){
		this.code = error.getCode();
		this.message = error.getMessage();
		if(error.getCode() != ResponseCodeEnum.SUCCESS.getCode()){
			this.success = false;
		}
	}
	
}
