package com.insuracne.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuracne.common.DeleteFlagEnum;
import com.insuracne.common.MD5Util;
import com.insuracne.common.ResponseCodeEnum;
import com.insuracne.dao.UserMapper;
import com.insuracne.entity.User;
import com.insuracne.entity.UserExample;
import com.insuracne.request.AddOrModifyUserRequest;
import com.insuracne.request.LoginRequest;
import com.insuracne.request.QueryUserRequest;
import com.insuracne.request.ResetPwdRequest;
import com.insuracne.response.AddOrModifyUserResponse;
import com.insuracne.response.LoginResponse;
import com.insuracne.response.QueryUserResponse;
import com.insuracne.response.ResetPwdResponse;
import com.insuracne.response.Response;
import com.insuracne.service.UserService;

@Service
public class UserServciceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 登录
	 */
	@Override
	public LoginResponse login(LoginRequest request) {
		LoginResponse response = new LoginResponse();
		
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andLoginNameEqualTo(request.getLoginName());
		List<User> userList = userMapper.selectByExample(example);
		if(userList == null || userList.size() == 0){
			response.setResponseCode(ResponseCodeEnum.USER_NOT_EXISTS);
			return response;
		}
		
		User user = userList.get(0);
		if(!user.getPassword().equals(MD5Util.getMD5pwd(request.getPassword()))){
			response.setResponseCode(ResponseCodeEnum.LOGIN_PASSWORD_ERROR);
			return response;
		}
		response.setResult(user);
		return response;
	}

	/**
	 * 修改密码
	 */
	@Override
	public ResetPwdResponse resetPwd(ResetPwdRequest request) {
		ResetPwdResponse response = new ResetPwdResponse();
		
		// 1.查询用户是否存在
		QueryUserResponse userResponse = queryUser(new QueryUserRequest(request.getLoginName()));
		if(userResponse.getResult() == null){
			response.setCode(userResponse.getCode());
			response.setMessage(userResponse.getMessage());
			return response;
		}
		
		// 2.校验原始密码是否正确
		User user = userResponse.getResult().get(0);
		if(!user.getPassword().equals(MD5Util.getMD5pwd(request.getOldPwd()))){
			response.setResponseCode(ResponseCodeEnum.LOGIN_PASSWORD_ERROR);
			return response;
		}
		
		// 3.修改密码
		user.setPassword(MD5Util.getMD5pwd(request.getNewPwd()));
		user.setUpdateBy(request.getCurrentUserId());
		user.setUpdateTime(new Date());
		userMapper.updateByPrimaryKeySelective(user);
		
		return response;
	}
	
	/**
	 * 新增/编辑 用户信息
	 */
	@Override
	public AddOrModifyUserResponse addOrModifyUser(AddOrModifyUserRequest request) {
		AddOrModifyUserResponse response = new AddOrModifyUserResponse();
		
		if(request.getId() == null){
			// 新增
			QueryUserResponse userResp = queryUser(new QueryUserRequest(request.getLoginName()));
			if(userResp.isSuccess()){
				response.setResponseCode(ResponseCodeEnum.USER_EXISTS);
				return response;
			}
			User user = new User();
			user.setUserName(request.getUserName());
			user.setLoginName(request.getLoginName());
			user.setPassword(request.getPassword());
			user.setManageId(request.getManageId());
			user.setDeleteFlag(DeleteFlagEnum.NO_DELETE.getCode());
			user.setCreateBy(request.getCurrentUserId());
			user.setCreateTime(new Date());
			userMapper.insertSelective(user);
		} else {
			// 编辑
			User user = userMapper.selectByPrimaryKey(request.getId());
			if(user == null){
				response.setResponseCode(ResponseCodeEnum.USER_NOT_EXISTS);
				return response;
			}
			user.setUserName(request.getUserName());
			user.setUserType(request.getUserType());
			user.setLoginName(request.getLoginName());
			user.setPassword(request.getPassword());
			user.setManageId(request.getManageId());
			user.setDeleteFlag(request.getDeleteFlag());
			user.setUpdateBy(request.getCurrentUserId());
			user.setUpdateTime(new Date());
			userMapper.updateByPrimaryKeySelective(user);
		}
		return response;
	}

	/**
	 * 查询用户信息
	 */
	@Override
	public QueryUserResponse queryUser(QueryUserRequest request) {
		QueryUserResponse response = new QueryUserResponse();
		
		Map<String, Object> param = new HashMap<>();
		param.put("id", request.getId());
		param.put("userType", request.getUserType());
		param.put("loginName", request.getLoginName());
		param.put("manageId", request.getManageId());
		
		List<User> userList = userMapper.queryUserByParam(param);
		
		if(userList != null && userList.size() > 0){
			response.setResult(userList);
			return response;
		}

		response.setResponseCode(ResponseCodeEnum.USER_NOT_EXISTS);
		return response;
	}

	/**
	 * 批量删除用户
	 */
	@Override
	public Response<Object> deleteUserBatch(List<Long> idList) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(idList);
		
		User user = new User();
		user.setDeleteFlag(DeleteFlagEnum.YES_DELETE.getCode());
		userMapper.updateByExampleSelective(user, example);
		return new Response<>();
	}

}
