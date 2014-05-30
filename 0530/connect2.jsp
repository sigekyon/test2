<%@ page contentType="text/html;charset=UTF-8" import="java.sql.*, javax.naming.*, javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>データベースへの接続</title>
</head>
<body>
<%
Connection db = null;
try{
    Context context = new InitialContext();
    DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/selfjsp");
    db = ds.getConnection();
} catch (Exception e) {
  throw new ServletException(e);
} finally {
  try{
    if(db != null) {db.close();}
  } catch(Exception e) {}
}
%>
データベースへの接続に成功しました。
</body>
</html>