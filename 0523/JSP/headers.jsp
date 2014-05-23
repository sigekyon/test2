<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ヘッダ情報</title>
</head>
<body>
<table border="1">
<%
    // リクエストヘッダ名の集合を取得
Enumeration<String> headers = request.getHeaderNames();
    // ヘッダ名を順番に取得、対応するヘッダ値とともに表示
while (headers.hasMoreElements()){
 String name = (String)headers.nextElement();
%>
 <tr valign="top">
 <th><%=name %></th>
 <td><%=request.getHeader(name) %></td>
<% } %>
</table>
</body>
</html>