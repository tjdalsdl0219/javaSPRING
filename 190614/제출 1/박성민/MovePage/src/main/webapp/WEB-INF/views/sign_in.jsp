<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">

<head>
<title>rune</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/sign_in.css" />
</head>

<body>
  <div class="wrap">
    <div class="login_content">
      <div class="logo_sec">
        <h3>로그인</h3>
        <a href="/myapp/">목록으로</a>
      </div>
      <form class="login_sec" action="/myapp/done">
        <input type="text" placeholder="아이디" class="login_input" required="required" name="id" />
        <input type="password" placeholder="패스워드" class="login_input" required="required" name="password" />
        <input type="submit" class="login_btn" value="확인" />
      </form>
    </div>
  </div>
</body>

</html>