<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>�w�b�_���</title>
</head>
<body>
<table border="1">
<%
    // ���N�G�X�g�w�b�_���̏W�����擾
Enumeration<String> headers = request.getHeaderNames();
    // �w�b�_�������ԂɎ擾�A�Ή�����w�b�_�l�ƂƂ��ɕ\��
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