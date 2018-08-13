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
	<table border=1>
		<tr>
			<td>
				<table id=date>
					<tr>
						<th>日付</th>
						<td>2018/07/31</td>
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
						<td class="Department">企画開発部</td>
					</tr>
					<tr>
						<th>名前</th>
						<td class="Department">小川</td>
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
						<td class=mainTd>2018/7/13</td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
					<tr>
					<tr>
						<td class=mainTd>2018/7/13</td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
					<tr>
					<tr>
						<td class=mainTd>2018/7/17</td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
						<td class=mainTd></td>
					<tr>
				</table> <br /></td>
		</tr>
		<tr>
			<td colspan="3" align="right">
				<table>
					<tr>
						<th width="100px">電車</th>
						<td class="moneyTd"></td>
					</tr>
					<tr>
						<th>タクシー</th>
						<td class="moneyTd"></td>
					</tr>
					<tr>
						<th>バス</th>
						<td class="moneyTd"></td>
					</tr>
				</table>
				<p>合計</p> <s:link href="/transportation/confirm">
					<img src="\sastruts\image\confirmBtn.png" />
				</s:link>
			</td>
		</tr>
	</table>
</body>
</html>