<%@ page contentType="text/html;charset=UTF-8" %>
<%! int i = 0; %>
<%
int tmp = i +1; //いったん変数iの内容を変数tmpに退避
Thread.sleep(3000); //3秒(3000ミリ秒)だけ処理休止
i = tmp; //変数tmpの内容を変数iに書き戻す
out.println(i + "回目のアクセスです");
%>