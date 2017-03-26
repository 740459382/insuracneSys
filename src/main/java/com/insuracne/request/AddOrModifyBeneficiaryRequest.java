package com.insuracne.request;

public class AddOrModifyBeneficiaryRequest extends Request {

	private static final long serialVersionUID = -6588377281526279661L;
	
	private Long id;					// 主键ID
	private String beneName;			// 直接受益人姓名
	private String beneContact;			// 直接受益人联系方式：手机号、邮箱等
	private String beneAddress;			// 直接受益人详细住址
	private String secondBeneName;		// 二次受益人
	private String secondBeneContact;	// 受益人联系方式：手机号、邮箱等
	private String secondBeneAddress;	// 受益人详细住址
	private String beneRelation; 		// 二次受益人与直接受益人关系
	private String comment; 			// 备注
	private Byte deleteFlag;			// 是否删除：0-不删除；1-删除

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBeneName() {
		return beneName;
	}

	public void setBeneName(String beneName) {
		this.beneName = beneName;
	}

	public String getBeneContact() {
		return beneContact;
	}

	public void setBeneContact(String beneContact) {
		this.beneContact = beneContact;
	}

	public String getBeneAddress() {
		return beneAddress;
	}

	public void setBeneAddress(String beneAddress) {
		this.beneAddress = beneAddress;
	}

	public String getSecondBeneName() {
		return secondBeneName;
	}

	public void setSecondBeneName(String secondBeneName) {
		this.secondBeneName = secondBeneName;
	}

	public String getSecondBeneContact() {
		return secondBeneContact;
	}

	public void setSecondBeneContact(String secondBeneContact) {
		this.secondBeneContact = secondBeneContact;
	}

	public String getSecondBeneAddress() {
		return secondBeneAddress;
	}

	public void setSecondBeneAddress(String secondBeneAddress) {
		this.secondBeneAddress = secondBeneAddress;
	}

	public String getBeneRelation() {
		return beneRelation;
	}

	public void setBeneRelation(String beneRelation) {
		this.beneRelation = beneRelation;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Byte getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Byte deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
}
