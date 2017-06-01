// JavaScript Document
var PcWidth;
var PcHeight;
var left_nav ;
var con_head ;
var con;
var logOut;

function autoHeight(){
	if(con.height()>PcHeight){
		con.css({"width":PcWidth-$("#src-left-nav").width()-17+"px"});
	}else {
		con.css({"width":PcWidth-$("#src-left-nav").width()+"px"});
	}
}
$(window).resize(function () {
	"use strict";
	PcWidth = $(this).width();
	PcHeight = $(this).height();
	//动态设置内容区的宽度
	$("#src-con-head").css({"width":PcWidth-$("#src-left-nav").width()+"px","left":$("#src-left-nav").width()+"px"});
	$("#con").css({"width":PcWidth-$("#src-left-nav").width()+"px","left":$("#src-left-nav").width()+"px"});
});
$(document).ready(function () {
	"use strict";
	left_nav = $("#src-left-nav>ul>li");
	con_head = $("#src-con-head");
	con=$("#con");
	logOut=$("#src-nav .logout");
	
	//**************************初始化*************************
	//手动触发resize事件
	$(window).trigger("resize");
	switch(left_nav.eq(0).attr("id")){
	case "seditInfo":
		con.load($("base").attr("href")+"jsp/student/student_edit_info.jsp",function(){	
			autoHeight();
		});
		con.fadeIn(100);
		break;
	case "tselectEva":
		con.load($("base").attr("href")+"jsp/teacher/teacher_select_eva.jsp",function(){			
			autoHeight()
		});
		con.fadeIn(100);
		break;
        };
	
	left_nav.click(function () {
		con_head.find("h1").html($(this).text());
		con_head.find("zi").html($(this).text());
		con.fadeOut(100);
		switch($(this).attr("id")){
			case "seditInfo":
				con.load($("base").attr("href")+"jsp/student/student_edit_info.jsp",function(){	
					autoHeight()
				});
				con.fadeIn(100);
				break;
			case "seditPassword":
				con.load($("base").attr("href")+"jsp/student/student_edit_password.jsp",function(){			
					autoHeight()
				});
				con.fadeIn(100);
				break;
			case "sevaTeacher":
				con.load($("base").attr("href")+"jsp/student/student_eva.jsp",function(){			
					autoHeight()
				});
				con.fadeIn(100);
				break;
			case "tselectEva":
				con.load($("base").attr("href")+"jsp/teacher/teacher_select_eva.jsp",function(){			
					autoHeight()
				});
				con.fadeIn(100);
				break;
			case "teditPassword":
				con.load($("base").attr("href")+"jsp/teacher/teacher_edit_password.jsp",function(){			
					autoHeight()
				});
				con.fadeIn(100);
				break;
			case "tselectStuInfo":
				con.load($("base").attr("href")+"jsp/teacher/teacher_select_studentInfo.jsp",function(){			
					autoHeight()
				});
				con.fadeIn(100);
				break;
				
			case "tselectSchInfo":
				con.load($("base").attr("href")+"jsp/school_statistics/school_statistics_school.jsp",function(){			
					autoHeight()
				});
				con.fadeIn(100);
				break;
		};
	});
	
	logOut.click(function(){
		if($(this).attr("loginType")==="0"){
			$.ajax({
				url : 'teacher_loginOut.action',
				type : 'POST',
				data : {
				},
				timeout : 5000, 
				dataType : 'text', 
				success : function(data, textStatus, jqXHR) {
					if(data==0){
						layer.msg('注销失败，请关闭浏览器直接退出！', {icon: 5});
					}else if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"teacher_login.jsp";
						}, 3000);
					}else {
						location.href = $("base").attr("href")+"teacher_login.jsp";
					}
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});	
		}else {
			$.ajax({
				url : 'student_loginOut.action',
				type : 'POST',
				data : {
				},
				timeout : 5000, 
				dataType : 'text', 
				success : function(data, textStatus, jqXHR) {
					if(data==0){
						layer.msg('注销失败，请关闭浏览器直接退出！', {icon: 5});
					}else if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"student_login.jsp";
						}, 3000);
					}else {
						location.href = $("base").attr("href")+"student_login.jsp";
					}
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});	
		}		
	});

});
