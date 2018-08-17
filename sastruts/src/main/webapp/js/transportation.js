$(document).ready(function() {

	// カレンダーポップアップを表示させる
	$("#datepicker").datepicker();
	$("#datepicker").datepicker("option", "showOn", 'button');
	$("#datepicker").datepicker("option", "buttonImageOnly", true);
	$("#datepicker").datepicker("option", "buttonImage", '/sastruts/image/calendarIcon.png');

	// 選択された部署名によって名前を変える
	localStorage.foo = $(".name").val();

	$('[name="department"]').change(function() {
		var selectDepartment = $('[name=department]').val();

		$(".name").each(function() {
			if ($(this).val().match(selectDepartment)) {
				var departmentname = $(this).val();
				var name = departmentname.split(",");

				$(".name").remove();
				$("#employee").append("<option value="+departmentname+">"+name[1]+"</option>")
			}
		});
	});

	// 合計金額を計算して表示する
	var total = 0;
	var i = 0;

	$(".mainMoney").each(function() {
		var money = $('input[name="money"]').val();
		// 文字列→数値型に変換して計算
		total = total + Number(money);
	});

	$("#total").html(total + "円");
});
