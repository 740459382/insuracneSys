package com.insuracne.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuracne.common.DeleteFlagEnum;
import com.insuracne.common.ResponseCodeEnum;
import com.insuracne.dao.BeneficiaryMapper;
import com.insuracne.entity.Beneficiary;
import com.insuracne.request.AddOrModifyBeneficiaryRequest;
import com.insuracne.request.QueryBeneficiaryRequest;
import com.insuracne.response.AddOrModifyBeneficiaryResponse;
import com.insuracne.response.QueryBeneficiaryResponse;
import com.insuracne.service.BeneficiaryService;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

	@Autowired
	private BeneficiaryMapper beneficiaryMapper;
	
	/**
	 * 新增/编辑 受益人信息
	 */
	@Override
	public AddOrModifyBeneficiaryResponse addOrModifyBeneficiary(AddOrModifyBeneficiaryRequest request) {
		AddOrModifyBeneficiaryResponse response = new AddOrModifyBeneficiaryResponse();

		if(request.getId() == null){
			// 新增
			Beneficiary bene = new Beneficiary();
			bene.setBeneName(request.getBeneName());
			bene.setBeneContact(request.getBeneContact());
			bene.setBeneAddress(request.getBeneAddress());
			bene.setSecondBeneName(request.getSecondBeneName());
			bene.setSecondBeneContact(request.getSecondBeneContact());
			bene.setSecondBeneAddress(request.getSecondBeneAddress());
			bene.setBeneRelation(request.getBeneRelation());
			bene.setComment(request.getComment());
			bene.setDeleteFlag(DeleteFlagEnum.NO_DELETE.getCode());
			bene.setCreateBy(request.getCurrentUserId());
			bene.setCreateTime(new Date());
			beneficiaryMapper.insertSelective(bene);
		} else {
			// 编辑
			Beneficiary bene = beneficiaryMapper.selectByPrimaryKey(request.getId());
			if(bene == null){
				response.setResponseCode(ResponseCodeEnum.BENE_NOT_EXISTS);
				return response;
			}
			bene.setBeneName(request.getBeneName());
			bene.setBeneContact(request.getBeneContact());
			bene.setBeneAddress(request.getBeneAddress());
			bene.setSecondBeneName(request.getSecondBeneName());
			bene.setSecondBeneContact(request.getSecondBeneContact());
			bene.setSecondBeneAddress(request.getSecondBeneAddress());
			bene.setBeneRelation(request.getBeneRelation());
			bene.setComment(request.getComment());
			bene.setDeleteFlag(request.getDeleteFlag());
			bene.setCreateBy(request.getCurrentUserId());
			bene.setCreateTime(new Date());
			beneficiaryMapper.updateByPrimaryKeySelective(bene);
		}
		return response;
	}

	/**
	 * 查询受益人信息
	 */
	@Override
	public QueryBeneficiaryResponse queryBeneficiary(QueryBeneficiaryRequest request) {
		
		return null;
	}

}
