package com.insuracne.common;

public enum UserTypeEnum {

	// 用户
	USER((byte)0),
	// 管理员
	ADMIN((byte)1);
	
	private byte code;
	
	private UserTypeEnum(byte code) {
		this.code = code;
	}

	public byte getCode() {
		return code;
	}

	public void setCode(byte code) {
		this.code = code;
	}
	
}
