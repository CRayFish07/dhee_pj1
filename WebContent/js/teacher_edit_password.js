$(document).ready(function() {
	"use strict";
	var UandP = $("#changepw_teacher>.changepw>.changepw_con input");
	var confirm = $("#changepw_teacher>.changepw>.changepw_con>.changepwin");
	var oldPassword = UandP.eq(0);
	var newPassword = UandP.eq(1);
	var confirmPassword = UandP.eq(2);

	UandP.focus(function() {
		if (this.value === this.defaultValue) {
			this.value = "";
			$(this).css("color", "#000");
		}
	});

	UandP.blur(function() {
		if ($(this).attr("name") === "queren") {
			if (confirmPassword.val() != newPassword.val()) {
				layer.tips("俩次密码输入的不一致！", confirmPassword, {
					tips : [ 1, '#78BA32' ]
				});
			}
		}

		if ($(this).attr("name") === "jiumi"&&$(this).val().trim()!="") {
			$.ajax({
				url : 'teacher_isPassword.action',
				type : 'POST',
				data : {
					"oldPassword" : this.value,
				},
				timeout : 5000,
				dataType : 'text',
				success : function(data, textStatus, jqXHR) {
					if (data == 0) {
						layer.tips("密码不正确", oldPassword, {
							tips : [ 1, '#78BA32' ]
						});
					}else if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"student_login.jsp";
						}, 3000);
					}
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});

		}
	});

	confirm.click(function() {
		if (oldPassword.val() === "") {
			layer.tips("旧密码不能为空！", oldPassword, {
				tips : [ 1, '#78BA32' ]
			});
		} else {
			if (newPassword.val() === "") {
				layer.tips("新密码不能为空！", newPassword, {
					tips : [ 1, '#78BA32' ]
				});
			} else {
				if (confirmPassword.val() === "") {
					layer.tips("请确认密码！", confirmPassword, {
						tips : [ 1, '#78BA32' ]
					});
				} else {
					if (newPassword.val() != confirmPassword.val()) {
						layer.tips("两次输入的密码不一致请确认密码！", confirmPassword, {
							tips : [ 1, '#78BA32' ]
						});
					} else {
						$.ajax({
							url : 'teacher_updatePassword.action',
							type : 'POST',
							data : {
								"newPassword" : newPassword.val(),
							},
							timeout : 5000,
							dataType : 'text',
							success : function(data, textStatus, jqXHR) {
								if (data == 1) {
									layer.msg('修改成功！', {icon: 6});
								}else if(data==110){
									layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
									setTimeout(function(){
											location.href = $("base").attr("href")+"student_login.jsp";
									}, 3000);
								}else {
									layer.msg('服务器连接失败！', {icon: 5});
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
	});

});