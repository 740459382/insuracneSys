package com.insuracne.request;

import java.io.Serializable;

public class Request implements Serializable {

	private static final long serialVersionUID = 7575573860061417823L;

	private Long currentUserId;

	public Long getCurrentUserId() {
		return currentUserId;
	}

	public void setCurrentUserId(Long currentUserId) {
		this.currentUserId = currentUserId;
	}
	
}
