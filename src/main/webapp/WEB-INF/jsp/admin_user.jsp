<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%String path=request.getContextPath() + "/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <!-- 移动端 -->
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>用户管理</title>
  <meta name="description" content="这是一个 table 页面">
  <meta name="keywords" content="table">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="<%=path%>assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="<%=path%>assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="<%=path%>assets/css/amazeui.min.css"/>
  <link rel="stylesheet" href="<%=path%>assets/css/admin.css">
  
<style type="text/css">
.controls {
  padding-top:5px;
  padding-left: 10px;
}
.notfound{
	margin-top: 100px;
	margin-bottom: 200px;
	margin-left: 400px;
	color: gray;
}
</style>
</head>
<body>
<header class="am-topbar admin-header">
  <jsp:include page="header.jsp" />
</header>

<div class="am-cf admin-main">
<!-- content start -->
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf">
        <ol class="am-breadcrumb">
<%-- 		  <li class="am-text-lg"><a href="<%=path %>index" class="am-icon-home">首页</a></li> --%>
		  <li class="am-active "><a>用户管理</a></li>
		</ol>
      </div>
    </div>

    <div class="am-g">
      <div class="am-u-lg-6">
        <div class="am-btn-toolbar">
          <div class="am-btn-group am-btn-group-xs">
       		<button type="button" id="add" class="am-btn am-btn-default" data-am-modal="{target: '#doc-modal-1 ', closeViaDimmer: 0}"><span class="am-icon-plus"></span> 新增</button>
       		<button type="button" id="delete" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
          </div>
        </div>
      </div>
     <div class="am-u-lg-3">
      	<div class="am-form-group">
      	  <select id="select" data-am-selected="{btnSize: 'sm'}" onchange="MM_jumpMenu('parent',this,0)">
      	    <option value=""></option>
            <option value="<%=path %>insuracne/queryUser">所有用户</option>
            <option value="<%=path %>insuracne/queryUser?userType=0">用户</option>
            <option value="<%=path %>insuracne/queryUser?userType=1">管理员</option>
          </select>
      	</div>
      </div>
      <div class="am-u-lg-3">
      	<form action="<%=path %>insuracne/queryUser">
		    <div class="am-input-group am-input-group-sm">
		    	用户名：
		        <input type="text" id="search" class="am-form-field" name="userName">
		        <span class="am-input-group-btn">
		        	<button class="am-btn am-btn-default" type="submit">搜索</button>
		        </span>
		    </div>
      	</form>
      </div>
    </div>

    <div class="am-g">
      <div class="am-u-sm-12">
          <c:choose>
          	<c:when test="${!empty nullMessage }"><tr><td colspan="15"><div class="notfound">${nullMessage }</div></td></tr></c:when>
          	<c:otherwise>
          	<div class="am-scrollable-horizontal">
          	<!-- 表格内容开始 -->
          <table class="am-table am-table-hover table-main am-table-bordered am-text-nowrap am-table-centered">
            <thead>
              <tr>
                <th class="am-text-middle table-check"><input type="checkbox" id="all" onclick="all();"/></th>
                <th class="am-text-middle">序号</th>
	           	<th class="am-text-middle">用户名</th>
	           	<th class="am-text-middle">用户类型</th>
	           	<th class="am-text-middle">登录账号</th>
	           	<th class="am-text-middle">创建时间</th>
              </tr>
            </thead>
          <tbody>
          	  <c:forEach var="user" items="${userList}" varStatus="statusName" >
          	   <tr>
          	    <td class="am-text-middle"><input type="checkbox" id="${user.id }" name="items" value="${user.id }"/></td>
          	    <td class="am-text-middle">${statusName.index+1 }</td>
          	    <td class="am-text-middle">${user.userName }</td>
          	    <td class="am-text-middle">
          	    	<c:if test="${user.userType == 0 }">用户</c:if>
          	    	<c:if test="${user.userType == 1 }">管理员</c:if>
          	    </td>
          	    <td class="am-text-middle">${user.loginName }</td>
          	    <td class="am-text-middle">${user.createTime }</td>
          	    <td>
          	      <div class="am-btn-group am-text-nowrap">
                	<button class="am-btn am-btn-default am-btn-xs am-text-secondary" data-am-popover="{theme: 'default sm', content: '编辑', trigger: 'hover'}" data-am-modal="{target: '#doc-modal-2', closeViaDimmer: 0}" onclick="edit('${user.id }','${user.userName }','${user.userType }','${user.loginName }');"><span class="am-icon-pencil-square-o"></span></button>
                	<button class="am-btn am-btn-default am-text-success am-btn-xs am-hide-sm-only" data-am-popover="{theme: 'default sm', content: '删除', trigger: 'hover'}" onclick="del('${user.id}');"><span class="am-icon-trash-o"></span></button>
            	  </div>
                </td>
          	   </tr>
      	  </c:forEach>
          </tbody>
        </table>
        <!-- 表格内容结束 -->
        </div>
        
        	<!-- 分页 -->
			<div class="am-cf">
			  共 ${page.totalRecords} 条记录
			  <div class="am-fr">
			    <ul class="am-pagination">
			    
			    	<li><a href="<%=path%>adminAction!toUser?firstPage=true">&laquo;</a></li>
				      
				    <c:forEach var="item" items="${page.pages}" varStatus="statusName" >
				    	<c:if test="${page.currentPage == item}">
				      		<li class="am-active"><a href="#">${item}</a></li>
				      	</c:if>
				      	<c:if test="${page.currentPage != item}">
				      		<li><a href="<%=path%>adminAction!toUser?currentPage=${item}">${item}</a></li>
				      	</c:if>
				    </c:forEach>
				      
				    <li><a href="<%=path%>adminAction!toUser?lastPage=true">&raquo;</a></li>
				      
			    </ul>
			  </div>
			</div>
          	</c:otherwise>
          </c:choose>
      </div>

    </div>
  </div>
  <!-- content end -->
