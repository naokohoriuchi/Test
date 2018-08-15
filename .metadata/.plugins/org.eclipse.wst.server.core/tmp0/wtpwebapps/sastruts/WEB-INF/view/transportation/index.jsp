<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/sastruts/css/transportation.css" />
<title>初期画面</title>
</head>

<body>
	<s:form>
		<table border=1>
			<tr>
				<td>
					<table id=date>
						<tr>
							<th>日付</th>
							<td><input type="text" name="writeDate"></td>
						</tr>
					</table>
				</td>
				<td>
					<p>凡例 A：電車 B：タクシー C：バス</p>
				</td>
				<td>
					<table>
						<tr>
							<th>部署</th>
							<td class="Department"><select name="department">
									<option value="システム開発部1課">システム開発部1課</option>
									<option value="システム開発部2課">システム開発部2課</option>
									<option value="企画開発部">企画開発部</option>
							</select></td>
						</tr>
						<tr>
							<th>名前</th>
							<td class="Department"><input type="text" name="name"></td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="3"><br />
					<table class="main">
						<tr>
							<th width="12.5%">日付</th>
							<th width="12.5%">行き先</th>
							<th width="12.5%">乗車別</th>
							<th width="12.5%">出発地</th>
							<th width="12.5%">-</th>
							<th width="12.5%">目的地</th>
							<th width="12.5%">金額</th>
							<th width="12.5%">備考</th>
						</tr>
						<tr>
							<td class=mainTd><input type="text" name="boardingDate"></td>
							<td class=mainTd><input type="text" name="destination"></td>
							<td class=mainTd><select name="type">
									<option value="A">A</option>
									<option value="B">B</option>
									<option value="C">C</option>
							</select></td>
							<td class=mainTd><input type="text" name="departure"></td>
							<td class=mainTd><select name="arrow">
									<option value="→">→</option>
									<option value="←">←</option>
									<option value="⇔">⇔</option>
							</select></td>
							<td class=mainTd><input type="text"
								name="destinationStation"></td>
							<td class=mainTd><input type="text" name="money"></td>
							<td class=mainTd><input type="text" name="remarks"></td>
						</tr>
						<tr>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
						</tr>
						<tr>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
						</tr>
					</table> <br /></td>
			</tr>
			<tr>
				<td colspan="3" align="right">
					<table>
						<tr>
							<th width="100px">電車</th>
							<td class="moneyTd"><input type="text" name=""></td>
						</tr>
						<tr>
							<th>タクシー</th>
							<td class="moneyTd"><input type="text" name=""></td>
						</tr>
						<tr>
							<th>バス</th>
							<td class="moneyTd"><input type="text" name=""></td>
						</tr>
					</table>
					<p>
						合計：<input type="text" name="total">
					</p> <br /> <html:image src="/sastruts/image/confirmBtn.png"
						property="confirm" value="確認" />
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>