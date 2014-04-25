<%@ page contentType="text/html;charset=UTF-8" %>
<%! String msg = "おやすみなさい"; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title><%=msg %></title>
</head>
<body>
<%--指定された文字列を繰り返し表示--%>
<%
for(int i = 0;i < 10; i++){
	out.println(msg + "<br />");
}
%>
</body>
</html>