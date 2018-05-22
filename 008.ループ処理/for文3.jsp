<%-- 
    Document   : for文3
    Created on : 2018/05/22, 11:54:33
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//変数を宣言し，その値を 0 から 100 までの合計値にしてください。そして，その変数の値を画面に表示してください。
//このとき，変数の値は，for文を利用して， 0 から始まる数値を順番に足しこむことで得るものとします。

int total=0;

for(int i=0;i<=100;i++){
    total=total+i;
}

out.print(total);







%>
