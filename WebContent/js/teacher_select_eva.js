var src_json
var src_show_page
$(document).ready(function() {
	var a = $("#div1>#top>#top1_1>.top1_3>.lay1");
	var b = $("#div1>#top>#top1_1>.top1_3>.lay2");
	var but1 = $("#div1>#top>#top1_1 .top1_4");
	var but3 = $("#div1>#top>#top1_1 .exl");
	var table=$("#table1");
	var tablecenter=$("#center");
	var tablefoot=$("#tablefoot");
	var uppage=$("#btn2>.page_up");
	var downpage=$("#btn1>.page_up");
	var sumpage=$("#tablefoot>ul>li").eq(2);
	var sumrow=$("#tablefoot>ul>li").eq(3);
	var nowpage=$("#tablefoot>ul>li").eq(4).find(".bage");
	var hrefpag=$("#tablefoot .queding");
	
	//点击查询
	but1.click(function() {
		if (a.val() === ""&&b.val() === "") {
			layer.tips("请输入班级或教师!", a, {
				tips : [ 1, '#78BA32' ]
			});
		} else {
			$.ajax({
				url : 'teacher_selectStudentEva.action',
				type : 'POST',
				data : {
					"className" : a.val(),
					"teacherName":b.val(),
					"newPag":0,
				},
				timeout : 5000, 
				dataType : 'json', 
				success : function(data, textStatus, jqXHR) {
				    if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"teacher_login.jsp";
						}, 3000);
					}else if(data[0].allrow==0){
						layer.msg('您查找的信息不存在！');
					}else {
						tablecenter.stop().fadeOut(100);
						tablefoot.stop().fadeOut(100);
						a.attr("name",data[0].className);
						b.attr("name",data[0].teacherName);
						uppage.attr("is",data[0].isup);
						downpage.attr("is",data[0].isdown);
						sumpage.html("共"+data[0].allpage+"页");
						sumpage.attr("sumpage",data[0].allpage);
						sumrow.html("共"+data[0].allrow+"条记录");
						nowpage.val(data[0].nowpage+1);
						table.attr("pages",data[0].nowpage+1);
						$("#table1 tbody").children().remove();
						$.each(data[0].pagelist,function(index,value) {
							$("#table1 tbody").append('<tr><th>'+(data[0].nowpage*10+1+index)+'</th><th>'+value.student+'</th><th>'+value.teacher+'</th><th>'+value.sumCore+'</th><td style="text-align:center;"><q id="xiangqing" class="q1" rowid="'+index+'">详情</q><q id="shanchu" class="q2" rowid="'+value.id+'">删除</q><q id="dayin" class="q2" rowid="'+value.id+'">打印</q></td></tr>');	
						})
						src_json=data;
						tablecenter.stop().fadeIn(100);
						tablefoot.stop().fadeIn(100);
						autoHeight();
					}	
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});
		}
	});
	
	//点击下一页
	downpage.click(function(){
		if ($(this).attr("is")==="true") {
			$.ajax({
				url : 'teacher_selectStudentEva.action',
				type : 'POST',
				data : {
					"className" : a.attr("name"),
					"teacherName":b.attr("name"),
					"newPag":table.attr("pages"),
				},
				timeout : 5000, 
				dataType : 'json', 
				success : function(data, textStatus, jqXHR) {
					if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"teacher_login.jsp";
						}, 3000);
					}else if(data[0].allrow==0){
						layer.msg('您查找的信息不存在！');
					}else {
						tablecenter.stop().fadeOut(100);
						tablefoot.stop().fadeOut(100);
						a.attr("name",data[0].className);
						b.attr("name",data[0].studentName);
						uppage.attr("is",data[0].isup);
						downpage.attr("is",data[0].isdown);
						sumpage.html("共"+data[0].allpage+"页");
						sumpage.attr("sumpage",data[0].allpage);
						sumrow.html("共"+data[0].allrow+"条记录");
						nowpage.val(data[0].nowpage+1);
						table.attr("pages",data[0].nowpage+1);
						$("#table1 tbody").children().remove();
						$.each(data[0].pagelist,function(index,value) {
							$("#table1 tbody").append('<tr><th>'+(data[0].nowpage*10+1+index)+'</th><th>'+value.student+'</th><th>'+value.teacher+'</th><th>'+value.sumCore+'</th><td style="text-align:center;"><q id="xiangqing" class="q1" rowid="'+index+'">详情</q><q id="shanchu" class="q2" rowid="'+value.id+'">删除</q><q id="dayin" class="q2" rowid="'+value.id+'">打印</q></td></tr>');	
						})
						src_json=data;
						tablecenter.stop().fadeIn(100);
						tablefoot.stop().fadeIn(100);
					}	
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});
		}else {
			layer.msg('亲！已经没有下一页啦！');
		}
	});
	
	//点击上一页
	uppage.click(function(){
		if ($(this).attr("is")==="true") {
			$.ajax({
				url : 'teacher_selectStudentEva.action',
				type : 'POST',
				data : {
					"className" : a.attr("name"),
					"teacherName":b.attr("name"),
					"newPag":table.attr("pages")-2,
				},
				timeout : 5000, 
				dataType : 'json', 
				success : function(data, textStatus, jqXHR) {
					if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"teacher_login.jsp";
						}, 3000);
					}else if(data[0].allrow==0){
						layer.msg('您查找的信息不存在！');
					}else {
						tablecenter.stop().fadeOut(100);
						tablefoot.stop().fadeOut(100);
						a.attr("name",data[0].className);
						b.attr("name",data[0].studentName);
						uppage.attr("is",data[0].isup);
						downpage.attr("is",data[0].isdown);
						sumpage.html("共"+data[0].allpage+"页");
						sumpage.attr("sumpage",data[0].allpage);
						sumrow.html("共"+data[0].allrow+"条记录");
						nowpage.val(data[0].nowpage+1);
						table.attr("pages",data[0].nowpage+1);
						$("#table1 tbody").children().remove();
						$.each(data[0].pagelist,function(index,value) {
							$("#table1 tbody").append('<tr><th>'+(data[0].nowpage*10+1+index)+'</th><th>'+value.student+'</th><th>'+value.teacher+'</th><th>'+value.sumCore+'</th><td style="text-align:center;"><q id="xiangqing" class="q1" rowid="'+index+'">详情</q><q id="shanchu" class="q2" rowid="'+value.id+'">删除</q><q id="dayin" class="q2" rowid="'+value.id+'">打印</q></td></tr>');			
						})
						src_json=data;
						tablecenter.stop().fadeIn(100);
						tablefoot.stop().fadeIn(100);
					}	
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});
		}else {
			layer.msg('亲！已经没有上一页啦！');
		}
	});
	
	//跳转到指定页
	hrefpag.click(function(){
		if (Number($.trim(nowpage.val()))<=Number(sumpage.attr("sumpage"))&&Number($.trim(nowpage.val()))>0) {
			$.ajax({
				url : 'teacher_selectStudentEva.action',
				type : 'POST',
				data : {
					"className" : a.attr("name"),
					"teacherName":b.attr("name"),
					"newPag":Number($.trim(nowpage.val()))-1,
				},
				timeout : 5000, 
				dataType : 'json', 
				success : function(data, textStatus, jqXHR) {
					if(data==110){
						layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
						setTimeout(function(){
								location.href = $("base").attr("href")+"teacher_login.jsp";
						}, 3000);
					}else if(data[0].allrow==0){
						layer.msg('您查找的信息不存在！');
					}else {
						tablecenter.stop().fadeOut(100);
						tablefoot.stop().fadeOut(100);
						a.attr("name",data[0].className);
						b.attr("name",data[0].studentName);
						uppage.attr("is",data[0].isup);
						downpage.attr("is",data[0].isdown);
						sumpage.html("共"+data[0].allpage+"页");
						sumrow.html("共"+data[0].allrow+"条记录");
						sumpage.attr("sumpage",data[0].allpage);
						nowpage.val(data[0].nowpage+1);
						table.attr("pages",data[0].nowpage+1);
						$("#table1 tbody").children().remove();
						$.each(data[0].pagelist,function(index,value) {
							$("#table1 tbody").append('<tr><th>'+(data[0].nowpage*10+1+index)+'</th><th>'+value.student+'</th><th>'+value.teacher+'</th><th>'+value.sumCore+'</th><td style="text-align:center;"><q id="xiangqing" class="q1" rowid="'+index+'">详情</q><q id="shanchu" class="q2" rowid="'+value.id+'">删除</q><q id="dayin" class="q2" rowid="'+value.id+'">打印</q></td></tr>');			
						})
						src_json=data;
						tablecenter.stop().fadeIn(100);
						tablefoot.stop().fadeIn(100);
					}	
				},
				error : function(xhr, textStatus) {
					layer.msg('服务器错误，请稍后再试！', {icon: 5});
				}
			});
		}else {
			layer.msg('没有该页！');
		}
		
	});
	
	//删除教师评价表
	$("#table1").on("click","#shanchu",function(){
		var deletdom=$(this);
		layer.confirm('您确认要删除该条记录？', {
			  btn: ['是的','不是'] //按钮
			}, function(){
				$.ajax({
					url : 'teacher_deleteTeacherEva.action',
					type : 'POST',
					data : {
						"deletRow":deletdom.attr("rowid")
					},
					timeout : 5000, 
					dataType : 'text', 
					success : function(data, textStatus, jqXHR) {
						if(data==1){
							deletdom.closest("tr").remove();
							layer.msg('删除成功！');
						}else if(data==110){
							layer.msg('检测到异常访问，3秒后跳转到登陆页！', {icon:5,shade: 0.3});
							setTimeout(function(){
									location.href = $("base").attr("href")+"student_login.jsp";
							}, 3000);
						}else {
							layer.msg('删除失败！');
						}	
					},
					error : function(xhr, textStatus) {
						layer.msg('服务器错误，请稍后再试！', {icon: 5});
					}
				});
			}, function(){});
	});
	
	//查看学生详情
	$("#table1").on("click","#xiangqing",function(){
		src_show_page=$(this).attr("rowid");
		layer.open({
			  type: 2,
			  area: ['100%', '100%'],
			  id:"99",
			  title :'满意度调查',
			  fixed: true, //不固定
			  maxmin: false,
			  content: 'jsp/teacher/teacher_showTeacherEva.jsp'
			});		
		
	});
	
	//导出exl
	$("#table1").on("click","#dayin",function(){
		var form = $("<form>");
		form.attr("style","display:none");
		form.attr("target","");
		form.attr("method","post");
		form.attr("action","teacher_outTeacherExl.action");
		var input1 = $("<input>");
		input1.attr("type","hidden");
		input1.attr("name","outId");
		input1.attr("value",$(this).attr("rowid"));
		$("body").append(form);
		form.append(input1);
		form.submit();
		form.remove();
	});
	
});