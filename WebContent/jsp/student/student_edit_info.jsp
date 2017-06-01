<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!doctype html>
<html>
<head>
	<title></title>
	<base href="<%=basePath%>">
	<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="js/layer/layer.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/My97DatePicker/WdatePicker.js"></script>
	<link rel="stylesheet" type="text/css" href="js/layer/skin/default/layer.css" />
	<link rel="stylesheet" type="text/css" href="css/student_edit_info.css">
</head>
<body>
<div id="gold">
		<div class="left">
    	<ul>
        	<li><span class="sp">班级</span><input type="text" name="classes" class=" text1" id="c1" onchange="nullyz($(this))" is="false" value="<s:if test="#session.studentInfo.classes!='null'"><s:property value="#session.studentInfo.classes"/></s:if>"/></li>
            <li><span class="sp">姓名</span><input type="text" name="name" class=" text1" id="c2" onchange="isStudentInfoName($(this))" is="false" value="<s:if test="#session.studentInfo.name!='null'"><s:property value="#session.studentInfo.getName()"/></s:if>"/></li>
            <li><span class="sp">就业情况</span><input type="text" name="employment_status" class=" text1" id="c3" onchange="nullyz($(this))" is="false" value="<s:if test="#session.studentInfo.employmentStatus!='null'"><s:property value="#session.studentInfo.employmentStatus"/></s:if>"/></li>
            <li><span class="sp">性别</span><div class="div_text"><input type="radio" name="sex"  is="true" value="TT" <s:if test="#session.studentInfo.sex =='TT'">checked="checked"</s:if><s:elseif test="#session.studentInfo.sex =='FF'">checked="checked"</s:elseif><s:else>checked=checked</s:else>/>男<input type="radio" name="sex" value="FF"  is="true" class="radio2" <s:if test="#session.studentInfo.sex =='FF'">checked="checked"</s:if>/>女</div></li>
            <li><span class="sp">出生年月</span><input type="text" name="birthday" class=" text1" id="c4" is="false" onClick="WdatePicker()" onchange="nullyz($(this))" value='<s:date format="yyyy-MM-dd" name="#session.studentInfo.birthday"/>'/></li>
            <li><span class="sp">毕业时间</span><input type="text" name="graduation_time" class=" text1" id="c5" is="false" onClick="WdatePicker()" onchange="nullyz($(this))" value='<s:date format="yyyy-MM-dd" name="#session.studentInfo.graduationTime"/>'/></li>
            <li><span class="sp">类别</span>
            	<select name="category" class=" text1" id="cate">
                	<option value="统招" <s:if test="#session.studentInfo.category =='统招'">selected="selected"</s:if>>统招</option>
                    <option value="自考" <s:if test="#session.studentInfo.category =='自考'">selected="selected"</s:if>>自考</option>
                    <option value="成人" <s:if test="#session.studentInfo.category =='成人'">selected="selected"</s:if>>成人</option>
                    <option value="网络" <s:if test="#session.studentInfo.category =='网络'">selected="selected"</s:if>>网络</option>
                </select>
            </li>
            <li><span class="sp">所在院校</span><input type="text" name="college" class=" text1" id="c6" onchange="nullyz($(this))" is="false" value="<s:property value="#session.studentInfo.college"/>"/></li>
            <li><span class="sp">专业</span><input type="text" name="major" class=" text1" id="c7" onchange="nullyz($(this))" is="false" value="<s:property value="#session.studentInfo.major"/>"/></li>
            <li><span class="sp">学历</span>
            	<select name="education_bg" class=" text1" id="edbg">
                	<option value="本科" <s:if test="#session.studentInfo.educationBg =='本科'">selected="selected"</s:if>>本科</option>
                    <option value="专升本" <s:if test="#session.studentInfo.educationBg =='专升本'">selected="selected"</s:if>>专升本</option>
                    <option value="大专" <s:if test="#session.studentInfo.educationBg =='大专'">selected="selected"</s:if>>大专</option>
                </select>
            </li>
        </ul>
    </div>
    <div class="right">
    	<ul>
        	<li><span class="sp">外语语种</span><input type="text" name="fg_language" class=" text2" id="a1" onchange="nullyz($(this))" is="false" value="<s:property value="#session.studentInfo.fgLanguage"/>"/></li>
            <li><span class="sp">外语级别</span><input type="text" name="level" class=" text2" id="a2" onchange="nullyz($(this))" is="false" value="<s:property value="#session.studentInfo.level"/>"/></li>
            <li><span class="sp">分数</span><input type="text" name="score" class=" text2" id="a3" onchange="numberyz($(this))" is="false" value="<s:if test="#session.studentInfo.score!=0.0"><s:property value="#session.studentInfo.score"/></s:if>"/></li>
            <li><span class="sp">第二外语</span><input type="text" name="fg2_language" class=" text2" id="a4" onchange="nullyz($(this))" is="false" value="<s:property value="#session.studentInfo.fg2Language"/>"/></li>
            <li><span class="sp">级别</span><input type="text" name="level2" class=" text2" id="a5" onchange="nullyz($(this))" is="false"  value="<s:property value="#session.studentInfo.level2"/>"/></li>
            <li><span class="sp">手机号码</span><input type="text" name="phone" class=" text2" id="a6" onchange="ihone($(this))" is="false"  value="<s:property value="#session.studentInfo.phone"/>"/></li>
            <li><span class="sp">家庭地址</span><input type="text" name="address" class=" text2" id="a7"  onchange="nullyz($(this))" is="false" value="<s:property value="#session.studentInfo.address"/>"/></li>
            <li><span class="sp">电子邮箱</span><input type="text" name="email" class=" text2" id="a8" maxlength="30" onchange="emaliyz($(this))" is="false"  value="<s:property value="#session.studentInfo.email"/>"/></li>
            <li><span class="sp">家庭电话</span><input type="text" name="home_telephone" class=" text2" id="a9"  value="<s:property value="#session.studentInfo.homeTelephone"/>"/></li>
        </ul>
    </div>
    <div class="bottom">确认修改</div>
</div>
<script src="js/student_edit_info.js"></script>
</body>
</html>