</div>

<!-- 弹出框 -->
<!-- 增加 -->
<div class="am-modal am-modal-no-btn" tabindex="-1" id="doc-modal-1">
  <div class="am-modal-dialog">
    <div class="am-modal-hd">增加用户（<small><span style=color:red;>*</span>表示为必填</small>）
      <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
    </div>
    <div class="am-modal-bd">
   	  <table style="font-size: 12px">
		<tbody>
			<tr bgcolor="#FFFFFF">
				<td width="100px" align="right"><span style=color:red;>*</span>姓　名:</td>
				<td align="left" width="400px">
				  <div class="controls">
					 <input type="text" id="a_userName" name="userName" class="am-form-field" placeholder="姓名"></input>
				  </div>
				</td>
			</tr>
			<tr bgcolor="#FFFFFF" id="er_option">
				<td width="100px" align="right"><span style=color:red;>*</span>类　型:</td>
				<td align="left" width="400px"> 
					<div class="controls"> 
						<select id="a_userType" name="userType" class="am-form-field">
							<option value="">选择角色</option>
							<option value="0">用户</option>
							<option value="1">管理员</option>
						</select>
				  	</div>
				</td>
			</tr>
			<tr bgcolor="#FFFFFF" id="er_answer">
				<td width="100px" align="right"><span style=color:red;>*</span>登录账号:</td>
				<td align="left" width="400px">
				  <div class="controls">
					 <input type="text" id="a_loginName" name="loginName" class="am-form-field" placeholder="请输入登录账号"></input>
				  </div>
				</td> 
			</tr>
			<tr bgcolor="#FFFFFF" id="er_option">
				<td width="100px" align="right">管理人:</td>
				<td align="left" width="400px"> 
					<div class="controls"> 
						<select id="a_manageId" name="manageId" class="am-form-field">
							<option value="">选择管理人</option>
<%-- 							<c:forEach items="userList" var="user"> --%>
<%-- 								<option value=${user.id }>${user.userName }</option> --%>
<%-- 							</c:forEach> --%>
							<option value="11">玩玩</option>
						</select>
				  	</div>
				</td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td colspan="2" align="center">
				  <div class="controls">
				    <input type="submit" id="addSubmit" class="button_css" value="确&nbsp;&nbsp;定"/>
				  </div>
				</td>
			</tr>
		</tbody>
	</table>
    </div>
  </div>
</div>
<!-- 增加 -->
<!-- 编辑开始 -->
<div class="am-modal am-modal-no-btn" tabindex="-1" id="doc-modal-2">
  <div class="am-modal-dialog">
    <div class="am-modal-hd">编辑
      <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
    </div>
    <div class="am-modal-bd">
   	  <table style="font-size: 12px">
		<tbody>
			<tr bgcolor="#FFFFFF">
				<td width="100px" align="right">用户ID:</td>
				<td align="left" width="400px">
				  <div class="controls">
					 <input type="text" id="e_userId" name="id" class="am-form-field" readonly></input>
				  </div>
				</td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td width="100px" align="right">姓　名:</td>
				<td align="left" width="400px">
				  <div class="controls">
					 <input type="text" id="e_userName" name="userName" class="am-form-field"></input>
				  </div>
				</td>
			</tr>
			<tr bgcolor="#FFFFFF" id="er_option">
				<td width="100px" align="right">类　型:</td>
				<td align="left" width="400px"> 
					<div class="controls"> 
						<select id="e_userType" name="userType" class="am-form-field">
							<option value="0">用户</option>
							<option value="1">管理员</option>
						</select>
				  	</div>
				</td>
			</tr>
			<tr bgcolor="#FFFFFF" id="er_answer">
				<td width="100px" align="right">登录账号:</td>
				<td align="left" width="400px">
				  <div class="controls">
					 <input type="text" id="e_loginName" name="loginName" class="am-form-field" readonly></input>
				  </div>
				</td> 
			</tr>
			<tr bgcolor="#FFFFFF">
				<td colspan="2" align="center">
				  <div class="controls">
				    <input type="submit" id="editSubmit" class="button_css" value="确&nbsp;&nbsp;定"/>
				  </div>
				</td>
			</tr>
		</tbody>
	</table>
    </div>
  </div>
