package com.insuracne.request;

public class QueryUserRequest extends Request {

	private static final long serialVersionUID = 6521108723891098388L;

	private Long id;			// 主键ID
	private Byte userType;		// 用户类型：0-用户；1-管理员
	private String loginName;	// 登录账号
	private Long manageId;		// 管理人ID

	public QueryUserRequest() {
		super();
	}

	public QueryUserRequest(String loginName) {
		super();
		this.loginName = loginName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getUserType() {
		return userType;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	public Long getManageId() {
		return manageId;
	}

	public void setManageId(Long manageId) {
		this.manageId = manageId;
	}
	
}
