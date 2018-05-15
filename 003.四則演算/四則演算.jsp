<%-- 
    Document   : java1
    Created on : 2018/05/13, 14:15:58
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        

     <%
      final int A=100;
      int B=2;
     
      //足し算 
      int tasu=A+B;
      out.print(A+B);
      out.print("<br>");
      //引き算
      int hiki=A-B;
      out.print(A-B);
      out.print("<br>");
      //掛け算
      int kake=A*B;
      out.print(A*B);
      out.print("<br>");
      //割り算
      int wari=A/B;
      out.print(A/B);
      out.print("<br>");
       
       
        
    
    
    
    


        %>
    </body>
</html>
