<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ホストデータ</title>
</head>
<body>
選択されたのは、
<%
request.setCharacterEncoding("UTF-8");
String[] archs = request.getParameterValues("arch");
String result = "";
for(String arch : archs){
	result += arch + "&nbsp;";
}
out.print(result);
%>
です。
</body>
</html>