<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>DataBase Sample</title>

<link href="${pageContext.request.contextPath}/resources/list.css"
	rel="stylesheet" />
</head>

<body>
	<div id="resultArea"></div>
	<table>
		<tr>
			<th>idx</th>
			<th>이름</th>
			<th>공격력</th>
			<th>방어력</th>
			<th>공격확률</th>
			<th>방어확률</th>
			<th>HP</th>
			<th>게임 수</th>
			<th>승리</th>
			<th>패배</th>
		</tr>
		${selected_user_1}
	</table>

	<table>
		<tr>
			<th>idx</th>
			<th>이름</th>
			<th>공격력</th>
			<th>방어력</th>
			<th>공격확률</th>
			<th>방어확률</th>
			<th>HP</th>
			<th>게임 수</th>
			<th>승리</th>
			<th>패배</th>
		</tr>
		${selected_user_2}
	</table>

	<input type="button" id="turnBtn" value="턴 진행" />
	<a href="/battle/done">끝~</a>
</body>

</html>
