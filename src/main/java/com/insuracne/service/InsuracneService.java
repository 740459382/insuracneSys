package com.insuracne.service;

import com.insuracne.request.AddOrModifyInsuracneRequest;
import com.insuracne.request.QueryInsuracneRequest;
import com.insuracne.response.AddOrModifyInsuracneResponse;
import com.insuracne.response.QueryInsuracneResponse;

public interface InsuracneService {

	/**
	 * 新增/编辑 保单信息
	 */
	AddOrModifyInsuracneResponse addOrModifyInsuracne(AddOrModifyInsuracneRequest request);
	
	/**
	 * 查询保单信息
	 */
	QueryInsuracneResponse queryInsuracne(QueryInsuracneRequest request);
	
}
