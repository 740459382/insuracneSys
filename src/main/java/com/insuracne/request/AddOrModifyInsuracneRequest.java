package com.insuracne.request;

import java.math.BigDecimal;

public class AddOrModifyInsuracneRequest extends Request {

	private static final long serialVersionUID = 830217025301071128L;

	private Long id;				// 主键ID
	private String insNo;			// 保单号
	private Long beneId;			// 受益人ID
	private Integer insType;		// 保险类型
	private BigDecimal beneAmount;	// 受益人需投保金额
	private Integer beneYear;		// 受益人需投保年份（单位：年）
	private Long insStartDate;		// 保险生效日期
	private Integer insYear;		// 保险有效年份（单位：年）
	private String comment;			// 备注
	private Byte deleteFlag;		// 删除标志位：0-未删除；1-已删除

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInsNo() {
		return insNo;
	}

	public void setInsNo(String insNo) {
		this.insNo = insNo;
	}

	public Long getBeneId() {
		return beneId;
	}

	public void setBeneId(Long beneId) {
		this.beneId = beneId;
	}

	public Integer getInsType() {
		return insType;
	}

	public void setInsType(Integer insType) {
		this.insType = insType;
	}

	public BigDecimal getBeneAmount() {
		return beneAmount;
	}

	public void setBeneAmount(BigDecimal beneAmount) {
		this.beneAmount = beneAmount;
	}

	public Integer getBeneYear() {
		return beneYear;
	}

	public void setBeneYear(Integer beneYear) {
		this.beneYear = beneYear;
	}

	public Long getInsStartDate() {
		return insStartDate;
	}

	public void setInsStartDate(Long insStartDate) {
		this.insStartDate = insStartDate;
	}

	public Integer getInsYear() {
		return insYear;
	}

	public void setInsYear(Integer insYear) {
		this.insYear = insYear;
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
