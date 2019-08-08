<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
</head>
<body>
	<a href="/spring3">목록으로</a>
	
	<form action="update_data" method="get">
	<input type="hidden" name="idx" value="${idx}" />
		<input type="submit" value="입력 완료" />
	</form>
	
	
	


</body>
</html>