package com.insuracne.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.insuracne.common.ResponseCodeEnum;
import com.insuracne.common.UserTypeEnum;
import com.insuracne.entity.User;
import com.insuracne.request.AddOrModifyBeneficiaryRequest;
import com.insuracne.request.AddOrModifyInsuracneRequest;
import com.insuracne.request.AddOrModifyUserRequest;
import com.insuracne.request.LoginRequest;
import com.insuracne.request.QueryUserRequest;
import com.insuracne.request.ResetPwdRequest;
import com.insuracne.response.AddOrModifyBeneficiaryResponse;
import com.insuracne.response.AddOrModifyInsuracneResponse;
import com.insuracne.response.AddOrModifyUserResponse;
import com.insuracne.response.LoginResponse;
import com.insuracne.response.QueryUserResponse;
import com.insuracne.response.ResetPwdResponse;
import com.insuracne.response.Response;
import com.insuracne.service.BeneficiaryService;
import com.insuracne.service.InsuracneService;
import com.insuracne.service.UserService;

@Controller
@RequestMapping("/insuracne/")
public class InsuracneController {

	@Autowired
	private UserService userService;
	@Autowired
	private InsuracneService insuracneService;
	@Autowired
	private BeneficiaryService beneficiaryService;

	@RequestMapping("toLogin")
	public String toLogin(){
		return "login";
	}
	
	/* ================================ 用户 ====================================== */
	
	/**
	 * 登录
	 */
	@RequestMapping("login")
	public String login(@ModelAttribute LoginRequest req, HttpServletRequest request){
		
		if(req.getLoginName() == null || req.getPassword() == null){
			request.setAttribute("message", ResponseCodeEnum.PARAM_ERROR.getMessage());
			return "login";
		}
		
		LoginResponse resp = userService.login(req);
		if(!resp.isSuccess()){
			request.setAttribute("message", resp.getMessage());
			return "login";
		}

		User user = resp.getResult();
		request.getSession().setAttribute("user", user);
		if(user.getUserType() == UserTypeEnum.USER.getCode()){
			return "";
		} else {
			return "admin_user";
		}
	}
	
	/**
	 * 修改密码
	 */
	@ResponseBody
	@RequestMapping("resetPwd")
	public ResetPwdResponse resetPwd(@ModelAttribute ResetPwdRequest req, HttpSession session){
		return userService.resetPwd(req);
	}
	
	/**
	 * 新增/编辑 用户信息
	 */
	@ResponseBody
	@RequestMapping("addOrModifyUser")
	public AddOrModifyUserResponse addOrModifyUser(@ModelAttribute AddOrModifyUserRequest req, HttpServletRequest request){
		return userService.addOrModifyUser(req);
	}
	
	/**
	 * 查询用户信息
	 */
	@RequestMapping("queryUser")
	public String queryUser(@ModelAttribute QueryUserRequest req, HttpServletRequest request){
		QueryUserResponse resp = userService.queryUser(req);
		request.setAttribute("userList", resp.getResult());
		
		request.setAttribute("userType", req.getUserType());
		
		User user = (User) request.getSession().getAttribute("user");
		if(user.getUserType() == UserTypeEnum.USER.getCode()){
			return "";
		} else {
			return "admin_user";
		}
	}
	
	/**
	 * 批量删除用户
	 */
	@ResponseBody
	@RequestMapping("deleteUserBatch")
	public Response<Object> deleteUserBatch(@RequestParam String idStr){
		if(idStr == null){
			return null;
		}
		
		String[] ids = idStr.split("[_]");
		List<Long> idList = new ArrayList<>();
		for(String id : ids){
			idList.add(Long.valueOf(id));
		}
		return userService.deleteUserBatch(idList);
	}
	
	
	/* ================================ 保单 ====================================== */
	
	
	/**
	 * 新增/编辑 保单信息
	 */
	@RequestMapping("addOrModifyInsuracne")
	public AddOrModifyInsuracneResponse addOrModifyInsuracne(@ModelAttribute AddOrModifyInsuracneRequest req, HttpServletRequest request){
		return insuracneService.addOrModifyInsuracne(req);
	}
	
	
	/* ================================ 受益人 ====================================== */
	
	
	/**
	 * 新增/编辑 受益人信息
	 */
	@RequestMapping("addOrModifyBeneficiary")
	public AddOrModifyBeneficiaryResponse addOrModifyBeneficiary(@ModelAttribute AddOrModifyBeneficiaryRequest req, HttpServletRequest request){
		return beneficiaryService.addOrModifyBeneficiary(req);
	}
	
}
