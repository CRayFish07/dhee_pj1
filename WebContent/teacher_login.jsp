<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>教师登陆</title>
<link rel="shortcut icon" type="image/x-icon" href="images/Logo.ico" media="screen" />
<link rel="stylesheet" href="css/teacher_login.css">
<script src="js/jquery-1.10.2.js"></script>
<script src="js/layer/layer.js"></script>
</head>
<body>
	<div id="login_student">
		<h1>DHEE华信</h1>
		<div class="login">
			<div class="login_head">
				<h1>请登录</h1>
				<span>教师</span>
			</div>
			<div class="login_con">
				<input type="text" value="Username" is="false"/> <input type="text"
					value="Password" />
				<p class="loginin">登陆</p>
			</div>
		</div>
	</div>
	<script src="js/teacher_login.js"></script>
</body>
</html>