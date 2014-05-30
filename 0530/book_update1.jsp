<%@ page contentType="text/html; charset=UTF-8" import="java.sql.*, javax.naming.*, javax.sql.*, java.text.*" %>
<form method="POST" action="book_update2.jsp">
<input type="submit" value="更新" />
<table border="1">
<tr>
  <th>書名</th><th>価格</th><th>出版社</th><th>刊行年月日</th>
</tr>
<%
int cnt = 0;
Connection db = null;
PreparedStatement ps = null;
ResultSet rs = null;
try {
  Context context = new InitialContext();
  DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/selfjsp");
  db = ds.getConnection();
  ps = db.prepareStatement("SELECT * FROM book ORDER BY published DESC");
  rs = ps.executeQuery();
  while(rs.next()) {
  cnt++;
%>
 <tr>
  <td>
   <input type="hidden" name="isbn<%=cnt %>" value="<%=rs.getString("isbn")%>" />
   <input type="text" name="title<%=cnt %>" size="50" value="<%=rs.getString("title")%>" />
  </td>
  <td>
   <input type="text" name="price<%=cnt %>" size="5" value="<%=rs.getString("price")%>" />
  </td>
  <td>
   <input type="text" name="publish"<%=cnt %>" value="<%=rs.getString("publish")%>" />
  </td>
  <td>
   <input type="text" name="published"<%=cnt %>" value="<%=rs.getString("published")%>" />
  </td>
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
<input type="hidden" name="cnt" value="<%=cnt %>" />
</form>