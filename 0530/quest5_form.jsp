<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>書籍情報の登録</title>
</head>
<body>
<form method="POST" action="guest5_process.jsp">
<table border="0">
  <tr>
   <th align="right">ISBNコード</th>
   <td><input type="text" name="isbn" size="25" maxlength="30" /></td>
  </tr>
  <tr>
   <th align="right">書名:</th>
   <td><input type="text" name="title" size="35" maxlength="170" /></td>
  </tr>
  <tr>
   <th align="right">価格:</th>
   <td><input type="text" name="price" size="5" maxlength="5" /></td>
  </tr>
  <tr>
   <th align="right">出版社:</th>
   <td><input type="text" name="publish" size="15" maxlength="20" /></td>
  </tr>
  <tr>
   <th align="right">配本日:</th>
   <td><input type="text" name="published" size="15" maxlength="15" /></td>
  </tr>
  <tr>
   <td colspan="2">
    <input type="submit" value="登録" />
    <input type="reset" value="クリア" />
   </td>
  </tr>
 </table>
 </form>
 </body>
 </html>
