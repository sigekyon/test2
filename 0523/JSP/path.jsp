<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>リクエストパス</title>
</head>
<body>
<pre>
<%
out.println(request.getScheme());  //http
out.println(request.getServerName());   //localhost
out.println(request.getServerPort());   //8080
out.println(request.getRequestURL());
   //  http://localhost:8080/selfjsp/chap3/path.jsp
out.println(request.getRequestURL());   // /selfjsp/chap3/path.jsp
out.println(request.getContextPath());  // /selfjsp
out.println(request.getServletPath());  // /chap3/path.jsp
out.println(request.getQueryString());  // keyword=WINGS
out.println(request.getPathInfo());   // null
%>
</pre>
</body>
</html>