package com.insuracne.common;

public enum DeleteFlagEnum {

	// 不删除
	NO_DELETE((byte)0),
	// 删除
	YES_DELETE((byte)1);
	
	private byte code;
	
	private DeleteFlagEnum(byte code) {
		this.code = code;
	}

	public byte getCode() {
		return code;
	}

	public void setCode(byte code) {
		this.code = code;
	}
	
}
