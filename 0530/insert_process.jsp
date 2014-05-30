<%@ page contentType="text/html; charset=UTF-8" import="java.sql.*,javax.naming.*,javax.sql.*" %>
<%
request.setCharacterEncoding("UTF-8");
Connection db = null;
PreparedStatement ps = null;
try{
 Context context = new InitialContext();
 DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/selfjsp");
 db = ds.getConnection();
 ps = db.prepareStatement("INSERT INTO address(name,address,tel,email) VALUES(?,?,?,?)");
 ps.setString(1,request.getParameter("name"));
 ps.setString(2,request.getParameter("address"));
 ps.setString(3,request.getParameter("tel"));
 ps.setString(4,request.getParameter("email"));
 ps.executeUpdate();
} catch(Exception e) {
 throw new ServletException(e);
} finally {
 try {
  if(ps != null) {ps.close();}
  if(db != null) {db.close();}
 } catch(Exception e) {}
}

response.sendRedirect("insert_form.jsp");
%>