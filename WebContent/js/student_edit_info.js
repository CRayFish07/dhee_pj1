//空验证
function nullyz(obj) {
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips : [ 1, '#78BA32' ],
			tipsMore : true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 15) {
			layer.tips("不可超过15位!", obj, {
				tips : [ 1, '#78BA32' ],
				tipsMore : true
			});
			obj.attr("is", "false");
		} else {
			obj.attr("is", "true");
		}
	}
};

// 重名验证
function isStudentInfoName(obj) {
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips : [ 1, '#78BA32' ],
			tipsMore : true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 15) {
			layer.tips("不可超过15位!", obj, {
				tips : [ 1, '#78BA32' ],
				tipsMore : true
			});
			obj.attr("is", "false");
		}else{
			var reg = /^[\u4E00-\u9FA5]{2,5}|([a-zA-Z])*[a-zA-Z]$/;
			if (!reg.test(name.val())) {
				layer.tips("姓名格式只能为汉字或英文!", name, {
					tips : [ 1, '#78BA32' ]
				});
				obj.attr("is", "false");
			}
		}
	}
}

// 分数验证
function numberyz(obj) {
	var scogs=/^[1-9]\d*\.\d*|0\.\d*[1-9]\d*|([0-9])*[0-9]$/;
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips : [ 1, '#78BA32' ],
			tipsMore : true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 15) {
			layer.tips("不可超过15位!", obj, {
				tips : [ 1, '#78BA32' ],
				tipsMore : true
			});
			obj.attr("is", "false");
		} else {
			if (scogs.test($.trim(obj.val()))) {
				obj.attr("is", "true");
			} else {
				layer.tips("请输入数字!", obj, {
					tips : [ 1, '#78BA32' ],
					tipsMore : true
				});
				obj.attr("is", "false");
			}
		}
	}
}

// 手机验证
function ihone(obj) {
	var phogs=/^(13+\d{9})|(15+\d{9})|(17+\d{9})|(18+\d{9})|(16+\d{9})$/;
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips : [ 1, '#78BA32' ],
			tipsMore : true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 11) {
			layer.tips("不可超过11位!", obj, {
				tips : [ 1, '#78BA32' ],
				tipsMore : true
			});
			obj.attr("is", "false");
		} else {
			if (phogs.test($.trim(obj.val()))) {
				obj.attr("is", "true");
			} else {
				layer.tips("请输入正确的手机号码!", obj, {
					tips : [ 1, '#78BA32' ],
					tipsMore : true
				});
				obj.attr("is", "false");
			}
		}
	}
}

// 邮箱验证
function emaliyz(obj) {
	var emags = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips : [ 1, '#78BA32' ],
			tipsMore : true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length > 50) {
			layer.tips("不可超过50位!", obj, {
				tips : [ 1, '#78BA32' ],
				tipsMore : true
			});
			obj.attr("is", "false");
		} else {
			if (emags.test($.trim(obj.val()))) {
				obj.attr("is", "true");
			} else {
				layer.tips("格式错误!例如：123@123.com", obj, {
					tips : [ 1, '#78BA32' ],
					tipsMore : true
				});
				obj.attr("is", "false");
			}
		}
	}
}

// 家庭电话验证
function hihone(obj) {
	var hphogs=/^([0-9]+\d{7})|(13+\d{9})|(15+\d{9})|(17+\d{9})|(18+\d{9})|(16+\d{9})$/;
	if ($.trim(obj.val()) === "") {
		layer.tips("不可为空!", obj, {
			tips : [ 1, '#78BA32' ],
			tipsMore : true
		});
		obj.attr("is", "false");
	} else {
		if ($.trim(obj.val()).length != 11 && $.trim(obj.val()).length != 8 ) {
			layer.tips("家庭电话为11位或8位!", obj, {
				tips : [ 1, '#78BA32' ],
				tipsMore : true
			});
			obj.attr("is", "false");
		} else {
			if (hphogs.test($.trim(obj.val()))) {
				obj.attr("is", "true");
			} else {
				layer.tips("请输入正确的电话号码！", obj, {
					tips : [ 1, '#78BA32' ],
					tipsMore : true
				});
				obj.attr("is", "false");
			}
		}
	}
}

