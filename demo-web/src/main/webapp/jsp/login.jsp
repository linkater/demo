<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<form name="login" id="login" action="/demo-web/user/queryUsers" method="post">
		用户名：<input type="text" id="username" name="username" value=""></br>
		密码： <input type="text" id="password" name="password" value=""></br>
		<input type="submit" value="submit">
	</form>
</body>
</html>