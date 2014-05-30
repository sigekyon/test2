<%@ page contentType="text/html; charset=UTF-8" import="java.sql.*, javax.naming.*, javax.sql.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>結果セット</title>
</head>
<body>
<table border="1">
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
  ResultSetMetaData meta = rs.getMetaData();
  out.println("<tr>");
  for(int i = 1;i <= meta.getColumnCount(); i++) {
   out.println("<th>" + meta.getColumnName(i) + "</th>");
  }
  out.println("</tr>");
  while(rs.next()) {
   out.println("<tr>");
   for(int i = 1;i <= meta.getColumnCount(); i++) {
    out.println("<td>" + rs.getString(i) + "</td>");
   }
   out.println("</tr>");
  }
 } catch(Exception e) {
  throw new ServletException(e);
 }finally {
  try {
   if(rs != null) {rs.close();}
   if(ps != null) {ps.close();}
   if(db != null) {db.close();}
  }catch(Exception e) {}
 }
 %>
 </table>
 </body>
 </html>