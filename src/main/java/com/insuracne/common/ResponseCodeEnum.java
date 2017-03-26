package com.insuracne.common;

public enum ResponseCodeEnum {

	SUCCESS(1000, "成功"),
	
	PARAM_ERROR(1001, "请求参数错误"),
	LOGIN_PASSWORD_ERROR(1002, "登录密码错误"),
	
	USER_EXISTS(1003, "用户已存在"),
	USER_NOT_EXISTS(1004, "用户不存在"),
	
	BENE_EXISTS(1005, "该受益人已存在"),
	BENE_NOT_EXISTS(1006, "该受益人不存在"),
	
	INSU_EXISTS(1007, "该保单已存在"),
	INSU_NOT_EXISTS(1008, "该保单不存在");
	
	private int code;
	private String message;
	
	private ResponseCodeEnum(int code, String message){
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
