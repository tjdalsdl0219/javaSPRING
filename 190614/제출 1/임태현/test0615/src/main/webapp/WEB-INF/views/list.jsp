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
	<a href="/test0615/input">데이터 입력하기</a>

	<table>
		<tr>
			<th>idx</th>
			<th>이름</th>
			<th>좋아하는 색</th>
			<th>주소</th>
			<th>생일</th>
			<th>id</th>
			<th>password</th>
			<th>수정하기</th>
		</tr>
		${select_result}
	</table>
</body>

</html>
