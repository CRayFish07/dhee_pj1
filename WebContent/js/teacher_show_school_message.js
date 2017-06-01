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
				layer.tips("格式错误!例如：www.ccc.com", obj, {
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
	$("input[name='school_name']").val(parent.src_json[0].pagelist[parent.src_show_page].school_name);
	$("input[name='school_level']").val(parent.src_json[0].pagelist[parent.src_show_page].school_level);
	$("input[name='collage_name']").val(parent.src_json[0].pagelist[parent.src_show_page].collage_name);
	$("input[name='professional']").val(parent.src_json[0].pagelist[parent.src_show_page].professional);
	$("input[name='contact_service']").val(parent.src_json[0].pagelist[parent.src_show_page].contact_service);
	$("input[name='tel']").val(parent.src_json[0].pagelist[parent.src_show_page].tel);
	$("input[name='student_number']").val(parent.src_json[0].pagelist[parent.src_show_page].student_number);
	$("input[name='school_location']").val(parent.src_json[0].pagelist[parent.src_show_page].school_location);
	$("input[name='school_profile']").val(parent.src_json[0].pagelist[parent.src_show_page].school_profile);
	$("input[name='school_web']").val(parent.src_json[0].pagelist[parent.src_show_page].school_web);
	$("input[name='school_address']").val(parent.src_json[0].pagelist[parent.src_show_page].school_address);
	$("input[name='cooperate']").val(parent.src_json[0].pagelist[parent.src_show_page].cooperate);
	$("input[name='cooperate_company']").val(parent.src_json[0].pagelist[parent.src_show_page].cooperate_company);
	$("input[name='student_dynamic']").val(parent.src_json[0].pagelist[parent.src_show_page].student_dynamic);
	$("input[name='leaveschooltime']").val(parent.src_json[0].pagelist[parent.src_show_page].leaveschooltime);
	$("input[name='ps']").val(parent.src_json[0].pagelist[parent.src_show_page].ps);
	
	
	var edit_OPEN = true;
	$("input,select").attr("disabled", "disabled");

	$(".bottom").click(function () {
		if (edit_OPEN) {
			$("input,select").removeAttr("disabled");
			$(this).html("提交修改");
			edit_OPEN = false;
		}
//		else {
//			alert("54321");
//			$("input[is='false']").each(function (index, value) {
//				$(value).change();
//			})
//			if ($("input[is='false']").length > 0) {
//				$("input[is='false']").each(function (index, value) {
//					$(value).change();
//				})
//			}
			else {
				$.ajax({
					url : 'teacher_updateSchoolMessage.action',
					type : 'POST',
					data : {
						"id":parent.src_json[0].pagelist[parent.src_show_page].id,
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
							$(".bottom").html("修改信息");
							parent.layer.msg('修改成功！', {shade: 0.3});
							$("input,select").attr("disabled", "disabled");
							edit_OPEN = true;
							var temp=parent.$("#table1 #xiangqing[rowid='"+parent.src_show_page+"']").closest("tr");
							temp.html('<td>'+temp.find("td").text().trim()+'</td><td>'+$("input[name='school_name']").val()+'</td><td>'+$("input[name='school_level']").val()+'</td><td>'+$("input[name='collage_name']").val()+'</td><td>'+value.professional+'</td><td>'+value.contact_service+'</td><td>'+value.tel+'</td><td>'+value.student_number+'</td><td>'+value.school_location+'</td><td style="text-align:center;"><q id="xiangqing" class="q1" rowid="'+index+'">详情</q><q id="shanchu" class="q2" rowid="'+value.id+'">删除</q></td>');	
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
//		}
	});

});
