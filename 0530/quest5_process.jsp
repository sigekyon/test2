<%@ page contentType="text/html; charset=UTF-8" import="java.sql.*, javax.naming.*, javax.sql.*" %>
<%
request.setCharacterEncoding("UTF-8");
Connection db = null;
PreparedStatement ps = null;
try {
  Context context = new InitialContext();
  DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/selfjsp");
  db = ds.getConnection();
  ps = db.prepareStatement("INSERT INTO book(isbn,title,price,publish,published) VALUES(? ,? ,? ,? ,?)");
  ps.setString(1,request.getParameter("isbn"));
  ps.setString(2,request.getParameter("title"));
  ps.setString(3,request.getParameter("price"));
  ps.setString(4,request.getParameter("publish"));
  ps.setString(5,request.getParameter("published"));
  ps.executeUpdate();
} catch(Exception e) {
 throw new ServletException(e);
} finally {
 try {
  if(ps != null) {ps.close();}
  if(db != null) {db.close();}
 } catch(Exception e){}
}
response.sendRedirect("quest5_form.jsp");
%>