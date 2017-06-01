<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html lang="zh-CN">
<head>
<title></title>
<base href="<%=basePath%>">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/layer/layer.js"></script>
<link rel="stylesheet" type="text/css" href="js/layer/skin/default/layer.css" />
<link rel="stylesheet" type="text/css"
	href="css/teacher_edit_password.css" />
</head>
<body>
<div id="changepw_teacher">
  <div class="changepw">

    <div class="changepw_con">
	
	<div class="changepw_1">
    	 <label>旧密码</label> <input type="password" maxlength = 15 name="jiumi"/>
	 </div>
	<div class="changepw_2">
    	 <label>新密码</label> <input type="password"  maxlength = 15/>
	 </div>
	<div class="changepw_3">
    	 <label>确认新密码</label> <input type="password" maxlength = 15 name="queren" />
	 </div>
       <p class="changepwin">提交</p></div>
  </div>
</div>
	<script type="text/javascript" src="js/teacher_edit_password.js"></script>
</body>
</html>