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
<link rel="stylesheet" type="text/css" href="css/teacher_addStudentInfo.css">
</head>
<body>
<div id="gold1">
  <div class="left">
    <ul>
      <li><span class="sp">班级</span>
        <input type="text" name="classes" class=" text1" id="c1" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">姓名</span>
        <input type="text" name="name" class=" text1" id="c2" onchange="isStudentInfoName($(this))" is="false"/>
      </li>
      <li><span class="sp">就业情况</span>
        <input type="text" name="employment_status" class=" text1" id="c3" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">性别</span>
        <div class="div_text">
          <input type="radio" name="sex" value="boy" checked="checked" is="true"/>
          男
          <input type="radio" name="sex" value="girl" class="radio2" is="true"/>
          女 </div>
      </li>
      <li><span class="sp">出生年月</span>
        <input type="text" name="birthday" class=" text1" id="c4" is="false" onClick="WdatePicker()" onchange="nullyz($(this))"/>
      </li>
      <li><span class="sp">毕业时间</span>
        <input type="text" name="graduation_time" class=" text1" id="c5" is="false" onClick="WdatePicker()" onchange="nullyz($(this))"/>
      </li>
      <li><span class="sp">类别</span>
        <select name="category" class=" text1">
          <option value="统招">统招</option>
          <option value="自考">自考</option>
          <option value="成人">成人</option>
          <option value="网络">网络</option>
        </select>
      </li>
      <li><span class="sp">所在院校</span>
        <input type="text" name="college" class=" text1" id="c6" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">专业</span>
        <input type="text" name="major" class=" text1" id="c7" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">学历</span>
        <select name="education_bg" class=" text1">
          <option value="本科">本科</option>
          <option value="专升本">专升本</option>
          <option value="大专">大专</option>
        </select>
      </li>
    </ul>
  </div>
  <div class="right">
    <ul>
      <li><span class="sp">外语语种</span>
        <input type="text" name="fg_language" class=" text2" id="a1" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">外语级别</span>
        <input type="text" name="level" class=" text2" id="a2" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">分数</span>
        <input type="text" name="score" class=" text2" id="a3" onchange="numberyz($(this))" is="false"/>
      </li>
      <li><span class="sp">第二外语</span>
        <input type="text" name="fg2_language" class=" text2" id="a4" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">级别</span>
        <input type="text" name="level2" class=" text2" id="a5" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">手机号码</span>
        <input type="text" name="phone" class=" text2" id="a6" onchange="ihone($(this))" is="false"/>
      </li>
      <li><span class="sp">家庭地址</span>
        <input type="text" name="address" class=" text2" id="a7" onchange="nullyz($(this))" is="false"/>
      </li>
      <li><span class="sp">电子邮箱</span>
        <input type="text" name="email" class=" text2" id="a8" maxlength="30" onchange="emaliyz($(this))" is="false"/>
      </li>
      <li><span class="sp">家庭电话</span>
        <input type="text" name="home_telephone" class=" text2" id="a9" onchange="hihone($(this))" is="false"/>
      </li>
    </ul>
  </div>
  <div class="bottom">确认添加</div>
</div>
<script src="js/teacher_addStudentInfo.js"></script>
</body>
</html>