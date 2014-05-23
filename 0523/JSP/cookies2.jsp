<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>クッキー情報</title>
</head>
<body>
<%
Cookie cook = new Cookie("email",request.getParameter("email"));
cook.setMaxAge(60*60*24*180);
response.addCookie(cook);
%>
クッキーが保存されました。
</body>
</html>