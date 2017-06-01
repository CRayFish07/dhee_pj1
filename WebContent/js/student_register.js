$(document).ready(function(){
	"use strict";
	var UandP=$("#login_student>.login>.login_con>input");
	var confirm=$("#login_student>.login>.login_con>.loginin");
	var back=$("#login_student>.login>.login_con>.reg");
	var username=UandP.eq(0);
	var password=UandP.eq(1);
	var confirmPassword=UandP.eq(2);
	
	UandP.focus(function () {
		if (this.value === this.defaultValue) {
			if(this.defaultValue==="Password"||this.defaultValue==="Confirm Password"){
				$(this).attr("type","password");
			}
			this.value = "";
			$(this).css("color", "#000");
		} 
	});

	UandP.blur(function () {
		if (this.value === "") {
			if(this.defaultValue==="Password"||this.defaultValue==="Confirm Password"){
				$(this).attr("type","text");
			}
			this.value = this.defaultValue;
			$(this).css("color", "#999");
		} else {
			if (this.defaultValue === "Username") {
				if (this.value.length > 15) {
					layer.tips("不能超过15位！", this, {
						tips: [1, '#78BA32']
					});
				} else {
					$.ajax({
						url:'studentInit_isStudentName.action',
						type:'post',
						data:{
							"studentName":this.value,
						},
						timeout:5000,
						dataType:'text',
						success:function(data,textStatus,jqXHR){
						if(data==1){
							layer.tips("用户名已经存在",username,{
								tips:[1,'#78BA32']
							});
							username.attr("is","false");
						}else{
							username.attr("is","true");
						}
						},
						error : function(xhr, textStatus) {
							layer.msg('服务器错误，请稍后再试！', {icon: 5});
						}
					});
				}
			} else {
				if (this.defaultValue === "Password") {
					if (this.value.length > 15) {
						layer.tips("不能超过15位！", this, {
							tips: [1, '#78BA32']
						});
					} 
				} else {
					if (password.val() === "Password") {
						this.value = this.defaultValue;
						layer.tips("请先输入密码！", this, {
							tips: [1, '#78BA32']
						});
					} else {
						if (password.val() === this.value) {
						} else {
							$(this).css("color", "#999");
							layer.tips("您两次输入的密码不同请确认密码！", this, {
								tips: [1, '#78BA32']
							});
						}
					}
				}
			}
		}
	});

	confirm.click(function () {
		if (username.val() === "Username") {
			layer.tips("用户名不能为空！", username, {
				tips: [1, '#78BA32']
			});
		} else {
			if (username.val().length > 15) {
				layer.tips("不能超过15位！", username, {
					tips: [1, '#78BA32']
				});
			} else{
				if (password.val() === "Password") {
					layer.tips("密码不能为空！", password, {
						tips: [1, '#78BA32']
					});
				} else {
					if (password.val().length > 15) {
						layer.tips("不能超过15位！", password, {
							tips: [1, '#78BA32']
						});
					} else {
						if (confirmPassword.val() === "Confirm Password") {
							layer.tips("请确认密码！", confirmPassword, {
								tips: [1, '#78BA32']
							});
						}else{
							if (confirmPassword.val() !=password.val()) {
								layer.tips("您两次输入的密码不同请确认密码！", confirmPassword, {
									tips: [1, '#78BA32']
								});
							}else {
								if (username.attr("is")=="false") {
									layer.tips("该用户名已经存在，请更改用户名！", username, {
										tips: [1, '#78BA32']
									});
								}else{
									$.ajax({
										url:'studentInit_saveStudent.action',
										type:'post',
										data:{
											"studentName":username.val(),
											"studentPassword":password.val()
										},
										timeout:5000,
										dataType:'text',
										success:function(data,textStatus,jqXHR){
										//	alert(data);
										if(data==1){
											layer.msg('注册成功,3秒后跳转到登陆页！', {icon: 6,shade: 0.3});
											setTimeout(function(){
												location.href = $("base").attr("href")+"student_login.jsp";
											}, 3000);
										}else{
											parent.layer.msg('服务器异常，注册失败', {icon: 5,shade: 0.3});
										}
										},
										error : function(xhr, textStatus) {
											layer.msg('服务器错误，请稍后再试！', {icon: 5});
										}
									});
								}
							}
						}
					}
				}
			}
		}
	});
	
	back.click(function(){
		location.href = $("base").attr("href")+"student_login.jsp";
	});
	
});