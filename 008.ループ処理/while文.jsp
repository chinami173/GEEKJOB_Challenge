<%-- 
    Document   : while文
    Created on : 2018/05/22, 13:18:36
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//変数を宣言し，その値を数値型の 1000 としてください。また，while 文を利用して，
//変数の値を 2 で割り続け，割った結果が 100 より小さくなったらループを抜ける処理を記述してください。 
//ループ後に変数の値を画面に表示し，処理結果が正しいことを確認してください。

float a=1000;
while(a<100==false){
    a=a/2;
}

out.print(a);


%>
