<%@ page contentType="text/html; charset=UTF-8" import="java.sql.*,javax.naming.*,javax.sql.*,java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>結果セット</title>
</head>
<body>
<table border="1">
<tr>
 <th>名前</th><th>住所</th><th>電話番号</th><th>E-Mailアドレス</th>
</tr>
<%
Connection db = null;
PreparedStatement ps = null;
ResultSet rs = null;
try {
 Context context = new InitialContext();
 DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/selfjsp");
 db = ds.getConnection();
 ps = db.prepareStatement("SELECT * FROM address ORDER BY id");
 rs = ps.executeQuery();
 while(rs.next()) {
%>
 <tr>
  <td><%=rs.getString("name") %></td>
  <td><%=rs.getString("address") %></td>
  <td><%=rs.getString("tel") %></td>
  <td><%=rs.getString("email") %></td>
 </tr>
<%
 }
} catch(Exception e) {
 throw new ServletException(e);
} finally {
 try {
  if(rs != null) {rs.close();}
  if(ps != null) {ps.close();}
  if(db != null) {db.close();}
 } catch(Exception e) {}
}
%>
</table>
</body>
</html>