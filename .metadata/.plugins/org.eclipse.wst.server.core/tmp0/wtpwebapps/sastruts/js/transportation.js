$(document).ready(function() {

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