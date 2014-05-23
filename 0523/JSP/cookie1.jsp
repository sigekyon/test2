<%@ page contentType="text/html; charset=UTF-8" import="java.net.*" %>
<%
String email = "";
    // クッキー情報を取得
Cookie[] cookies = request.getCookies();
    // クッキー情報が空でない場合にのみ、配下の処理を実行
if(cookies != null){
    // クッキー配列の内容を順に走査
  for(Cookie cook : cookies){
    // クッキーの名前が「email」である場合に、その値を取得
    if(cook.getName().equals("email")){
      email = URLDecoder.decode(cook.getValue(),"UTF-8");
        break;
       }
     }
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset = "UTF-8" />
<title>クッキー情報</title>
</head>
<body>
<form method = "POST" action = "cookie2.jsp">
メールアドレス：
<input type = "text" name = "email" size = "40" value = "<%=email %>" />
<input type = "submit" value = "送信" />
</form>
</body>
</html>