<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ホストデータ</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
out.println("こんにちは、"+ request.getParameter("nam") + "さん!");
%>
</body>
</html>