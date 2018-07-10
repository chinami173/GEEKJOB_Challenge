<%-- 
    Document   : HTMLのタグについて
    Created on : 2018/07/10, 10:54:07
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
        request.setCharacterEncoding("UTF-8");
        out.print(request.getParameter("email"));out.print("<br>");
        out.print(request.getParameter("date"));out.print("<br>");
        out.print(request.getParameter("pass").replaceAll("[0-9a-zA-Z!?]","*"));out.print("<br>");
        out.print(request.getParameter("pull-down"));out.print("<br>");
        

       %>
    </body>
</html>
