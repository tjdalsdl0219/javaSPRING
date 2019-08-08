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
	<form action="update_data" method="get">
		<input type="hidden" name="idx" value="${idx_value}" />
		<label>ID</label> <input type="text" placeholder="ID입력" name="id" value="${id_value}" />
		<label>PASS</label> <input type="text" placeholder="PASS입력" name="pass" value="${pass_value}" />
		<label>이름</label> <input type="text" placeholder="이름입력" name="name" value="${name_value}" />
		<label>주소</label> <input type="text" placeholder="주소" name="address" value="${address_value}" />
		<label>생일</label> <input type="text"  placeholder="생일" name="birthday" value="${birth_value}"/>
		<label>좋아하는 색상</label> <input type="text" placeholder="좋아하는 색상" name="favoriteColor" value="${color_value}" />
		<input type="submit"  value="입력 완료" />
	</form>
</body>

</html>
