<%@ page contentType="text/html; charset=Windows-31J" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Refresh‰ž“šƒwƒbƒ_</title>
</head>
<body>
<%
response.setIntHeader("Refresh",5);
out.print("Œ»ÝŽž:" + new Date());
%>
</body>
</html>