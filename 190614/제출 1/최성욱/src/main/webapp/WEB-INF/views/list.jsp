<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/resources/list.css"
	rel="stylesheet" />

</head>
<body>
    <a href="/signin/input">데이터 입력하기</a>
	<a href="/signin/signin">로그인</a>
	<table>
	<tr>
	<th>idx</th>
	<th>이름</th>
	<th>중간고사</th>
	<th>기말고사</th>
	</tr>
	${list_results}
	</table>
</body>
</html>