</div>
<!-- 编辑结束 -->
<div class="am-modal am-modal-confirm" tabindex="-1" id="my-delete">
  <div class="am-modal-dialog">
    <div class="am-modal-bd">
     确定删除吗？
    </div>
    <div class="am-modal-footer">
      <span class="am-modal-btn" data-am-modal-confirm>确定</span>
      <span class="am-modal-btn" data-am-modal-cancel>取消</span>
    </div>
  </div>
</div>
<div class="am-modal am-modal-confirm" tabindex="-1" id="my-null">
  <div class="am-modal-dialog">
    <div class="am-modal-bd">
     您还没有选择哦~~
    </div>
    <div class="am-modal-footer">
      <span class="am-modal-btn" data-am-modal-confirm>确定</span>
    </div>
  </div>
</div>
<script src="<%=path%>assets/js/jquery.min.js"></script>
<script type="text/javascript">

	$(function(){
		
		$("#all").click(function(){
  			var flag = this.checked;
  			$(":checkbox[name='items']").prop('checked',flag);
  		}); 
		$(":checkbox[name='items']").click(function(){
  			$("#all").prop('checked',$(":checkbox[name='items']").length==$(":checkbox[name='items']:checked").length);
  		});
		
		<%Object obj = request.getAttribute("userType");%>
		$("#select").val("<%=path %>insuracne/queryUser?userType=<%=obj%>");
		
		$("#addSubmit").click(function(){
			var userName = $("#a_userName").val();
			var userType = $("#a_userType").val();
			var loginName = $("#a_loginName").val();
			var manageId = $("#a_manageId").val();
			console.log(11);
			if(manageId == ""){
				manageId = null;
			}
			if(userName == "" || userType == "" || loginName == ""){
				alert("请将信息填写完整!");
			}else {
				$.post("<%=path%>insuracne/addOrModifyUser",
						{userName:userName,userType:userType,loginName:loginName,manageId:manageId},
						function(data){
// 							data = eval("("+data+")"); // json字符串转对象，这里直接返回对象无需转换
							if(data.success){
								document.location="<%=path%>insuracne/queryUser";
							} else {
								alert(data.message);
							}
				},"json");
			}
		});
		
		$("#editSubmit").click(function(){
			var id = $("#e_userId").val();
			var userName = $("#e_userName").val();
			var userType = $("#e_userType").val();
			$.post("<%=path%>insuracne/addOrModifyUser",
					{id:id,userName:userName,userType:userType},
					function(){
						document.location="<%=path%>insuracne/queryUser";
					},
			"json");
		});
		
		$("#delete").click(function(){
  			var userId = "";
  			$("input:checkbox[name='items']:checked").each(function(){
  				userId += $(this).val() + "_";
  			});
			if(userId != ""){
				$("#my-delete").modal({
			        onConfirm: function() {
						$.post("<%=path %>insuracne/deleteUserBatch",{ids:userId},function(){
							document.location="<%=path%>insuracne/queryUser";
						},"json");
			        }
			    });
			}else{
				$("#my-null").modal({
					onConfirm: function() {
			        }
				});
			}
		});
		
		/*
		 * 增加用户过程中，角色是教师和管理员的专业和班级不用填写，所以不显示
		 */
		$("#a_role").change(function(){
			if($("#a_role").val() == "teacher" || $("#a_role").val() == "admin"){
				$("#ar_major").hide();
				$("#ar_class").hide();
			}else{
				$("#ar_major").show();
				$("#ar_class").show();
			}
		});
		
	});

	function edit(id, userName, userType, loginName){
		$("#e_userId").val(id);
		$("#e_userName").val(userName);
		$("#e_userType").val(userType);
		$("#e_loginName").val(loginName);
	}
	
	function del(userId){
		$("#my-delete").modal({
	        onConfirm: function() {
				$.post("<%=path %>insuracne/addOrModifyUser",{id:userId,deleteFlag:1},function(){
					document.location="<%=path%>insuracne/queryUser";
				},"text");
	        }
	    });
	}
	
	function MM_jumpMenu(targ, selObj, restore) {
		eval(targ + ".location='" + selObj.options[selObj.selectedIndex].value + "'");
		if (restore)
			selObj.selectedIndex = 0;
	}
	
</script>
<script src="<%=path%>assets/js/amazeui.min.js"></script>
<script src="<%=path%>assets/js/app.js"></script>
<hr>
<p class="am-padding-left">© 山西大学商务学院</p>
</body>
</html>