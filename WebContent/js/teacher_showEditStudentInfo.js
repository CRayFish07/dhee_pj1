//空验证
function nullyz(obj) {
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips: [1, '#78BA32'],
			tipsMore: true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 15) {
			layer.tips("不可超过15位!", obj, {
				tips: [1, '#78BA32'],
				tipsMore: true
			});
			obj.attr("is", "false");
		} else {
			obj.attr("is", "true");
		}
	}
};


//分数验证
function numberyz(obj) {
	var scogs = /^([0-9])*[0-9]$/;
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips: [1, '#78BA32'],
			tipsMore: true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 15) {
			layer.tips("不可超过15位!", obj, {
				tips: [1, '#78BA32'],
				tipsMore: true
			});
			obj.attr("is", "false");
		} else {
			if (scogs.test($.trim(obj.val()))) {
				obj.attr("is", "true");
			} else {
				layer.tips("请输入数字!", obj, {
					tips: [1, '#78BA32'],
					tipsMore: true
				});
				obj.attr("is", "false");
			}
		}
	}
}

//手机验证
function ihone(obj) {
	var phogs = /^(13+\d{9})|(15+\d{9})$/;
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips: [1, '#78BA32'],
			tipsMore: true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 20) {
			layer.tips("不可超过20位!", obj, {
				tips: [1, '#78BA32'],
				tipsMore: true
			});
			obj.attr("is", "false");
		} else {
			if (phogs.test($.trim(obj.val()))) {
				obj.attr("is", "true");
			} else {
				layer.tips("请输入15或13位手机号码!", obj, {
					tips: [1, '#78BA32'],
					tipsMore: true
				});
				obj.attr("is", "false");
			}
		}
	}
}


//邮箱验证
function emaliyz(obj) {
	var emags = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips: [1, '#78BA32'],
			tipsMore: true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 50) {
			layer.tips("不可超过50位!", obj, {
				tips: [1, '#78BA32'],
				tipsMore: true
			});
			obj.attr("is", "false");
		} else {
			if (emags.test($.trim(obj.val()))) {
				obj.attr("is", "true");
			} else {
				layer.tips("格式错误!例如：12@123.com", obj, {
					tips: [1, '#78BA32'],
					tipsMore: true
				});
				obj.attr("is", "false");
			}
		}
	}
}

//家庭电话验证
function hihone(obj) {
	var scogs = /^([0-9])*[0-9]$/;
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips: [1, '#78BA32'],
			tipsMore: true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 15) {
			layer.tips("不可超过15位!", obj, {
				tips: [1, '#78BA32'],
				tipsMore: true
			});
			obj.attr("is", "false");
		} else {
			if (scogs.test($.trim(obj.val()))) {
				obj.attr("is", "true");
			} else {
				layer.tips("请输入数字！", obj, {
					tips: [1, '#78BA32'],
					tipsMore: true
				});
				obj.attr("is", "false");
			}
		}
	}
}


$(document).ready(function () {
	$("input[name='classes']").val(parent.src_json[0].pagelist[parent.src_show_page].classes);
	$("input[name='name']").val(parent.src_json[0].pagelist[parent.src_show_page].name);
	$("input[name='employment_status']").val(parent.src_json[0].pagelist[parent.src_show_page].employmentStatus);
	$('input:radio[name="sex"]').eq(parent.src_json[0].pagelist[parent.src_show_page].sex=="TT"?0:1).attr("checked",'checked');
	$("input[name='birthday']").val(parent.src_json[0].pagelist[parent.src_show_page].birthday);
	$("input[name='graduation_time']").val(parent.src_json[0].pagelist[parent.src_show_page].graduationTime);
	$("select[name='category']").val(parent.src_json[0].pagelist[parent.src_show_page].category);
	$("input[name='college']").val(parent.src_json[0].pagelist[parent.src_show_page].college);
	$("input[name='major']").val(parent.src_json[0].pagelist[parent.src_show_page].major);
	$("select[name='education_bg']").val(parent.src_json[0].pagelist[parent.src_show_page].educationBg);
	$("input[name='fg_language']").val(parent.src_json[0].pagelist[parent.src_show_page].fgLanguage);
	$("input[name='level']").val(parent.src_json[0].pagelist[parent.src_show_page].level);
	$("input[name='score']").val(parent.src_json[0].pagelist[parent.src_show_page].score);
	$("input[name='fg2_language']").val(parent.src_json[0].pagelist[parent.src_show_page].fg2Language);
	$("input[name='level2']").val(parent.src_json[0].pagelist[parent.src_show_page].level2);
	$("input[name='phone']").val(parent.src_json[0].pagelist[parent.src_show_page].phone);
	$("input[name='address']").val(parent.src_json[0].pagelist[parent.src_show_page].address);
	$("input[name='email']").val(parent.src_json[0].pagelist[parent.src_show_page].email);
	$("input[name='home_telephone']").val(parent.src_json[0].pagelist[parent.src_show_page].homeTelephone);
	
	var edit_OPEN = true;
	$("input,select").attr("disabled", "disabled");

	$(".bottom").click(function () {
		if (edit_OPEN) {
			$("input,select").removeAttr("disabled");
			$(this).html("提交修改");
			edit_OPEN = false;
		} else {
			$("input[is='false']").each(function (index, value) {
				$(value).change();
			})
			if ($("input[is='false']").length > 0) {
				$("input[is='false']").each(function (index, value) {
					$(value).change();
				})
			} else {
				$.ajax({
					url : 'teacher_updateStudentInfo.action',
					type : 'POST',
					data : {
						"id":parent.src_json[0].pagelist[parent.src_show_page].id,
						"classes":$("input[name='classes']").val(),
						"name":$("input[name='name']").val(),
						"employment_status":$("input[name='employment_status']").val(),
						"sex":$('input:radio[name="sex"]:checked').val(),
						"birthday":$("input[name='birthday']").val(),
						"graduation_time":$("input[name='graduation_time']").val(),
						"category":$("select[name='category']").val(),
						"college":$("input[name='college']").val(),
						"major":$("input[name='major']").val(),
						"education_bg":$("select[name='education_bg']").val(),
						"fg_language":$("input[name='fg_language']").val(),
						"level":$("input[name='level']").val(),
						"score":$("input[name='score']").val(),
						"fg2_language":$("input[name='fg2_language']").val(),
						"level2":$("input[name='level2']").val(),
						"phone":$("input[name='phone']").val(),
						"address":$("input[name='address']").val(),
						"email":$("input[name='email']").val(),
						"home_telephone":$("input[name='home_telephone']").val(),
					},
					timeout : 5000, 
					dataType : 'text', 
					success : function(data, textStatus, jqXHR) {
						if(data==1){
							$(".bottom").html("修改信息");
							parent.layer.msg('修改成功！', {shade: 0.3});
							$("input,select").attr("disabled", "disabled");
							edit_OPEN = true;
						}else if(data==110){
							layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
							setTimeout(function(){
									location.href = $("base").attr("href")+"student_login.jsp";
							}, 3000);
						}else {
							parent.layer.msg('服务器异常，修改失败', {icon: 5,shade: 0.3});
						}
					},
					error : function(xhr, textStatus) {
						layer.msg('服务器错误，请稍后再试！', {icon: 5});
					}
				});	
			}
		}
	});

});
