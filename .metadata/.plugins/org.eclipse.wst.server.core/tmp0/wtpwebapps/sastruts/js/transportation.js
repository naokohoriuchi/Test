$(document).ready(function() {

	// 合計金額を計算して表示する
	var total = 0;
	var i = 0;

	$(".mainMoney").each(function() {
		// 文字列→数値型に変換して計算
		total = total + Number($(this).text());
	});

	$("#total").html(total + "円");
});