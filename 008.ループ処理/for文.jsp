<%-- 
    Document   : for文
    Created on : 2018/05/22, 10:44:21
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//8 の 20 乗を計算し，計算結果を表示してください。この計算は，for文によって実現してください
int total=1;
for(int i=0;i<20;i++){
    total=total*8;
}

out.print(total);

 out.print("<br>");

int answer = 1;

          for( int i=0; i<10; i++ ){ 
               answer = answer * 8; 
          } 

   out.print(answer);

%>





