<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
	href="/sastruts/css/transportation.css" />
<title>確認画面</title>
</head>
<body>
<body>
	<s:form>
		<table border=1>
			<tr>
				<td>
					<table id=date>
						<tr>
							<th>日付</th>
							<td>${dspTransportationDto.writeDate}</td>
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
							<td class="Department">${dspTransportationDto.department}</td>
						</tr>
						<tr>
							<th>名前</th>
							<td class="Department">${dspTransportationDto.name}</td>
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
						<c:forEach items="${dspTransportationDto.boardingDateList}"
							var="boardingDate">
							<c:forEach items="${dspTransportationDto.destinationList}"
								var="destination">
								<c:forEach items="${dspTransportationDto.typeList}" var="type">
									<c:forEach items="${dspTransportationDto.departureList}"
										var="departure">
										<c:forEach items="${dspTransportationDto.arrowList}"
											var="arrow">
											<c:forEach
												items="${dspTransportationDto.destinationStationList}"
												var="destinationStation">
												<c:forEach items="${dspTransportationDto.moneyList}"
													var="money">
													<c:forEach items="${dspTransportationDto.remarksList}"
														var="remarksList">
														<tr>
															<td class=mainTd>${f:h(boardingDate)}</td>
															<td class=mainTd>${f:h(destination)}</td>
															<td class=mainTd>${f:h(type)}</td>
															<td class=mainTd>${f:h(departure)}</td>
															<td class=mainTd>${f:h(arrow)}</td>
															<td class=mainTd>${f:h(destinationStation)}</td>
															<td class=mainTd>${f:h(money)}</td>
															<td class=mainTd>${f:h(remarksList)}</td>
														</tr>
													</c:forEach>
												</c:forEach>
											</c:forEach>
										</c:forEach>
									</c:forEach>
								</c:forEach>
							</c:forEach>
						</c:forEach>
						<tr>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
							<td class=mainTd></td>
						<tr>
						<tr>
							<td class=mainTd></td>
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
					<p>合計：${dspTransportationDto.total}</p> <html:image
						src="/sastruts/image/completeBtn.png" property="complete" value="確認" />
				</td>
			</tr>
		</table>
	</s:form>
</body>

</html>