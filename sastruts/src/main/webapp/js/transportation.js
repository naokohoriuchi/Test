$(document).ready(function() {

	// カレンダーポップアップを表示させる
	$(".datepicker").datepicker();
	$(".datepicker").datepicker("option", "showOn", 'button');
	$(".datepicker").datepicker("option", "buttonImageOnly", true);
	$(".datepicker").datepicker("option", "buttonImage", '/sastruts/image/calendarIcon.png');

	// 選択された部署名によって名前を変える
	var システム開発部1課 = {
	    value: "梅野"
	};

	var システム開発部2課 = {
		value: "田中"
	};

	var 企画開発部 = {
		value: "小川"
	};

	localStorage.setItem("system1", JSON.stringify(システム開発部1課));
	localStorage.setItem("system2", JSON.stringify(システム開発部2課));
	localStorage.setItem("other", JSON.stringify(企画開発部));

	$('[name="department"]').change(function() {
		var selectDepartment = $('[name=department]').val();
		$('.name').remove();

		if (selectDepartment == "システム開発部1課") {
			var json = JSON.parse(localStorage.getItem("system1"));
			$("#employee").append("<option value="+selectDepartment+" class="+"name"+">"+json.value+"</option>");
		}else if(selectDepartment == "システム開発部2課") {
			var json = JSON.parse(localStorage.getItem("system2"));
			$("#employee").append("<option value="+selectDepartment+" class="+"name"+">"+json.value+"</option>");
		}else {
			var json = JSON.parse(localStorage.getItem("other"));
			$("#employee").append("<option value="+selectDepartment+" class="+"name"+">"+json.value+"</option>");
		}
	});

});
