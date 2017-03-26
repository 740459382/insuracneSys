package com.insuracne.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuracne.common.DeleteFlagEnum;
import com.insuracne.common.ResponseCodeEnum;
import com.insuracne.dao.InsuracneOrderMapper;
import com.insuracne.entity.InsuracneOrder;
import com.insuracne.request.AddOrModifyInsuracneRequest;
import com.insuracne.request.QueryInsuracneRequest;
import com.insuracne.response.AddOrModifyInsuracneResponse;
import com.insuracne.response.QueryInsuracneResponse;
import com.insuracne.service.InsuracneService;

@Service
public class InsuracneServiceImpl implements InsuracneService {

	@Autowired
	private InsuracneOrderMapper insuracneOrderMapper;
	
	/**
	 * 新增/编辑 保单信息
	 */
	@Override
	public AddOrModifyInsuracneResponse addOrModifyInsuracne(AddOrModifyInsuracneRequest request) {
		AddOrModifyInsuracneResponse response = new AddOrModifyInsuracneResponse();
		
		if(request.getId() == null){
			// 新增
			InsuracneOrder order = new InsuracneOrder();
			order.setInsNo(request.getInsNo());
			order.setBeneId(request.getBeneId());
			order.setInsType(request.getInsType());
			order.setBeneAmount(request.getBeneAmount());
			order.setBeneYear(request.getBeneYear());
			order.setInsStartDate(request.getInsStartDate() == null ? null : new Date(request.getInsStartDate()));
			order.setInsYear(request.getInsYear());
			order.setComment(request.getComment());
			order.setDeleteFlag(DeleteFlagEnum.NO_DELETE.getCode());
			order.setCreateBy(request.getCurrentUserId());
			order.setCreateTime(new Date());
			insuracneOrderMapper.insertSelective(order);
		} else {
			// 编辑
			InsuracneOrder order = insuracneOrderMapper.selectByPrimaryKey(request.getId());
			if(order == null){
				response.setResponseCode(ResponseCodeEnum.PARAM_ERROR);
				return response;
			}
			order.setInsNo(request.getInsNo());
			order.setBeneId(request.getBeneId());
			order.setInsType(request.getInsType());
			order.setBeneAmount(request.getBeneAmount());
			order.setBeneYear(request.getBeneYear());
			order.setInsStartDate(request.getInsStartDate() == null ? null : new Date(request.getInsStartDate()));
			order.setInsYear(request.getInsYear());
			order.setComment(request.getComment());
			order.setDeleteFlag(request.getDeleteFlag());
			order.setUpdateBy(request.getCurrentUserId());
			order.setUpdateTime(new Date());
			insuracneOrderMapper.updateByPrimaryKeySelective(order);
		}
		return response;
	}

	@Override
	public QueryInsuracneResponse queryInsuracne(QueryInsuracneRequest request) {
		
		return null;
	}

}
