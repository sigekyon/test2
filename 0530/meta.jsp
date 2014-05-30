<%@ page contentType="text/html;charset=UTF-8" import="java.sql.*,javax.naming.*,javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>メタデータ</title>
</head>
<body>
<dl>
<%
Connection db = null;
ResultSet rs1 = null;
ResultSet rs2 = null;
try {
  Context ctx=new InitialContext();
  DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/selfjsp");
  db=ds.getConnection();
  DatabaseMetaData meta = db.getMetaData();
  rs1 = meta.getTables("selfjsp","%","%",null);
  while(rs1.next()){
   String table = rs1.getString("TABLE_NAME");
   out.println("<dt>" + table + "テーブル</dt>");
   out.println("<table border='1'>");
   out.println("<tr>");
   out.println("<th>フィールド名</th><th>データ型</th><th>桁数</th></tr>");
   rs2 = meta.getColumns("selfjsp",null,table,"%");
   while(rs2.next()){
    out.println("<tr>");
    out.println("<td>" + rs2.getString("COLUMN_NAME") + "</td>");
    out.println("<td>" + rs2.getString("TYPE_NAME") + "</td>");
    out.println("<td align='right'>" + rs2.getString("COLUMN_SIZE") + "</td>");
    out.println("</tr>");
   }
   out.println("</table>");
   out.println("<hr />");
  }
 } catch(Exception e) {
  throw new ServletException(e);
 } finally {
  try {
   if(rs1 != null){rs1.close();}
   if(rs2 != null){rs2.close();}
   if(db != null){db.close();}
  } catch(Exception e) {}
 }
 %>
 </dl>
 </body>
 </html>