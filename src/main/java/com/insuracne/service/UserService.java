package com.insuracne.service;

import java.util.List;

import com.insuracne.request.AddOrModifyUserRequest;
import com.insuracne.request.LoginRequest;
import com.insuracne.request.QueryUserRequest;
import com.insuracne.request.ResetPwdRequest;
import com.insuracne.response.AddOrModifyUserResponse;
import com.insuracne.response.LoginResponse;
import com.insuracne.response.QueryUserResponse;
import com.insuracne.response.ResetPwdResponse;
import com.insuracne.response.Response;

public interface UserService {

	/**
	 * 登录
	 */
	LoginResponse login(LoginRequest request);
	
	/**
	 * 修改密码
	 */
	ResetPwdResponse resetPwd(ResetPwdRequest request);
	
	/**
	 * 新增/编辑 用户信息
	 */
	AddOrModifyUserResponse addOrModifyUser(AddOrModifyUserRequest request);
	
	/**
	 * 查询用户信息
	 */
	QueryUserResponse queryUser(QueryUserRequest request);
	
	/**
	 * 批量删除用户
	 */
	Response<Object> deleteUserBatch(List<Long> idList);
	
}
