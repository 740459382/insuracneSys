package com.insuracne.request;

public class ResetPwdRequest extends Request {

	private static final long serialVersionUID = 8407732710744680782L;

	private String loginName;	// 登录账号
	private String oldPwd;		// 旧密码
	private String newPwd;		// 新密码

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	
}
