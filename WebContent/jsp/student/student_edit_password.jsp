<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html>
<head>
<title></title>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/layer/layer.js"></script>
		<link rel="stylesheet" type="text/css" href="js/layer/skin/default/layer.css" />
<link rel="stylesheet" type="text/css"
	href="css/student_edit_password.css" />
</head>
<body>
	<div id="changepw_student">
		<div class="changepw">

			<div class="changepw_con">

				<div class="changepw_1">
					<label>旧密码</label> <input type="password" maxlength="15" name="jiumi"/>
				</div>
				<div class="changepw_2">
					<label>新密码</label> <input type="password" maxlength="15" name="xinmi"/>
				</div>
				<div class="changepw_3">
					<label>确认密码</label> <input type="password" maxlength="15" name="queren"/>
				</div>
				<p class="changepwin">提交</p>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/student_edit_password.js"></script>
</body>
</html>