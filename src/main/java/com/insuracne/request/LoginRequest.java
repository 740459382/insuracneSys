package com.insuracne.request;

public class LoginRequest extends Request {

	private static final long serialVersionUID = -1857145126951429537L;

	private String loginName; 	// 登录账号
	private String password; 	// 登录密码

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
