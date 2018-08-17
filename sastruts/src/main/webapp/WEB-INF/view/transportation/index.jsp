<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/jquery-ui.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/i18n/jquery.ui.datepicker-ja.min.js"></script>
<link rel="stylesheet"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/redmond/jquery-ui.css">
<link rel="stylesheet" type="text/css"
	href="/sastruts/css/transportation.css" />
<script type="text/javascript" src="/sastruts/js/transportation.js"></script>
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
							<td id=lastDate><input type="text" name="writeDate"
								value="${getTransportationDto[0].lastDate}" class="datepicker" /></td>
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
									<option value=""></option>
									<c:forEach items="${departmentList}" var="i">
										<option value="${i}">${i}</option>
									</c:forEach>
							</select></td>
						</tr>
						<tr>
							<th>名前</th>
							<td class="Department"><select name="name" id="employee">
									<c:forEach items="${employeeList}" var="i">
										<option value="${i.department},${i.name}" class="name">${i.name}</option>
									</c:forEach>
							</select></td>
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

						<c:forEach items="${getTransportationDto}" var="i">
							<tr>
								<td class=mainTd><input type="text" name="boardingDate"
									value="${f:h(i.boardingDate)}" class="datepicker"/></td>
								<td class=mainTd><input type="text" name="destination"
									value="${f:h(i.destination)}" /></td>
								<td class=type><select name="type">
										<c:if test="${f:h(i.type)=='A'}">
											<option value="A" selected="selected">A</option>
											<option value="B">B</option>
											<option value="C">C</option>
										</c:if>
										<c:if test="${f:h(i.type)=='B'}">
											<option value="A">A</option>
											<option value="B" selected="selected">B</option>
											<option value="C">C</option>
										</c:if>
										<c:if test="${f:h(i.type)=='C'}">
											<option value="A">A</option>
											<option value="B">B</option>
											<option value="C" selected="selected">C</option>
										</c:if>
								</select></td>
								<td class=mainTd><input type="text" name="departure"
									value="${f:h(i.departure)}"></td>
								<td class=mainTd><select name="arrow">
										<c:if test="${f:h(i.arrow)=='→'}">
											<option value="→" selected="selected">→</option>
											<option value="←">←</option>
											<option value="⇔">⇔</option>
										</c:if>
										<c:if test="${f:h(i.arrow)=='←'}">
											<option value="→">→</option>
											<option value="←" selected="selected">←</option>
											<option value="⇔">⇔</option>
										</c:if>
										<c:if test="${f:h(i.arrow)=='⇔'}">
											<option value="→">→</option>
											<option value="←">←</option>
											<option value="⇔" selected="selected">⇔</option>
										</c:if>
								</select></td>
								<td class=mainTd><input type="text"
									name="destinationStation" value="${f:h(i.destinationStation)}" /></td>
								<td class=mainMoney><input type="text" name="money"
									value="${f:h(i.money)}" /></td>
								<td class=mainTd><input type="text" name="remarks"
									value="${f:h(i.remarks)}" /></td>
							</tr>
						</c:forEach>
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
					<p>合計：</p>
					<p id=total></p> <br /> <html:image
						src="/sastruts/image/confirmBtn.png" property="confirm" value="確認" />
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>