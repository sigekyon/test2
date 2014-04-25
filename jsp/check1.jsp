<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>チェックボックス</title>
</head>
<body>
<form method="POST" action="check2.jsp">
あなたがよく使用するサーバサイド技術は？<br />
<input type="checkbox" name="arch" value="JSP&サーブレット" />
JSP&サーブレット
<input type="checkbox" name="arch" value="ASP.NET" />
ASP.NET
<input type="checkbox" name="arch" value="PHP" />
PHP
<input type="submit" value="送信" />
</form>
</body>
</html>