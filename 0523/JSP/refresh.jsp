<%@ page contentType="text/html; charset=Windows-31J" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Refresh�����w�b�_</title>
</head>
<body>
<%
response.setIntHeader("Refresh",5);
out.print("���ݎ���:" + new Date());
%>
</body>
</html>