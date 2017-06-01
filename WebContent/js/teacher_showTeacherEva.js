$(document).ready(function () {
	var a1=parent.src_json[0].pagelist[parent.src_show_page].perQuality.split('#src#');
	var a11=parent.src_json[0].pagelist[parent.src_show_page].perQualityActual.split('#src#');
	var a2=parent.src_json[0].pagelist[parent.src_show_page].teachAttitude.split('#src#');
	var a22=parent.src_json[0].pagelist[parent.src_show_page].teachAttitudeActual.split('#src#');
	var a3=parent.src_json[0].pagelist[parent.src_show_page].teachLevel.split('#src#');
	var a33=parent.src_json[0].pagelist[parent.src_show_page].teachLevelActual.split('#src#');
	
	$("#student_pj tbody input").eq(0).val(parent.src_json[0].pagelist[parent.src_show_page].classes);
	$("#student_pj tbody input").eq(1).val(parent.src_json[0].pagelist[parent.src_show_page].teacher);
	$("#student_pj tbody input").eq(2).val(parent.src_json[0].pagelist[parent.src_show_page].course);
	$("#student_pj tbody input").eq(3).val(a1[0]);
	$("#student_pj tbody input").eq(4).val(a11[0]);
	$("#student_pj tbody input").eq(5).val(a1[1]);
	$("#student_pj tbody input").eq(6).val(a11[1]);
	$("#student_pj tbody input").eq(7).val(a1[2]);
	$("#student_pj tbody input").eq(8).val(a11[2]);
	$("#student_pj tbody input").eq(9).val(a2[0]);
	$("#student_pj tbody input").eq(10).val(a22[0]);
	$("#student_pj tbody input").eq(11).val(a2[1]);
	$("#student_pj tbody input").eq(12).val(a22[1]);
	$("#student_pj tbody input").eq(13).val(a2[2]);
	$("#student_pj tbody input").eq(14).val(a22[2]);
	$("#student_pj tbody input").eq(15).val(a2[3]);
	$("#student_pj tbody input").eq(16).val(a22[3]);
	$("#student_pj tbody input").eq(17).val(a2[4]);
	$("#student_pj tbody input").eq(18).val(a22[4]);
	$("#student_pj tbody input").eq(19).val(a2[5]);
	$("#student_pj tbody input").eq(20).val(a22[5]);
	$("#student_pj tbody input").eq(21).val(a2[6]);
	$("#student_pj tbody input").eq(22).val(a22[6]);
	$("#student_pj tbody input").eq(23).val(a2[7]);
	$("#student_pj tbody input").eq(24).val(a22[7]);
	$("#student_pj tbody input").eq(25).val(a3[0]);
	$("#student_pj tbody input").eq(26).val(a33[0]);
	$("#student_pj tbody input").eq(27).val(a3[1]);
	$("#student_pj tbody input").eq(28).val(a33[1]);
	$("#student_pj tbody input").eq(29).val(a3[2]);
	$("#student_pj tbody input").eq(30).val(a33[2]);
	$("#student_pj tbody input").eq(31).val(a3[3]);
	$("#student_pj tbody input").eq(32).val(a33[3]);
	$("#student_pj tbody input").eq(33).val(a3[4]);
	$("#student_pj tbody input").eq(34).val(a33[4]);
	$("#student_pj tbody input").eq(35).val(a3[5]);
	$("#student_pj tbody input").eq(36).val(a33[5]);
	$("#student_pj tbody textarea").eq(0).val(parent.src_json[0].pagelist[parent.src_show_page].idea1);
	$("#student_pj tbody textarea").eq(1).val(parent.src_json[0].pagelist[parent.src_show_page].idea2);
	$("#student_pj tbody textarea").eq(2).val(parent.src_json[0].pagelist[parent.src_show_page].idea3);
	$("#student_pj tbody textarea").eq(3).val(parent.src_json[0].pagelist[parent.src_show_page].logistics1);
	$("#student_pj tbody textarea").eq(4).val(parent.src_json[0].pagelist[parent.src_show_page].logistics2);
	$("#student_pj tbody textarea").eq(5).val(parent.src_json[0].pagelist[parent.src_show_page].logistics3);
	$("#student_pj tbody textarea").eq(6).val(parent.src_json[0].pagelist[parent.src_show_page].logistics4);
	$("#title").html("讲师授课效果评价表_总分"+parent.src_json[0].pagelist[parent.src_show_page].sumCore);
	$("#date").html("日期："+parent.src_json[0].pagelist[parent.src_show_page].date);
	var close = $("#student_pj .button1");
	var index = parent.layer.getFrameIndex(window.name);

	$("input,textarea").attr("disabled", "disabled");

	close.click(function () {
		parent.layer.close(index);
	});

});
