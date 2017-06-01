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

//重名验证
function isStudentInfoName(obj){
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
			$.ajax({
				url : 'teacher_isStudentInfoName.action',
				type : 'POST',
				data : {
					"name":$("input[name='name']").val(),
				},
				timeout : 5000, 
				dataType : 'text', 
				success : function(data, textStatus, jqXHR) {
					if(data==1){
						layer.tips("该用户已经添加！", obj, {
							tips : [ 1, '#78BA32' ]
						});
						obj.attr("is", "false");
					}else if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"student_login.jsp";
						}, 3000);
					}else {
						obj.attr("is", "true");
					}
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});
		}
	}
} 

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


//网站验证
function emaliyz(obj) {
	var emags = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
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
				layer.tips("格式错误!例如：www.aaa.com", obj, {
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
	var index = parent.layer.getFrameIndex(window.name); 

	$(".bottom").click(function () {
		if ($("input[is='false']").length > 0) {
			$("input[is='false']").each(function (index, value) {
				$(value).change();
			})
		}else{		
			$.ajax({
				url : 'teacher_saveSchoolMessage.action',
				type : 'POST',
				data : {
					"school_name":$("input[name='school_name']").val(),
					"school_level":$("input[name='school_level']").val(),
					"collage_name":$("input[name='collage_name']").val(),
					"professional":$("input[name='professional']").val(),
					"contact_service":$("input[name='contact_service']").val(),
					"tel":$("input[name='tel']").val(),
					"student_number":$("input[name='student_number']").val(),
					"school_location":$("input[name='school_location']").val(),
					"school_profile":$("input[name='school_profile']").val(),
					"school_web":$("input[name='school_web']").val(),
					"school_address":$("input[name='school_address']").val(),
					"cooperate":$("input[name='cooperate']").val(),
					"cooperate_company":$("input[name='cooperate_company']").val(),
					"student_dynamic":$("input[name='student_dynamic']").val(),
					"leaveschooltime":$("input[name='leaveschooltime']").val(),
					"ps":$("input[name='ps']").val(),
					
				},
				timeout : 5000, 
				dataType : 'text', 
				success : function(data, textStatus, jqXHR) {
					if(data==1){
						parent.layer.msg('添加成功！', {shade: 0.3});
						parent.layer.close(index);
					}else if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"student_login.jsp";
						}, 3000);
					}else {
						parent.layer.msg('服务器异常，添加失败', {icon: 5,shade: 0.3});
					}
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});
		}
	});

});