$(document).ready(function() {
	var t = $("#gold>.left>ul>li>input");
	if(t.val()===t.defaultValue){
		$(this).css("color", "#000");
	}	
	var t1=$(".text2");
	if(t1.val()===t1.defaultValue){
		$(this).css("color", "#000");
	}
	var cla = $("#gold>.left>ul>li>#c1");
	var name = $("#gold>.left>ul>li>#c2");
	var jyqk = $("#gold>.left>ul>li>#c3");
	var bir = $("#gold>.left>ul>li>#c4");
	var by = $("#gold>.left>ul>li>#c5");
	var col = $("#gold>.left>ul>li>#c6");
	var maj = $("#gold>.left>ul>li>#c7");
	var lb = $("#gold>.left>ul>li>#cate");
	var bj = $("#gold>.left>ul>li>#edbg");
	var lan = $("#gold>.right>ul>li>#a1");
	var lev = $("#gold>.right>ul>li>#a2");
	var sco = $("#gold>.right>ul>li>#a3");
	var lan2 = $("#gold>.right>ul>li>#a4");
	var lev2 = $("#gold>.right>ul>li>#a5");
	var pho = $("#gold>.right>ul>li>#a6");
	var addr = $("#gold>.right>ul>li>#a7");
	var ema = $("#gold>.right>ul>li>#a8");
	var hpho = $("#gold>.right>ul>li>#a9");
	var scogs=/^[1-9]\d*\.\d*|0\.\d*[1-9]\d*|([0-9])*[0-9]$/;
	var bygs=/^(19+\d{2})|(20+\d{2})+.(0\d{1}|1[0-2])+.(0\d{1}|[12]\d{1}|3[01])$/
	var ssex = $("input:radio[name='sex']:checked");
	var reg = /^[\u4E00-\u9FA5]{2,5}|([a-zA-Z])*[a-zA-Z]$/;
	 var phogs=/^(13+\d{9})|(15+\d{9})|(17+\d{9})|(18+\d{9})|(16+\d{9})$/;
	 var hphogs=/^([0-9]+\d{7})$/;
	 var emags=/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	// ----------------------------------按钮事件------------------------------------------
	$(".bottom").click(function() {
		ssex = $("input:radio[name='sex']:checked");
		if (cla.val() === "") {
			layer.tips("班级不能为空!", cla, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (cla.val().length > 15) {
			layer.tips("长度不能大于15!", cla, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (name.val() === "") {
			layer.tips("姓名不能为空!", name, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (name.val().length > 15) {
			layer.tips("长度不能大于15!", name, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (!reg.test(name.val())) {
			layer.tips("姓名格式不正确!", name, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (jyqk.val() === "") {
			layer.tips("就业情况不能为空!", jyqk, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (jyqk.val().length > 15) {
			layer.tips("长度不能大于15!", jyqk, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (bir.val() === "") {
			layer.tips("出生年月不能为空!", bir, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (!bygs.test(bir.val())) {
			layer.tips("时间格式不正确!", bir, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (by.val() === "") {
			layer.tips("毕业时间不能为空!", by, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (!bygs.test(by.val())) {
			layer.tips("时间格式不正确!", by, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (col.val() === "") {
			layer.tips("所在院校不能为空!", col, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (col.val().length > 15) {
			layer.tips("长度不能大于15!", col, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (maj.val() === "") {
			layer.tips("专业不能为空!", maj, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (maj.val().length > 15) {
			layer.tips("长度不能大于15!", maj, {
				tips : [ 1, '#78BA32' ]
			});
		} else

		// --------------------
		if (lan.val() === "") {
			layer.tips("外语语种不能为空!", lan, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (lan.val().length > 15) {
			layer.tips("长度不能大于15!", lan, {
				tips : [ 1, '#78BA32' ]
			});

		} else if (lev.val() === "") {
			layer.tips("级别不能为空!", lev, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (lev.val().length > 15) {
			layer.tips("长度不能大于15!", lev, {
				tips : [ 1, '#78BA32' ]
			});

		} else if (sco.val() === "") {
			layer.tips("分数不能为空!", sco, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (sco.val() > 710 || !scogs.test(sco.val())) {
			layer.tips("分数不正确!", sco, {
				tips : [ 1, '#78BA32' ]
			});

		} else if (lan2.val() === "") {
			layer.tips("第二外语语种不能为空!", lan2, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (lan2.val().length > 15) {
			layer.tips("长度不能大于15!", lan2, {
				tips : [ 1, '#78BA32' ]
			});

		} else if (lev2.val() === "") {
			layer.tips("第二外语级别不能为空!", lev2, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (lev2.val().length > 15) {
			layer.tips("长度不能大于15!", lev2, {
				tips : [ 1, '#78BA32' ]
			});

		} else if (pho.val() === "") {
			layer.tips("手机号码不能为空!", pho, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (pho.val().length != 11) {
			layer.tips("手机号码应为11位!", pho, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (!phogs.test(pho.val())) {
			layer.tips("手机号码格式不正确!", pho, {
				tips : [ 1, '#78BA32' ]
			});

		} else if (addr.val() === "") {
			layer.tips("家庭住址不能为空!", addr, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (addr.val().length > 15) {
			layer.tips("长度不能大于15!", addr, {
				tips : [ 1, '#78BA32' ]
			});

		} else if (ema.val() === "") {
			layer.tips("邮箱不能为空!", ema, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (!emags.test(ema.val())) {
			layer.tips("邮箱格式不正确!", ema, {
				tips : [ 1, '#78BA32' ]
			});

		} else if (hpho.val() === "") {
			layer.tips("家庭电话不能为空!", hpho, {
				tips : [ 1, '#78BA32' ]
			});
		} else if (hpho.val().length != 11 && hpho.val().length != 8) {
			layer.tips("家庭电话格式不正确!", hpho, {
				tips : [ 1, '#78BA32' ]
			});
		} else if ( !hphogs.test(hpho.val())) {
			layer.tips("家庭电话格式不正确!", hpho, {
				tips : [ 1, '#78BA32' ]
			});
		}
		// --------------------------------ajax------------------------------------
		else {
			$.ajax({
				url : 'student_isStudentInfo.action',
				type : 'POST',
				data : {
					"Classes" : cla.val(),
					"Name" : name.val(),
					"Jyqk" : jyqk.val(),
					"Sex" : ssex.val(),
					"Bir" : bir.val(),
					"By" : by.val(),
					"Lb" : lb.val(),
					"Col" : col.val(),
					"Maj" : maj.val(),
					"Bj" : bj.val(),
					"Lan" : lan.val(),
					"Lev" : lev.val(),
					"Sco" : sco.val(),
					"Lan2" : lan2.val(),
					"Lev2" : lev2.val(),
					"Pho" : pho.val(),
					"Addr" : addr.val(),
					"Ema" : ema.val(),
					"Hpho" : hpho.val()
				},
				timeout : 5000,
				dataType : 'text',
				success : function(data, textStatus, jqXHR) {
					if (data == 1) {
						layer.msg('信息存储成功！', {
							shade: 0.3
						});
						i++;
					} else if(data==110){
						layer.msg('检测到异常访问！,3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"student_login.jsp";
						}, 3000);
					}else {
						layer.msg('信息存储失败！', {
							icon : 5
						});
					}
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {
						icon : 5
					});
				}
			});
		}

	});
});
