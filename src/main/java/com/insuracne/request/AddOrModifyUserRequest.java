package com.insuracne.request;

public class AddOrModifyUserRequest extends Request {

	private static final long serialVersionUID = 6149750161295989714L;

	private Long id; 			// 主键ID
	private String userName;	// 用户名
	private Byte userType;		// 用户类型：0-用户；1-管理员
	private String loginName;	// 登陆账号
	private String password;	// 登陆密码
	private Long manageId;		// 管理人ID，即管理人用户的ID
	private Byte deleteFlag;	// 删除标志位：0-未删除；1-已删除

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Byte getUserType() {
		return userType;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

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

	public Long getManageId() {
		return manageId;
	}

	public void setManageId(Long manageId) {
		this.manageId = manageId;
	}

	public Byte getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Byte deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
}
