<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<base href="<%=basePath%>">
<title></title>
<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/layer/layer.js"></script>
<script type="text/javascript" src="<%=basePath%>js/My97DatePicker/WdatePicker.js"></script>
<link rel="stylesheet" type="text/css" href="js/layer/skin/default/layer.css" />
<link rel="stylesheet" type="text/css" href="css/teacher_showEditStudentInfo.css">
</head>
<body>
<div id="gold1">
  <div class="left">
     <ul>
      <li><span class="sp">院校名称</span>
        <input type="text" name="school_name" class=" text1" id="h1" onchange="isStudentInfoName($(this))" is="false"/>
      </li>
      <li><span class="sp">院校层次</span>
        <input type="text" name="school_level" class=" text1" id="h2" onchange="nullyz($(this))" is="false"/>
      <li><span class="sp">学院名称</span>
        <input type="text" name="collage_name" class=" text1" id="h3" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">专业</span>
        <input type="text" name="professional" class=" text1" id="h4" is="false" onchange="nullyz($(this))" is="false"/>
      </li>
      <li>
     <span class="sp">联系人以及参考职务</span>
        <input type="text" name="contact_service" class=" text1" id="h5" onchange="isStudentInfoName($(this))" is="false"/>
      </li>
      <li><span class="sp">电话</span>
        <input type="text" name="tel" class=" text1" id="j4" onchange="ihone($(this))" is="false"/>
      </li>
      <li><span class="sp">学生人数</span>
        <input type="text" name="student_number" class=" text1" id="h7" onchange="nullyz($(this))" is="false"/>
      </li>
        <li><span class="sp">学校所在地</span>
        <input type="text" name="school_location" class=" text1" id="h8" onchange="nullyz($(this))" is="false"/>
      </li>
    </ul>
  </div>
  <div class="right">
    <ul>
      <li><span class="sp">学校简介</span>
        <input type="text" name="school_profile" class=" text2" id="j1" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">学校网站</span>
      <input type="text" name="school_web" class=" text2" id="j6" maxlength="30" onchange="emaliyz($(this))" is="false"/>
      </li>
      <li><span class="sp">学校地址</span>
        <input type="text" name="school_address" class=" text2" id="j3" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">是否有合作</span>
      <input type="text" name="cooperate" class=" text2" id="h6" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">合作企业</span>
        <input type="text" name="cooperate_company" class=" text2" id="j5" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">学生动态</span>
        <input type="text" name="student_dynamic" class=" text2" id="j2" onchange="nullyz($(this))" is="false"/> 
      </li>
      <li><span class="sp">可离校时间</span>
      <input type="text" name="leaveschooltime" class=" text2" id="j7" onchange="nullyz($(this))" is="false"/>
      </li>
       </li>
      <li><span class="sp">备注</span>
      <input type="text" name="ps" class=" text2" id="j8" onchange="nullyz($(this))" is="false"/> 
      </li>
    </ul>
  </div>
  <div class="bottom">确认修改</div>
</div>
<script src="js/teacher_show_school_message.js"></script>
</body>
</html>