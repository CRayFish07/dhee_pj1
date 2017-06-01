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
<meta charset="utf-8">
<title></title>
<base href="<%=basePath%>">
<script src="js/jquery-1.10.2.js"></script>
<script src="js/layer/layer.js"></script>
	<link rel="stylesheet" type="text/css" href="js/layer/skin/default/layer.css" />
<link rel="stylesheet" type="text/css" href="css/student_eva.css">
</head>
<body>
	<div id="student_pj">
		<table cellspacing="0">
			<tbody>
				<tr class="tr1">
					<td colspan="4" class="td1">讲师授课效果评价表</td>
				</tr>
				<tr style="height: 30px; line-height: 25px;">
					<td colspan="3" class="td2"><span>班级：</span><input type="text"
						name="classes" class=" classes_1" maxlength="15"/> <span>培训讲师：</span><input
						type="text" name="teacher" class="classes_1" maxlength="15"/> <span>课程：</span><input
						type="text" name="course" class="classes_1" maxlength="15"/></td>
					<td width="22%"><span class="f1"></span></td>
				</tr>
				<tr class="tr2">
					<td width="10%">评价方向</td>
					<td width="57%">具体内容</td>
					<td width="11%">分值</td>
					<td>实际情况</td>
				</tr>
				<tr>
					<td rowspan="3" class="td3">个人素养</td>
					<td>仪表端庄，整洁，有亲和力（4′）</td>
					<td><input type="text" name="fen2" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-4]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-4]/g,'')"/></td>
					<td><input type="text" name="pl1" class="classes_3" /></td>
				</tr>
				<tr>
					<td>板书公整，简明精炼（4′）</td>
					<td><input type="text" name="fen3" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-4]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-4]/g,'')" /></td>
					<td><input type="text" name="pl2" class="classes_3" /></td>
				</tr>
				<tr>
					<td>吐字清晰，语言描述到位，通俗易懂（4′）</td>
					<td><input type="text" name="fen4" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-4]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-4]/g,'')" /></td>
					<td><input type="text" name="pl3" class="classes_3" /></td>
				</tr>
				<tr>
					<td rowspan="8" class="td3">教学态度</td>
					<td>按时上课，保证课时（5′）</td>
					<td><input type="text" name="fen5" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-5]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-5]/g,'')" /></td>
					<td><input type="text" name="pl4" class="classes_3" /></td>
				</tr>
				<tr>
					<td>教师授课能做到认真备课，在准备充分的前提下授课（5′）</td>
					<td><input type="text" name="fen6" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-5]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-5]/g,'')"/></td>
					<td><input type="text" name="pl5" class="classes_3" /></td>
				</tr>
				<tr>
					<td>认真准备课件，课件内容准确无误（5′）</td>
					<td><input type="text" name="fen7" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-5]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-5]/g,'')"/></td>
					<td><input type="text" name="pl6" class="classes_3" /></td>
				</tr>
				<tr>
					<td>针对课件做相应的扩展，不照本宣科，激发学生学习动力（5′）</td>
					<td><input type="text" name="fen8" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-5]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-5]/g,'')"/></td>
					<td><input type="text" name="pl7" class="classes_3" /></td>
				</tr>
				<tr>
					<td>讲课生动，能够调动学员的学习和参与兴趣（5′）</td>
					<td><input type="text" name="fen9" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-5]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-5]/g,'')"/></td>
					<td><input type="text" name="pl8" class="classes_3" /></td>
				</tr>
				<tr>
					<td>课后教师与学生互动交流，对每一位学员的学习情况有所了解（5′）</td>
					<td><input type="text" name="fen10" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-5]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-5]/g,'')"/></td>
					<td><input type="text" name="pl9" class="classes_3" /></td>
				</tr>
				<tr>
					<td>课后作业与课程内容紧密联系，并且能认真检查学生作业（5′）</td>
					<td><input type="text" name="fen11" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-5]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-5]/g,'')"/></td>
					<td><input type="text" name="pl10" class="classes_3" /></td>
				</tr>
				<tr>
					<td>对学生有责任心，能够认真回答学生提问，耐心讲解（5′）</td>
					<td><input type="text" name="fen12" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-5]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-5]/g,'')"/></td>
					<td><input type="text" name="pl11" class="classes_3" /></td>
				</tr>
				<tr>
					<td rowspan="6" class="td3">教学水平</td>
					<td>分阶段教学，并且让学生对下一阶段的教学内容有大概了解（8′）</td>
					<td><input type="text" name="fen13" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-8]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-8]/g,'')"/></td>
					<td><input type="text" name="pl12" class="classes_3" /></td>
				</tr>
				<tr>
					<td>联系实际进行教学，并根据学员需求对课程进度、讲课方式方法进行调整（8′）</td>
					<td><input type="text" name="fen14" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-8]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-8]/g,'')"/></td>
					<td><input type="text" name="pl13" class="classes_3" /></td>
				</tr>
				<tr>
					<td>知识点清晰、准确，扫清知识盲点，教学内容没有缺漏（8′）</td>
					<td><input type="text" name="fen15" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-8]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-8]/g,'')"/></td>
					<td><input type="text" name="pl14" class="classes_3" /></td>
				</tr>
				<tr>
					<td>知识面广，能够在原有基础上拔高，扩充内容（8′）</td>
					<td><input type="text" name="fen16" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-8]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-8]/g,'')"/></td>
					<td><input type="text" name="pl15" class="classes_3" /></td>
				</tr>
				<tr>
					<td>课件内容充实先进，具有相关实际案例支撑教学过程（8′）</td>
					<td><input type="text" name="fen17" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-8]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-8]/g,'')"/></td>
					<td><input type="text" name="pl16" class="classes_3" /></td>
				</tr>
				<tr>
					<td>在将教学内容与开发人员工作习惯紧密结合（8′）</td>
					<td><input type="text" name="fen18" class="classes_3" onkeyup="this.value=this.value.replace(/[^0-8]/g,'')" onafterpaste="this.value=this.value.replace(/[^0-8]/g,'')"/></td>
					<td><input type="text" name="pl17" class="classes_3" /></td>
				</tr>
				<tr>
					<td colspan="4" class="td4">意见及建议</td>
				</tr>
				<tr>
					<td class="td6" colspan="4"><span>1.本课程还有那些内容不明白或不清楚的？</span></td>
				</tr>
				<tr>
					<td class="td5" colspan="4"><textarea name="yj_1" class="yj_1"></textarea></td>
				</tr>
				<tr>
					<td class="td6" colspan="4">2.您对本课程或讲师有何建议?</td>
				</tr>
				<tr>
					<td class="td5" colspan="4"><textarea name="yj_2" class="yj_1"></textarea></td>
				</tr>
				<tr>
					<td class="td6" colspan="4">3.对培训中心有那些意见？</td>
				</tr>
				<tr>
					<td class="td5" colspan="4"><textarea name="yj_3" class="yj_1"></textarea></td>
				</tr>
				<tr>
					<td class="td4" colspan="4">后勤支持(请对下列各项评价)</td>
				</tr>
				<tr>
					<td colspan="4"><span>1.教室环境及设备是否合适：</span> <textarea
							name="yj_3" class="hq"></textarea></td>
				</tr>
				<tr>
					<td colspan="4"><span>2.电脑维护及问题解决是否及时充分：</span> <textarea
							name="yj_3" class="hq"></textarea></td>
				</tr>
				<tr>
					<td colspan="4"><span>3.获得课程信息是否及时：</span> <textarea
							name="yj_3" class="hq"></textarea></td>
				</tr>
				<tr>
					<td colspan="4"><span>4.培训中心沟通反馈是否流畅：</span> <textarea
							name="yj_3" class="hq"></textarea></td>
				</tr>
			</tbody>
		</table>
		<div class=" button1">提交</div>
	</div>
	<script type="text/javascript" src="js/student_eva.js"></script>
</body>
</html>