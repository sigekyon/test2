<%@ page contentType="text/html; charset=UTF-8" import="java.sql.*, javax.naming.*, javax.sql.*, java.text.*" %>
<%
request.setCharacterEncoding("UTF-8");
int cnt = Integer.parseInt(request.getParameter("cnt"));
Connection db = null;
PreparedStatement ps =null;
try {
 Context context = new InitialContext();
 DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/selfjsp");
 db = ds.getConnection();
 db.setAutoCommit(false);
 ps = db.prepareStatement("UPDATE book SET title=? ,price=? ,publish=? ,published=? ,WHERE isbn=?");
 for(int i=1; i <= cnt; i++) {
  ps.setString(1,request.getParameter("title" + i));
  ps.setString(2,request.getParameter("price" + i));
  ps.setString(3,request.getParameter("publish" + i));
  ps.setString(4,request.getParameter("published" + i));
  ps.setString(5,request.getParameter("isbn" + i));
  ps.executeUpdate();
 }
 db.commit();
 } catch(Exception e) {
 db.rollback();
 throw new ServletException(e);
 } finally {
 try {
  if(ps != null) {ps.close();}
  if(db != null) {db.close();}
 } catch(Exception e) {}
}
response.sendRedirect("book_update1.jsp");
%>