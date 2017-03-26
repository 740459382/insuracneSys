<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String path=request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" type="image/png" href="<%=path%>assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="<%=path%>assets/i/app-icon72x72@2x.png">
<link rel="stylesheet" href="<%=path%>assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="<%=path%>assets/css/admin.css">
<script src="<%=path%>assets/js/amazeui.min.js"></script>
<script src="<%=path%>assets/js/app.js"></script>
<title>Insert title here</title>
</head>
<body>

  <div class="am-topbar-brand">
    <a href="<%=path %>index"><strong>在线</strong> <small>考试系统</small></a>
  </div>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users"></span> ${user.userName } <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="javascript:editpassword();"><span class="am-icon-cog"></span> 修改密码</a></li>
          <li><a href="<%=path %>login.jsp"><span class="am-icon-power-off"></span> 退出</a></li>
        </ul>
      </li>
    </ul>
  </div>
  
  <div class="am-modal" tabindex="-1" id="editpassword">
  <div class="am-modal-dialog">
    <div class="am-modal-hd"><font color='red'>修改密码</font>
      <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
    </div>
    <div class="am-modal-bd">
        <form class="am-form">
          <div class="am-g am-margin-top-sm">
            <div class="am-u-sm-3 am-text-right">旧密码：</div>
            <div class="am-u-sm-9 am-u-end am-text-left">
            	<input type="password" id="oldpwd" value="" class="am-input-sm">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
          	<div class="am-u-sm-3 am-text-right">新密码：</div>
            <div class="am-u-sm-9 am-u-end am-text-left" >
              <input type="password" id="newpwd1" value="" class="am-input-sm">
            </div>
          </div>
          <div class="am-g am-margin-top-sm">
          	<div class="am-u-sm-3 am-text-right">密码确认：</div>
            <div class="am-u-sm-9 am-u-end">
              <input type="password" id="newpwd2" value="" class="am-input-sm">
            </div>
          </div>
        </form>
    </div>
	<div class="am-modal-footer">
		<span class="am-modal-btn" data-am-modal-cancel>取消</span>
		<span class="am-modal-btn" data-am-modal-confirm>提交</span>
	</div>
  </div>
</div>

<script src="<%=path%>assets/js/jquery.min.js"></script>
<script type="text/javascript">

	function editpassword(){
		$("#oldpwd").val("");
		$("#newpwd1").val("");
		$("#newpwd2").val("");
		
		$("#editpassword").modal({
			onConfirm:function(){
				var oldpwd = $("#oldpwd").val();
				var newpwd1 = $("#newpwd1").val();
				var newpwd2 = $("#newpwd2").val();
				if(oldpwd == "" || newpwd1 == "" || newpwd2 == ""){
					alert("请输入密码！");
				}else if(newpwd1 != newpwd2){
					alert("密码确认失败！");
				}else {
					$.post("<%=path%>userAction!editpwd",{oldpwd:oldpwd,newpwd1:newpwd1},function(data){
						data = eval("("+data+")");
						if(data.result != ""){
							alert("原始密码不匹配，修改失败！");
						}else{
							alert("请重新登录！");
							document.location="<%=path%>login.jsp";
						}
					},"text");
				}
			}
		});
	}
</script>
</body>
</html>