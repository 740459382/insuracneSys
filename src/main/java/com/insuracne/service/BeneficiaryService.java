package com.insuracne.service;

import com.insuracne.request.AddOrModifyBeneficiaryRequest;
import com.insuracne.request.QueryBeneficiaryRequest;
import com.insuracne.response.AddOrModifyBeneficiaryResponse;
import com.insuracne.response.QueryBeneficiaryResponse;

public interface BeneficiaryService {

	/**
	 * 新增/编辑 受益人信息
	 */
	AddOrModifyBeneficiaryResponse addOrModifyBeneficiary(AddOrModifyBeneficiaryRequest request);
	
	/**
	 * 查询受益人信息
	 */
	QueryBeneficiaryResponse queryBeneficiary(QueryBeneficiaryRequest request);
	
}
