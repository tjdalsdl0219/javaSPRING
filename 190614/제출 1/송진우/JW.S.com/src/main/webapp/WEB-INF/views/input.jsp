<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>데이터 입력</title>
<link href="${pageContext.request.contextPath}/resources/input.css"
	rel="stylesheet" />
</head>

<body>
	<a href="/com">목록으로</a>
	<form action="input_data" method="get">
		<label>ID</label> <input type="text"  placeholder="ID" name="id" />
		<label>PASS</label> <input type="text"  placeholder="PASS" name="pass" />
		<label>이름</label> <input type="text"  placeholder="이름입력" name="name" />
		<label>주소</label> <input type="text"  placeholder="주소" name="address" />
		<label>생일</label> <input type="text"  placeholder="생일" name="birthday"/>
		<label>좋아하는 색상</label> <input type="text" placeholder="좋아하는 색상" name="favoriteColor" />
		<input type="submit" value="입력 완료" />
	</form>
</body>

</html>
