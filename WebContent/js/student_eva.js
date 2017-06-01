$(document).ready(function() {
	var tijiao = $("#student_pj .button1");

	tijiao.click(function() {
		var isOpen = true;
		$("input[type='text']").each(function() {
			if ($(this).val() == "") {
				isOpen = false;
				return;
			}
		})

		if (isOpen) {
			$.ajax({
				url : 'student_saveTeacherEva.action',
				type : 'post',
				data : {
					"a1" : $("#student_pj tbody input").eq(0).val(),
					"a2" : $("#student_pj tbody input").eq(1).val(),
					"a3" : $("#student_pj tbody input").eq(2).val(),
					"a4" : $("#student_pj tbody input").eq(3).val(),
					"a5" : $("#student_pj tbody input").eq(4).val(),
					"a6" : $("#student_pj tbody input").eq(5).val(),
					"a7" : $("#student_pj tbody input").eq(6).val(),
					"a8" : $("#student_pj tbody input").eq(7).val(),
					"a9" : $("#student_pj tbody input").eq(8).val(),
					"a10" : $("#student_pj tbody input").eq(9).val(),
					"a11" : $("#student_pj tbody input").eq(10).val(),
					"a12" : $("#student_pj tbody input").eq(11).val(),
					"a13" : $("#student_pj tbody input").eq(12).val(),
					"a14" : $("#student_pj tbody input").eq(13).val(),
					"a15" : $("#student_pj tbody input").eq(14).val(),
					"a16" : $("#student_pj tbody input").eq(15).val(),
					"a17" : $("#student_pj tbody input").eq(16).val(),
					"a18" : $("#student_pj tbody input").eq(17).val(),
					"a19" : $("#student_pj tbody input").eq(18).val(),
					"a20" : $("#student_pj tbody input").eq(19).val(),
					"a21" : $("#student_pj tbody input").eq(20).val(),
					"a22" : $("#student_pj tbody input").eq(21).val(),
					"a23" : $("#student_pj tbody input").eq(22).val(),
					"a24" : $("#student_pj tbody input").eq(23).val(),
					"a25" : $("#student_pj tbody input").eq(24).val(),
					"a26" : $("#student_pj tbody input").eq(25).val(),
					"a27" : $("#student_pj tbody input").eq(26).val(),
					"a28" : $("#student_pj tbody input").eq(27).val(),
					"a29" : $("#student_pj tbody input").eq(28).val(),
					"a30" : $("#student_pj tbody input").eq(29).val(),
					"a31" : $("#student_pj tbody input").eq(30).val(),
					"a32" : $("#student_pj tbody input").eq(31).val(),
					"a33" : $("#student_pj tbody input").eq(32).val(),
					"a34" : $("#student_pj tbody input").eq(33).val(),
					"a35" : $("#student_pj tbody input").eq(34).val(),
					"a36" : $("#student_pj tbody input").eq(35).val(),
					"a37" : $("#student_pj tbody input").eq(36).val(),
					"a38" : $("#student_pj tbody textarea").eq(0).val(),
					"a39" : $("#student_pj tbody textarea").eq(1).val(),
					"a40" : $("#student_pj tbody textarea").eq(2).val(),
					"a41" : $("#student_pj tbody textarea").eq(3).val(),
					"a42" : $("#student_pj tbody textarea").eq(4).val(),
					"a43" : $("#student_pj tbody textarea").eq(5).val(),
					"a44" : $("#student_pj tbody textarea").eq(6).val(),
				},
				timeout : 5000,
				dataType : 'text',
				success : function(data, textStatus, jqXHR) {
					if (data == 1) {
						layer.msg('提交成功！', {
							shade : 0.3
						});
					} else if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon: 5,shade: 0.3});
						setTimeout(function(){
							location.href = $("base").attr("href")+"student_login.jsp";
						}, 3000);
					}else{
						layer.msg('提交失败！', {
							shade : 0.3
						});
					}
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});
		}else {
			layer.msg('请补全信息！');
		}
	});

});