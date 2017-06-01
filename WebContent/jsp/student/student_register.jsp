<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html lang="zh-CN">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>学生注册</title>
<link rel="stylesheet" href="css/student_register.css">
<script src="js/jquery-1.10.2.js"></script>
<script src="js/layer/layer.js"></script>
</head>
<body>
<div id="login_student">
  <h1>DHEE华信</h1>
  <div class="login">
    <div class="login_head">
      <h1>欢迎注册</h1>
      <span>学生</span> </div>
    <div class="login_con">
      <input type="text" value="Username"  is="false"/>
      <input type="text" value="Password" />
      <input type="text" value="Confirm Password" />
       <p class="loginin">提交</p><p class="reg">返回</p> </div>
  </div>
</div>
<script src="js/student_register.js" ></script>
</body>
</html>