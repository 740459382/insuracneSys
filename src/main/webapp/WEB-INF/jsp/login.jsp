<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path=request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>login</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
  <meta name="format-detection" content="telephone=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="alternate icon" type="image/png" href="<%=path%>assets/i/favicon.png">
  <link rel="stylesheet" href="<%=path%>assets/css/amazeui.min.css"/>
  <style>
    .header {
      text-align: center;
    }
    .header h1 {
      font-size: 200%;
      color: #333;
      margin-top: 30px;
    }
    .header p {
      font-size: 14px;
    }
  </style>
  
<script src="<%=path%>assets/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){

		var name = localStorage.getItem("name");
		var pwd = localStorage.getItem("pwd");
		if(name != "null" && pwd != "null"){
			$("#loginName").val(name);
			$("#password").val(pwd);
			$("#remember-me").attr("checked",true);
		}
		
	});
</script>

</head>
<body>
<div class="header">
  <div class="am-g"><br>
    <h1>保险管理系统</h1>
  </div>
  <hr />
</div>
<div class="am-g">
  <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
    <h3>登录</h3><c:if test="${message != null }"><font color="red">${message}</font></c:if>
    <hr>
    <form class="am-form" action="<%=path%>insuracne/login" method="post">
      <div class="am-input-group"><!-- am-input-group-primary -->
		<span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
		<input type="text" name="loginName" id="loginName" class="am-form-field" placeholder="Username">
	  </div>
      <br>
      <div class="am-input-group">
		<span class="am-input-group-label"><i class="am-icon-lock am-icon-fw"></i></span>
		<input type="password" name="password" id="password" class="am-form-field" placeholder="Password">
	  </div>
      <br>
      <label for="remember-me">
        <input id="remember-me" type="checkbox" name="remb">
        记住密码
      </label>
      <br />
      <div class="am-cf">
        <input type="submit" name="SUBMIT" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
        <!-- <input type="submit" name="" value="忘记密码 ^_^? " class="am-btn am-btn-default am-btn-sm am-fr"> -->
      </div>
    </form>
<hr>
<p class="am-padding-left">© 山西大学商务学院</p>
  </div>
</div>
</body>
</html>