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
<!-- <script type="text/javascript"> -->
// 	$(function(){

// 		var name = localStorage.getItem("name");
// 		var pwd = localStorage.getItem("pwd");
// 		if(name != "null" && pwd != "null"){
// 			$("#loginName").val(name);
// 			$("#password").val(pwd);
// 			$("#remember-me").attr("checked",true);
// 		}
		
// 	});
<!-- </script> -->

</head>
<body>
<div class="header">
  <div class="am-g"><br>
    <h1>保险管理系统</h1>
  </div>
  <hr />
</div>
<a href="<%=path%>insuracne/toLogin">登录</a>
</body>
</html>