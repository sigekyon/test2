<%@ page contentType="text/html; charset=Windows-31J" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Refresh応答ヘッダ</title>
</head>
<body>
<%
response.setIntHeader("Refresh",5);
out.print("現在時刻:" + new Date());
%>
</body>
</html>